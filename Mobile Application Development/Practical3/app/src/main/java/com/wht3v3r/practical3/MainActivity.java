package com.wht3v3r.practical3;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button submitButton, datePicker, timePicker;
    EditText nameBox, passwordBox, emailBox, contactBox, addressBox;
    RadioGroup genderSelect;
    Spinner countrySelect, stateSelect;

    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;

    String selectedCountry, selectedState, selectedGender, selectedDate = "0", selectedTime = "0";
    String[] country = {"Select your country", "England", "India", "United States of America"};
    List<String> state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameBox = findViewById(R.id.nameBox);
        passwordBox = findViewById(R.id.passwordBox);
        emailBox = findViewById(R.id.emailBox);
        contactBox = findViewById(R.id.contactBox);
        addressBox = findViewById(R.id.addressBox);

        genderSelect = findViewById(R.id.genderBox);

        countrySelect = findViewById(R.id.countryBox);
        stateSelect = findViewById(R.id.stateBox);

        submitButton = findViewById(R.id.submitButton);
        datePicker = findViewById(R.id.dateSelect);
        timePicker = findViewById(R.id.timeSelect);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, country);
        countrySelect.setAdapter(countryAdapter);

        countrySelect.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectedCountry = country[i];
                switch (country[i]) {
                    case "India": {
                        state = new ArrayList<>(Arrays.asList("Select your state", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry"));
                        ArrayAdapter<String> stateAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, state);
                        stateSelect.setAdapter(stateAdapter);
                        break;
                    }

                    case "England": {
                        state = new ArrayList<>(Arrays.asList("Select your state", "Avon", "Bedfordshire", "Berkshire", "Buckinghamshire", "Cambridgeshire", "Cheshire", "Cleveland", "Cornwall", "Cumbria", "Derbyshire", "Devon", "Dorset", "Durham", "East Sussex", "Essex", "Gloucestershire", "Hampshire", "Herefordshire", "Hertfordshire", "Isle of Wight", "Kent", "Lancashire", "Leicestershire", "Lincolnshire", "London", "Merseyside", "Middlesex", "Norfolk", "Northamptonshire", "Northumberland", "North Humberside", "North Yorkshire", "Nottinghamshire", "Oxfordshire", "Rutland", "Shropshire", "Somerset", "South Humberside", "South Yorkshire", "Staffordshire", "Suffolk", "Surrey", "Tyne and Wear", "Warwickshire", "West Midlands", "West Sussex", "West Yorkshire", "Wiltshire", "Worcestershire"));
                        ArrayAdapter<String> stateAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, state);
                        stateSelect.setAdapter(stateAdapter);
                        break;
                    }

                    case "United States of America": {
                        state = new ArrayList<>(Arrays.asList("Select your state", "Alaska", "Alabama", "Arkansas", "American Samoa", "Arizona", "California", "Colorado", "Connecticut", "District of Columbia", "Delaware", "Florida", "Georgia", "Guam", "Hawaii", "Iowa", "Idaho", "Illinois", "Indiana", "Kansas", "Kentucky", "Louisiana", "Massachusetts", "Maryland", "Maine", "Michigan", "Minnesota", "Missouri", "Mississippi", "Montana", "North Carolina", "North Dakota", "Nebraska", "New Hampshire", "New Jersey", "New Mexico", "Nevada", "New York", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Puerto Rico", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Virginia", "Virgin Islands", "Vermont", "Washington", "Wisconsin", "West Virginia", "Wyoming"));
                        ArrayAdapter<String> stateAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, state);
                        stateSelect.setAdapter(stateAdapter);
                        break;
                    }

                    default: {
                        state = new ArrayList<>(Arrays.asList("Select your state"));
                        ArrayAdapter<String> stateAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, state);
                        stateSelect.setAdapter(stateAdapter);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        stateSelect.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectedState = state.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        datePicker.setOnClickListener(view -> {
            datePickerDialog = new DatePickerDialog(MainActivity.this);
            datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
            datePickerDialog.show();

            datePickerDialog.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datepicker, int year, int month, int day) {
                    selectedDate = day + "/" + (month + 1) + "/" + year;
                    datePicker.setText(selectedDate);
                }
            });
        });

        timePicker.setOnClickListener(view -> {
            timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timepicker, int hour, int minute) {
                    selectedTime = hour + ":" + minute;
                    timePicker.setText(selectedTime);
                }
            }, 0, 0, false);
            timePickerDialog.show();
        });

        submitButton.setOnClickListener(view -> {
           if(validate()) {
               startActivity(myIntention());
           }
        });
    }



    public Intent myIntention() {
        Intent intent = new Intent(MainActivity.this, AfterLogin.class);
        intent.putExtra("name", nameBox.getText().toString());
        intent.putExtra("email", emailBox.getText().toString());
        intent.putExtra("gender", selectedGender);
        intent.putExtra("birthTime", selectedTime);
        intent.putExtra("birthDate", selectedDate);
        intent.putExtra("address", addressBox.getText().toString());
        intent.putExtra("contact", contactBox.getText().toString());
        intent.putExtra("country", selectedCountry);
        intent.putExtra("state", selectedState);

        return intent;
    }

    private boolean validate() {
        if(nameBox.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
            return false;
        } else if(passwordBox.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show();
            return false;
        } else if(emailBox.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your Email Address", Toast.LENGTH_SHORT).show();
            return false;
        } else if(contactBox.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your contact number", Toast.LENGTH_SHORT).show();
            return false;
        } else if(addressBox.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter your Address", Toast.LENGTH_SHORT).show();
            return false;
        } else if(selectedCountry.equals("Select your country")) {
            Toast.makeText(this, "Please select your country", Toast.LENGTH_SHORT).show();
            return false;
        } else if(selectedState.equals("Select your state")) {
            Toast.makeText(this, "Please select your state", Toast.LENGTH_SHORT).show();
            return false;
        } else if(selectedTime.equals("0")) {
            Toast.makeText(this, "Please select your Birth time", Toast.LENGTH_SHORT).show();
            return false;
        } else if(selectedDate.equals("0")) {
            Toast.makeText(this, "Please select your Date of Birth", Toast.LENGTH_SHORT).show();
            return false;
        }

        switch (genderSelect.getCheckedRadioButtonId()) {
            case R.id.male: {
                selectedGender = "Male";
                break;
            }
            case R.id.female: {
                selectedGender = "Female";
                break;
            }
            default: {
                Toast.makeText(MainActivity.this, "Please select a gender", Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        return true;
    }
}
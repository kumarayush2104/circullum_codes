package com.amtics.practical13;

import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Date;

public class Register extends AppCompatActivity {

    EditText username;
    RadioGroup genderSelect;
    Button submit, dateSelect;
    String gender, date = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        username = findViewById(R.id.emailBox);
        genderSelect = findViewById(R.id.genderBox);
        dateSelect = findViewById(R.id.dateSelect);
        submit = findViewById(R.id.submit);
        SharedPreferences.Editor myPreference = getSharedPreferences("myData", MODE_PRIVATE).edit();
        dateSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePicker = new DatePickerDialog(Register.this);
                datePicker.getDatePicker().setMaxDate(new Date().getTime());
                datePicker.show();

                datePicker.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        date = day + "/" + month + "/" + year;
                        dateSelect.setText(date);
                    }
                });
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (genderSelect.getCheckedRadioButtonId()){
                    case R.id.male:
                        gender = "Male";
                        break;
                    case R.id.female:
                        gender = "Female";
                        break;
                    default:
                        gender = "";
                }
                if(validate()) {
                    myPreference.putString("gender", gender);
                    myPreference.putString("dob", date);
                    myPreference.putString("email", username.getText().toString());
                    myPreference.putBoolean("login", true);
                    myPreference.commit();
                    finish();
                }
            }
        });
    }

    protected boolean validate() {
        if(username.getText().toString().isEmpty()){
            toast("Enter your Username");
            return false;
        } else if(gender.isEmpty()) {
            toast("Select your Gender");
            return false;
        } else if(date.isEmpty()) {
            toast("Select your Date of Birth");
        }
        return true;
    }

    protected void toast(String arg) {
        Toast.makeText(Register.this, arg, Toast.LENGTH_SHORT).show();
    }
}

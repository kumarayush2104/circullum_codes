package com.wht3v3r.practical3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AfterLogin extends AppCompatActivity {

    TextView nameBox, emailBox, contactBox, addressBox, birthTime, birthDate, genderBox, countryBox, stateBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_login);

        nameBox = findViewById(R.id.username);
        emailBox = findViewById(R.id.email);
        contactBox = findViewById(R.id.contact);
        addressBox = findViewById(R.id.address);
        birthDate = findViewById(R.id.birthDate);
        birthTime = findViewById(R.id.birthTime);
        genderBox = findViewById(R.id.gender);
        countryBox = findViewById(R.id.country);
        stateBox = findViewById(R.id.state);

        nameBox.setText(getIntent().getStringExtra("name"));
        emailBox.setText(getIntent().getStringExtra("email"));
        contactBox.setText(getIntent().getStringExtra("contact"));
        genderBox.setText(getIntent().getStringExtra("gender"));
        addressBox.setText(getIntent().getStringExtra("address"));
        countryBox.setText(getIntent().getStringExtra("country"));
        stateBox.setText(getIntent().getStringExtra("state"));
        birthTime.setText(getIntent().getStringExtra("birthTime"));
        birthDate.setText(getIntent().getStringExtra("birthDate"));
    }
}
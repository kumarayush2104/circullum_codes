package com.amtics.practical13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {

    TextView name, dob, gender;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        name = findViewById(R.id.name);
        dob = findViewById(R.id.dob);
        gender = findViewById(R.id.gender);

        logout = findViewById(R.id.logout);
        SharedPreferences  myPreference = getSharedPreferences("myData", MODE_PRIVATE);

        name.setText(name.getText() + myPreference.getString("email", ""));
        dob.setText(dob.getText() + myPreference.getString("dob", ""));
        gender.setText(gender.getText() + myPreference.getString("gender", ""));

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPreference.edit().remove("login").commit();
                finish();
            }
        });
    }
}
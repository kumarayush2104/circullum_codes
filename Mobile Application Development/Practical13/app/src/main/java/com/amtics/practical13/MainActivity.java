package com.amtics.practical13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(getSharedPreferences("myData", MODE_PRIVATE).getBoolean("login", false)) {
            startActivity(new Intent(MainActivity.this, home.class));
        } else {
            startActivity(new Intent(MainActivity.this, Register.class));
        }
    }
}
package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void backButton(View view) {
        setContentView(R.layout.activity_main);
    }

    public void changeLayout(View view) {
        switch (view.getId()) {
            case R.id.constraint: {
                setContentView(R.layout.constraint_layout);
                break;
            }

            case R.id.vertical: {
                setContentView(R.layout.linear_vertical);
                break;
            }

            case R.id.horizontal: {
                setContentView(R.layout.linear_horizontal);
                break;
            }
            
            case R.id.toast: {
                Toast.makeText(this, "Hello, welcome to Android Lab", Toast.LENGTH_SHORT).show();
                break;
            }

            case R.id.relative: {
                setContentView(R.layout.relative_layout);
                break;
            }
        }
    }
}
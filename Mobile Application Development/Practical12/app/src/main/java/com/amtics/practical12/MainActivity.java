package com.amtics.practical12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.toggleButton);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (button.isChecked()) {
                                Toast.makeText(MainActivity.this, "This is a Toast Message", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    try {
                        Thread.sleep(3000);
                    } catch (Exception ex) {
                    }
                }
            }
        });

        thread.start();
    }
}
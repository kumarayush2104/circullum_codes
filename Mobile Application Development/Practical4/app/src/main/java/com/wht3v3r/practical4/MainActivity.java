package com.wht3v3r.practical4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText searchbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchbar = findViewById(R.id.search_bar);
    }

    public void intention(View view) {
        if(searchbar.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Enter something in Search Area", Toast.LENGTH_SHORT).show();
        } else {
            switch (view.getId()) {
                case R.id.browserButton: {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + searchbar.getText().toString()));
                    startActivity(intent);
                    break;
                }
                case R.id.mapsButton: {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.co.in/maps?q=" + searchbar.getText()));
                    intent.setPackage("com.google.android.apps.maps");
                    startActivity(intent);
                    break;
                }

                case R.id.conButton: {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:" + searchbar.getText()));
                    startActivity(intent);
                    break;
                }
            }
        }
    }
}
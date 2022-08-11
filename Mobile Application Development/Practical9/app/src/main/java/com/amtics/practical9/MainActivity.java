package com.amtics.practical9;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button progressTrigger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressTrigger = findViewById(R.id.ProgressTrigger);

        progressTrigger.setOnClickListener(new View.OnClickListener() {
            Integer i = 0;

            @Override
            public void onClick(View view) {

                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setProgress(0);
                progressDialog.setMax(85);
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog.setTitle("Loading");

                new AsyncTask<Integer, Void, Void>() {

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        progressDialog.show();
                    }

                    @Override
                    protected Void doInBackground(Integer... objects) {
                        while(i<85) {
                            progressDialog.setProgress(i++);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {}
                        }
                        return null;
                    }

                    @Override
                    protected void onPostExecute(Void object) {
                        super.onPostExecute(object);
                        progressDialog.dismiss();
                    }


                }.execute();
            }
        });
    }
}
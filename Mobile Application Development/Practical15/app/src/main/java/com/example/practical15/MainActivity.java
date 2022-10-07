package com.example.practical15;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button clickPicture, recordVideo;
    ToggleButton playMusic;
    ImageView preview;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickPicture = findViewById(R.id.picture);
        recordVideo = findViewById(R.id.videoRecorder);
        playMusic = findViewById(R.id.music);
        preview = findViewById(R.id.preview);
        videoView = findViewById(R.id.videoView);
    }

    @Override
    protected void onStart() {
        super.onStart();

        clickPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MediaStore.ACTION_IMAGE_CAPTURE), 1);
            }
        });

        recordVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.setVisibility(View.VISIBLE);
                startActivityForResult(new Intent(MediaStore.ACTION_VIDEO_CAPTURE), 3);
            }
        });

        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Service.class);
                if(playMusic.isChecked()) {
                    startService(intent);
                } else {
                    stopService(intent);
                }

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data != null) {
            if (requestCode == 1) {
                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                preview.setImageBitmap(bitmap);
                videoView.setVisibility(View.INVISIBLE);

            } else if (requestCode == 3) {
                Uri uri = (Uri) data.getData();
                videoView.setVideoURI(uri);
                videoView.start();
            }
        }
    }
}
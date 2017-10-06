package com.popland.pop.soundbutton;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnMP3, btnWAV,btnStop, btnPause;
    MediaPlayer song1, song2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        btnMP3 = (Button)findViewById(R.id.BTNmp3);
        btnWAV = (Button)findViewById(R.id.BTNwav);
        btnStop = (Button)findViewById(R.id.BTNstop);
        btnPause = (Button)findViewById(R.id.BTNpause);

        btnMP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //step1: vào Project/app/src/res tạo new/directory tên raw chứa file âm thanh
                //step2:sửa tên file(k có số và blank,chữ thường) và kéo vào raw
                song1 = MediaPlayer.create(MainActivity.this, R.raw.go);// k có new
                song1.start();//hai dòng code này phải đi cùng nhau
            }
        });
        btnWAV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song2 = MediaPlayer.create(MainActivity.this, R.raw.hoho);
                song2.start();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song2.stop();//MediaPlayer phải dc start trước, nếu k sẽ có lỗi
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song2.pause();//stop & pause có cùng chức năng
            }
        });
    }
//tạo  icon cho app: move ảnh .xml hoặc .png vào mipmap phù hợp độ phân giải của máy
//sửa tên icon trong AndroidManifest.xml
}

package com.example.kanchicoder.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button []btn = new Button[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn[0] = (Button) findViewById(R.id.transport);
        btn[1] = (Button) findViewById(R.id.library);
        btn[2] = (Button) findViewById(R.id.player);
        btn[3] = (Button) findViewById(R.id.score);
        btn[4] = (Button) findViewById(R.id.reader);
        for(int i = 0; i < 5; ++i)
            btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    click(v);
                }
            });
    }
    public void click(View v) {
        switch (v.getId()) {
            case R.id.transport:
                Toast.makeText(getApplicationContext(),"You are logging in IIIT-A Transport",Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(getApplicationContext(),"You are logging in Library App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.player:
                Toast.makeText(getApplicationContext(),"You are logging in Spotify Streamer",Toast.LENGTH_SHORT).show();
                break;
            case R.id.score:
                Toast.makeText(getApplicationContext(),"You are logging in Score App",Toast.LENGTH_SHORT).show();break;
            case R.id.reader:
                Toast.makeText(getApplicationContext(),"You are logging in Ebook Reader",Toast.LENGTH_SHORT).show();
        }
    }
}

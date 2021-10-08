package com.example.hf2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Status","onCreate() Activity 1");

        TextView tv = findViewById(R.id.textview1);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("\n" + tv.getText());
            }
        });
        Button kep2Gomb = findViewById(R.id.secondScreenButton);
        kep2Gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toScreen2 = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(toScreen2);
            }
        });
   }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Status","onStart()) Activity 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Status","onStop()) Activity 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Status","onDestroy()) Activity 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Status","onResume()) Activity 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Status","onPause()) Activity 1");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Status","onRestart()) Activity 1");
    }
}
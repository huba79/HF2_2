package com.example.hf2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Log.d("Status","onCreate() Activity 3");

        Button homeGomb2 = findViewById(R.id.homeButtonScreen3);
        /* a lambda kifejezest hasznaljuk a gomb3 onClick metodusara */
        homeGomb2.setOnClickListener(view -> {
            Intent intent4 = new Intent(ActivityThree.this, MainActivity.class);
            startActivity(intent4);
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Status","onStart() Activity 3");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Status","onStop() Activity 3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Status","onDestroy() Activity 3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Status","onResume() Activity 3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Status","onPause() Activity 3");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Status","onRestart() Activity 3");
    }
}
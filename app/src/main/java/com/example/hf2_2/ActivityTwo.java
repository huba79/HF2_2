package com.example.hf2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Log.d("Status","onCreate() Activity 2");

        Button homeGomb1 = findViewById(R.id.homeButtonScreen2);
        /* kiprobaljuk a lambda kifejezest a gomb onClick metodusara */
        homeGomb1.setOnClickListener(view -> {
            Intent toHomeScreen1 = new Intent(ActivityTwo.this, MainActivity.class);
            startActivity(toHomeScreen1);
        });

        Button kep3Gomb = findViewById(R.id.thirdScreenButton);
        /* kiprobaljuk a lambda kifejezest a gomb onClick metodusara */
        kep3Gomb.setOnClickListener(view -> {
            Intent toScreen3 = new Intent(ActivityTwo.this, ActivityThree.class);
            startActivity(toScreen3);
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Status","onStart() Activity 2");
      //  ( (TextView) findViewById(R.id.textview1)).append("Logged: onStart() Activity 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Status","onStop() Activity 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Status","onDestroy() Activity 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Status","onResume() Activity 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Status","onPause() Activity 2");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Status","onRestart() Activity 2");
    }
}
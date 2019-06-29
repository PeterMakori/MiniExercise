package com.example.enrico.miniexercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchScreen1(View view) {
        startActivity(new Intent(this, ScreenOne.class));
    }

    public void launchScreen2(View view) {
        startActivity(new Intent(this, ScreenTwo.class));
    }

    public void launchScreen3(View view) {
        startActivity(new Intent(this, ScreenThree.class));
    }
}

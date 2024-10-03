package com.example.losowanieliczby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void losuj(View view) {
        //view.setVisibility(View.INVISIBLE);  ńjewidzialność
        TextView textViewLiczba = findViewById(R.id.textView);
        int liczba = (int)(Math.random()*100+1);
        textViewLiczba.setText(String.valueOf(liczba));
        Toast.makeText(this, "Wylosowano liczbę", Toast.LENGTH_SHORT).show();
    }
}
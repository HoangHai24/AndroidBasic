package com.example.androidbasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button1 = (Button) this.findViewById(R.id.button1);
        this.button2 = (Button) this.findViewById(R.id.button2);
        this.button3 = (Button) this.findViewById(R.id.button3);
        this.button4 = (Button) this.findViewById(R.id.button4);


        // Called when the user clicks the button1.
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, ExActivity1.class);
                myIntent.putExtra("text1",  "This is text1 sent from MainActivity at " + new Date());
                myIntent.putExtra("text2",  "This is text2 sent from MainActivity at " + new Date());
                MainActivity.this.startActivity(myIntent);
            }

        });
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, ExActivity2.class);
                MainActivity.this.startActivity(myIntent);
            }

        });
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, ExActivity3.class);
                MainActivity.this.startActivity(myIntent);
            }

        });
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, ExActivity4.class);
                MainActivity.this.startActivity(myIntent);
            }

        });
    }
}
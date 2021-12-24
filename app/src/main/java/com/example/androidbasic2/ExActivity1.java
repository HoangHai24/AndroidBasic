package com.example.androidbasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExActivity1 extends AppCompatActivity {

    private Button buttonClickMe;
    private Button buttonBack;
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        this.textView1 = (TextView) this.findViewById(R.id.textView1);
        this.textView2 = (TextView) this.findViewById(R.id.textView2);
        this.buttonClickMe = (Button) this.findViewById(R.id.buttonClickMe);
        this.buttonBack = (Button) this.findViewById(R.id.buttonBack);

        Intent intent = getIntent();

        String value1 = intent.getStringExtra("text1");
        String value2 = intent.getStringExtra("text2");

        this.textView1.setText(value1);
//        this.textView1.setText(value2);

        this.buttonClickMe.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                textView2.setText("You click button");

            }
        });

        this.buttonClickMe.setOnLongClickListener(new Button.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                textView2.setText("You long click button");
                return true;
            }
        });

        this.buttonBack.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                ExActivity1.this.finish();
            }
        });
    }
}
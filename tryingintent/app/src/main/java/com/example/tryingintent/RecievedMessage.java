package com.example.tryingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class RecievedMessage extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.message);
        textView.setText(intent.getStringExtra(EXTRA_MESSAGE).toString());
    }
}
package com.example.tryingintent;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view){
        EditText editText = (EditText) findViewById(R.id.message);
        String messagetext = editText.getText().toString();
        Intent intent = new Intent(this,RecievedMessage.class);
        intent.putExtra(RecievedMessage.EXTRA_MESSAGE,messagetext);
        startActivity(intent);
    }
}


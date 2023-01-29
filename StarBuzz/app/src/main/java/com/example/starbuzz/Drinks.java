package com.example.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Drinks extends AppCompatActivity {

    public final static String DRINK_ID = "dink_id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        TextView textViewName = (TextView) findViewById(R.id.name);
        TextView textViewDescription = (TextView) findViewById(R.id.description);

        int drinkNo = (Integer) getIntent().getExtras().get(DRINK_ID);

        Drink drink = Drink.drinks[drinkNo];

        textViewName.setText(drink.toString());
        textViewDescription.setText(drink.getDescription());
    }
}
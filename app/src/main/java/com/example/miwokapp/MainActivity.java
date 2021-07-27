package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listener for numbers

        TextView numbers = (TextView) findViewById(R.id.Numbers);
        numbers.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
            });

        //listener for family

        TextView family = (TextView) findViewById(R.id.Family);
        family.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        //listener for colors

        TextView colors = (TextView) findViewById(R.id.Colors);
        colors.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent colorsIntent=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        //listener for phrases

        TextView phrases=(TextView) findViewById(R.id.Phrases);
        phrases.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent phrasesIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        }

}

package com.example.gao.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                openNumbersList(v);
            }
        });
        TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                openFamilyList(v);
            }
        });
        TextView colors = (TextView)findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                openColorsList(v);
            }
        });
        TextView phrases = (TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener(){

            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                openPhrasesList(v);
            }
        });

    }

    public void openNumbersList(View view) {
        Intent i = new Intent(this,NumbersActivity.class);
        startActivity(i);
    }

    public void openFamilyList(View view) {
        Intent i = new Intent(this,FamilyActivity.class);
        startActivity(i);
    }

    public void openColorsList(View view) {
        Intent i = new Intent(this,ColorsActivity.class);
        startActivity(i);
    }

    public void openPhrasesList(View view) {
        Intent i = new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }
}

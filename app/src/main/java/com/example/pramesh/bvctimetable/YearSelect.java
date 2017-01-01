package com.example.pramesh.bvctimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class YearSelect extends AppCompatActivity {

    Button firstYear;
    Button secondYear;
    Button thirdYear;
    Button fourthYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_select);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //Getting value1 from previous activity ...

        final String value1get = getIntent().getStringExtra("value1");

        firstYear = (Button) findViewById(R.id.firstYear);
        secondYear = (Button) findViewById(R.id.secondYear);
        thirdYear = (Button) findViewById(R.id.thirdYear);
        fourthYear = (Button) findViewById(R.id.forthYear);

        firstYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(YearSelect.this,SemesterSelect.class);
                nextIntent.putExtra("value2",value1get+"first");
                startActivity(nextIntent);
            }
        });

        secondYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(YearSelect.this,SemesterSelect.class);
                nextIntent.putExtra("value2",value1get+"second");
                startActivity(nextIntent);
            }
        });

        thirdYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(YearSelect.this,SemesterSelect.class);
                nextIntent.putExtra("value2",value1get+"third");
                startActivity(nextIntent);
            }
        });

        fourthYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(YearSelect.this,SemesterSelect.class);
                nextIntent.putExtra("value2",value1get+"fourth");
                startActivity(nextIntent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


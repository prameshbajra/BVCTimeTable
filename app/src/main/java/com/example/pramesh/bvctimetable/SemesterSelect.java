package com.example.pramesh.bvctimetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SemesterSelect extends AppCompatActivity {

    private Button semesterFirst,semesterSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_select);

        Bundle bundle = getIntent().getExtras();
        final String valueGet = bundle.getString("value2");

        semesterFirst = (Button) findViewById(R.id.section_a);
        semesterSecond = (Button) findViewById(R.id.section_b);

        semesterFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(SemesterSelect.this,SectionSelect.class);
                nextIntent.putExtra("value",valueGet+"first");
                startActivity(nextIntent);
            }
        });

        semesterSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(SemesterSelect.this,SectionSelect.class);
                nextIntent.putExtra("value",valueGet+"second");
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

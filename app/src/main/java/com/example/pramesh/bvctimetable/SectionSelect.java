package com.example.pramesh.bvctimetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class SectionSelect extends AppCompatActivity {

    private Button section_a, section_b, section_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_select);

//        Getting Values from Previous activity

        Bundle bub = getIntent().getExtras();
        final String value = bub.getString("value");

        section_a = (Button) findViewById(R.id.section_a);
        section_b = (Button) findViewById(R.id.section_b);
        section_c = (Button) findViewById(R.id.section_c);

        section_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (value) {
                    case "csefirstfirst":
                    case "csefirstsecond":
                    case "csesecondfirst":
                    case "csesecondsecond":
                    case "csethirdfirst":
                    case "csethirdsecond":
                        Intent newIntent = new Intent(SectionSelect.this,CseTable.class);
                        startActivity(newIntent);
                        break;
                    case "csefourthfirst":
                    case "csefourthsecond":
                }
            }
        });

        section_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SectionSelect.this, "Not Ready Yet", Toast.LENGTH_SHORT).show();
            }
        });

        section_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SectionSelect.this, "Not Ready Yet. Please Stay Tuned As this will be upadted soon!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

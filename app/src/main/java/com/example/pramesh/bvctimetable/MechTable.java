package com.example.pramesh.bvctimetable;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MechTable extends AppCompatActivity {

    private TextView mondayFirst, mondaySecond, mondayThird, mondayFourth, mondayFifth, mondaySixth, mondaySeventh;
    private TextView tuesdayFirst, tuesdaySecond, tuesdayThird, tuesdayFourth, tuesdayFifth, tuesdaySixth, tuesdaySeventh;
    private TextView wednesdayFirst, wednesdaySecond, wednesdayThird, wednesdayFourth, wednesdayFifth, wednesdaySixth, wednesdaySeventh;
    private TextView thrusdayFirst, thrusdaySecond, thrusdayThird, thrusdayFourth, thrusdayFifth, thrusdaySixth, thrusdaySeventh;
    private TextView fridayFirst, fridaySecond, fridayThird, fridayFourth, fridayFifth, fridaySixth, fridaySeventh;
    private TextView saturdayFirst, saturdaySecond, saturdayThird, saturdayFourth, saturdayFifth, saturdaySixth, saturdaySeventh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech_table);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mondayFirst = (TextView) findViewById(R.id.mondayFirst);
        mondaySecond = (TextView) findViewById(R.id.mondaySecond);
        mondayThird = (TextView) findViewById(R.id.mondayThird);
        mondayFourth = (TextView) findViewById(R.id.mondayFourth);
        mondayFifth = (TextView) findViewById(R.id.mondayFifth);
        mondaySixth = (TextView) findViewById(R.id.mondaySixth);
        mondaySeventh = (TextView) findViewById(R.id.mondaySeventh);

        tuesdayFirst = (TextView) findViewById(R.id.tuesdayFirst);
        tuesdaySecond = (TextView) findViewById(R.id.tuesdaySecond);
        tuesdayThird = (TextView) findViewById(R.id.tuesdayThird);
        tuesdayFourth = (TextView) findViewById(R.id.tuesdayFourth);
        tuesdayFifth = (TextView) findViewById(R.id.tuesdayFifth);
        tuesdaySixth = (TextView) findViewById(R.id.tuesdaySixth);
        tuesdaySeventh = (TextView) findViewById(R.id.tuesdaySeventh);

        wednesdayFirst = (TextView) findViewById(R.id.wednesdayFirst);
        wednesdaySecond = (TextView) findViewById(R.id.wednesdaySecond);
        wednesdayThird = (TextView) findViewById(R.id.wednesdayThird);
        wednesdayFourth = (TextView) findViewById(R.id.wednesdayFourth);
        wednesdayFifth = (TextView) findViewById(R.id.wednesdayFifth);
        wednesdaySixth = (TextView) findViewById(R.id.wednesdaySixth);
        wednesdaySeventh = (TextView) findViewById(R.id.wednesdaySeventh);

        thrusdayFirst = (TextView) findViewById(R.id.thursdayFirst);
        thrusdaySecond = (TextView) findViewById(R.id.thrusdaySecond);
        thrusdayThird = (TextView) findViewById(R.id.thrusdayThird);
        thrusdayFourth = (TextView) findViewById(R.id.thrusdayFourth);
        thrusdayFifth = (TextView) findViewById(R.id.thrusdayFifth);
        thrusdaySixth = (TextView) findViewById(R.id.thrusdaySixth);
        thrusdaySeventh = (TextView) findViewById(R.id.thrusdaySeventh);

        fridayFirst = (TextView) findViewById(R.id.fridayFirst);
        fridaySecond = (TextView) findViewById(R.id.fridaySecond);
        fridayThird = (TextView) findViewById(R.id.fridayThird);
        fridayFourth = (TextView) findViewById(R.id.fridayFourth);
        fridayFifth = (TextView) findViewById(R.id.fridayFifth);
        fridaySixth = (TextView) findViewById(R.id.fridaySixth);
        fridaySeventh = (TextView) findViewById(R.id.fridaySeventh);

        saturdayFirst = (TextView) findViewById(R.id.saturdayFirst);
        saturdaySecond = (TextView) findViewById(R.id.saturdaySecond);
        saturdayThird = (TextView) findViewById(R.id.saturdayThird);
        saturdayFourth = (TextView) findViewById(R.id.saturdayFourth);
        saturdayFifth = (TextView) findViewById(R.id.saturdayFifth);
        saturdaySixth = (TextView) findViewById(R.id.saturdaySixth);
        saturdaySeventh = (TextView) findViewById(R.id.saturdaySeventh);


        //setting button clicks for all aaba.... starting from monday and on...

        //setting button clicks for all aaba.... starting from monday and on...

        mondayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = "And";
                alertDial(value);
            }
        });

        mondaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondaySecond.getText().toString();
                alertDial(value);
            }
        });

        mondayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondayThird.getText().toString();
                alertDial(value);
            }
        });

        mondayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondayFourth.getText().toString();
                alertDial(value);
            }
        });

        mondayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondayFifth.getText().toString();
                alertDial(value);
            }
        });

        mondaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondaySixth.getText().toString();
                alertDial(value);
            }
        });

        mondaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondaySeventh.getText().toString();
                alertDial(value);
            }
        });

        // Now for tuesday ...

        tuesdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdayFirst.getText().toString();
                alertDial(value);
            }
        });

        tuesdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdaySecond.getText().toString();
                alertDial(value);
            }
        });

        tuesdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdayThird.getText().toString();
                alertDial(value);
            }
        });

        tuesdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdayFourth.getText().toString();
                alertDial(value);
            }
        });

        tuesdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdayFifth.getText().toString();
                alertDial(value);
            }
        });

        tuesdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdaySixth.getText().toString();
                alertDial(value);
            }
        });

        tuesdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdaySeventh.getText().toString();
                alertDial(value);
            }
        });

        // Setting up for wednesday Now ...

        wednesdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdayFirst.getText().toString();
                alertDial(value);
            }
        });

        wednesdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdaySecond.getText().toString();
                alertDial(value);
            }
        });

        wednesdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdayThird.getText().toString();
                alertDial(value);
            }
        });

        wednesdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdayFourth.getText().toString();
                alertDial(value);
            }
        });

        wednesdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdayFifth.getText().toString();
                alertDial(value);
            }
        });

        wednesdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdaySixth.getText().toString();
                alertDial(value);
            }
        });

        wednesdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdaySeventh.getText().toString();
                alertDial(value);
            }
        });

        // Setting up for thrusday Now ...

        thrusdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdayFirst.getText().toString();
                alertDial(value);
            }
        });

        thrusdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdaySecond.getText().toString();
                alertDial(value);
            }
        });

        thrusdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdayThird.getText().toString();
                alertDial(value);
            }
        });

        thrusdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdayFourth.getText().toString();
                alertDial(value);
            }
        });

        thrusdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdayFifth.getText().toString();
                alertDial(value);
            }
        });

        thrusdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdaySixth.getText().toString();
                alertDial(value);
            }
        });

        thrusdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdaySeventh.getText().toString();
                alertDial(value);
            }
        });

        // Setting up for friday Now ...

        fridayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridayFirst.getText().toString();
                alertDial(value);
            }
        });

        fridaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridaySecond.getText().toString();
                alertDial(value);
            }
        });

        fridayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridayThird.getText().toString();
                alertDial(value);
            }
        });

        fridayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridayFourth.getText().toString();
                alertDial(value);
            }
        });

        fridayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridayFifth.getText().toString();
                alertDial(value);
            }
        });

        fridaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridaySixth.getText().toString();
                alertDial(value);
            }
        });

        fridaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridaySeventh.getText().toString();
                alertDial(value);
            }
        });

        // Setting up for saturday Now ...

        saturdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdayFirst.getText().toString();
                alertDial(value);
            }
        });

        saturdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdaySecond.getText().toString();
                alertDial(value);
            }
        });

        saturdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdayThird.getText().toString();
                alertDial(value);
            }
        });

        saturdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdayFourth.getText().toString();
                alertDial(value);
            }
        });

        saturdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdayFifth.getText().toString();
                alertDial(value);
            }
        });

        saturdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdaySixth.getText().toString();
                alertDial(value);
            }
        });

        saturdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdaySeventh.getText().toString();
                alertDial(value);
            }
        });
    }

    public void alertDial(String value) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MechTable.this);
        builder.setTitle(value);
        builder.setMessage("");
        builder.setCancelable(true);
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        setTitle("Mechanical Department");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(MechTable.this);
        }
        return super.onOptionsItemSelected(item);
    }
}

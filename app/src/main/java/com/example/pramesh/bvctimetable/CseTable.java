package com.example.pramesh.bvctimetable;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;


public class CseTable extends AppCompatActivity {

    private TextView mondayFirst, mondaySecond, mondayThird, mondayForth, mondayFifth, mondaySixth, mondaySeventh;
    private TextView tuesdayFirst, tuesdaySecond, tuesdayThird, tuesdayFourth, tuesdayFifth, tuesdaySixth, tuesdaySeventh;
    private TextView wednesdayFirst, wednesdaySecond, wednesdayThird, wednesdayFourth, wednesdayFifth, wednesdaySixth, wednesdaySeventh;
    private TextView thrusdayFirst, thrusdaySecond, thrusdayThird, thrusdayFourth, thrusdayFifth, thrusdaySixth, thrusdaySeventh;
    private TextView fridayFirst, fridaySecond, fridayThird, fridayFourth, fridayFifth, fridaySixth, fridaySeventh;
    private TextView saturdayFirst, saturdaySecond, saturdayThird, saturdayFourth, saturdayFifth, saturdaySixth, saturdaySeventh;

    private DatabaseReference firebaseData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_table);

        firebaseData = FirebaseDatabase.getInstance().getReference().child("csetablethreetwoA");
        firebaseData.keepSynced(true);

        // Firebase stuff begins ...

        firebaseData.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Map<String, Object> map = (Map<String, Object>) dataSnapshot.getValue();

                // Setting up link with online data ...

                String mondayFirstData = (String) map.get("mondayFirst");
                String mondaySecondData = (String) map.get("mondaySecond");
                String mondayThirdData = (String) map.get("mondayThird");
                String mondayForthData = (String) map.get("mondayForth");
                String mondayFifthData = (String) map.get("mondayFifth");
                String mondaySixthData = (String) map.get("mondaySixth");
                String mondaySeventhData = (String) map.get("mondaySeventh");

                String tuesdayFirstData = (String) map.get("tuesdayFirst");
                String tuesdaySecondData = (String) map.get("tuesdaySecond");
                String tuesdayThirdData = (String) map.get("tuesdayThird");
                String tuesdayForthData = (String) map.get("tuesdayForth");
                String tuesdayFifthData = (String) map.get("tuesdayFifth");
                String tuesdaySixthData = (String) map.get("tuesdaySixth");
                String tuesdaySeventhData = (String) map.get("tuesdaySeventh");

                String wednesdayFirstData = (String) map.get("wednesdayFirst");
                String wednesdaySecondData = (String) map.get("wednesdaySecond");
                String wednesdayThirdData = (String) map.get("wednesdayThird");
                String wednesdayForthData = (String) map.get("wednesdayForth");
                String wednesdayFifthData = (String) map.get("wednesdayFifth");
                String wednesdaySixthData = (String) map.get("wednesdaySixth");
                String wednesdaySeventhData = (String) map.get("wednesdaySeventh");

                String thrusdayFirstData = (String) map.get("thrusdayFirst");
                String thrusdaySecondData = (String) map.get("thrusdaySecond");
                String thrusdayThirdData = (String) map.get("thrusdayThird");
                String thrusdayForthData = (String) map.get("thrusdayForth");
                String thrusdayFifthData = (String) map.get("thrusdayFifth");
                String thrusdaySixthData = (String) map.get("thrusdaySixth");
                String thrusdaySeventhData = (String) map.get("thrusdaySeventh");

                String fridayFirstData = (String) map.get("fridayFirst");
                String fridaySecondData = (String) map.get("fridaySecond");
                String fridayThirdData = (String) map.get("fridayThird");
                String fridayForthData = (String) map.get("fridayForth");
                String fridayFifthData = (String) map.get("fridayFifth");
                String fridaySixthData = (String) map.get("fridaySixth");
                String fridaySeventhData = (String) map.get("fridaySeventh");

                String saturdayFirstData = (String) map.get("saturdayFirst");
                String saturdaySecondData = (String) map.get("saturdaySecond");
                String saturdayThirdData = (String) map.get("saturdayThird");
                String saturdayForthData = (String) map.get("saturdayForth");
                String saturdayFifthData = (String) map.get("saturdayFifth");
                String saturdaySixthData = (String) map.get("saturdaySixth");
                String saturdaySeventhData = (String) map.get("saturdaySeventh");


                // Setting up actions for updation here on ...

                mondayFirst.setText(mondayFirstData);
                mondaySecond.setText(mondaySecondData);
                mondayThird.setText(mondayThirdData);
                mondayForth.setText(mondayForthData);
                mondayFifth.setText(mondayFifthData);
                mondaySixth.setText(mondaySixthData);
                mondaySeventh.setText(mondaySeventhData);

                tuesdayFirst.setText(tuesdayFirstData);
                tuesdaySecond.setText(tuesdaySecondData);
                tuesdayThird.setText(tuesdayThirdData);
                tuesdayFourth.setText(tuesdayForthData);
                tuesdayFifth.setText(tuesdayFifthData);
                tuesdaySixth.setText(tuesdaySixthData);
                tuesdaySeventh.setText(tuesdaySeventhData);

                wednesdayFirst.setText(wednesdayFirstData);
                wednesdaySecond.setText(wednesdaySecondData);
                wednesdayThird.setText(wednesdayThirdData);
                wednesdayFourth.setText(wednesdayForthData);
                wednesdayFifth.setText(wednesdayFifthData);
                wednesdaySixth.setText(wednesdaySixthData);
                wednesdaySeventh.setText(wednesdaySeventhData);

                thrusdayFirst.setText(thrusdayFirstData);
                thrusdaySecond.setText(thrusdaySecondData);
                thrusdayThird.setText(thrusdayThirdData);
                thrusdayFourth.setText(thrusdayForthData);
                thrusdayFifth.setText(thrusdayFifthData);
                thrusdaySixth.setText(thrusdaySixthData);
                thrusdaySeventh.setText(thrusdaySeventhData);

                fridayFirst.setText(fridayFirstData);
                fridaySecond.setText(fridaySecondData);
                fridayThird.setText(fridayThirdData);
                fridayFourth.setText(fridayForthData);
                fridayFifth.setText(fridayFifthData);
                fridaySixth.setText(fridaySixthData);
                fridaySeventh.setText(fridaySeventhData);

                saturdayFirst.setText(saturdayFirstData);
                saturdaySecond.setText(saturdaySecondData);
                saturdayThird.setText(saturdayThirdData);
                saturdayFourth.setText(saturdayForthData);
                saturdayFifth.setText(saturdayFifthData);
                saturdaySixth.setText(saturdaySixthData);
                saturdaySeventh.setText(saturdaySeventhData);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        // Firebase stuff ends ...

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Declaration part done here...

        mondayFirst = (TextView) findViewById(R.id.mondayFirst);
        mondaySecond = (TextView) findViewById(R.id.mondaySecond);
        mondayThird = (TextView) findViewById(R.id.mondayThird);
        mondayForth = (TextView) findViewById(R.id.mondayFourth);
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

        mondayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle("Android Training Lab");
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        mondaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle("Android Training Lab");
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        mondayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle("Android Training Lab");
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        mondayForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondayForth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setMessage("");
                builder.setTitle(value);
                builder.setCancelable(true);
                builder.show();
            }
        });

        mondayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondayFifth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        mondaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondaySixth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        mondaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mondaySeventh.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        // Now for tuesday ...

        tuesdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdayFirst.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        tuesdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdaySecond.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        tuesdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdayThird.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        tuesdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdayFourth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        tuesdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdayFifth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        tuesdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdaySixth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        tuesdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = tuesdaySeventh.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        // Setting up for wednesday Now ...

        wednesdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdayFirst.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        wednesdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdaySecond.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        wednesdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdayThird.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        wednesdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdayFourth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        wednesdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdayFifth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        wednesdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdaySixth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        wednesdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = wednesdaySeventh.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        // Setting up for thrusday Now ...

        thrusdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdayFirst.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        thrusdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdaySecond.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        thrusdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdayThird.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        thrusdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdayFourth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        thrusdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdayFifth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        thrusdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdaySixth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        thrusdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = thrusdaySeventh.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        // Setting up for friday Now ...

        fridayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridayFirst.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        fridaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridaySecond.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        fridayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridayThird.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        fridayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridayFourth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        fridayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridayFifth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        fridaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridaySixth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        fridaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = fridaySeventh.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        // Setting up for saturday Now ...

        saturdayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdayFirst.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        saturdaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdaySecond.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        saturdayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdayThird.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        saturdayFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdayFourth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        saturdayFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdayFifth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        saturdaySixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdaySixth.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });

        saturdaySeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = saturdaySeventh.getText().toString();
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle(value);
                builder.setMessage("");
                builder.setCancelable(true);
                builder.show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        setTitle("Computer Science Engineering");
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
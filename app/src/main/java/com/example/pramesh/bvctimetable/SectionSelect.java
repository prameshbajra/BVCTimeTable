package com.example.pramesh.bvctimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

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
                Intent nextIntent = null;

                switch (value) {
                    case "csefirstfirst":
                        nextIntent = new Intent(SectionSelect.this, CseFirstFirst.class);
                        break;
                    case "csefirstsecond":
                        nextIntent = new Intent(SectionSelect.this, CseFirstSecond.class);

                        break;
                    case "csesecondfirst":
                        nextIntent = new Intent(SectionSelect.this, CseSecondFirst.class);

                        break;
                    case "csesecondsecond":
                        nextIntent = new Intent(SectionSelect.this, CseSecondSecond.class);

                        break;
                    case "csethirdfirst":
                        nextIntent = new Intent(SectionSelect.this, CseThirdFirst.class);

                        break;
                    case "csethirdsecond":
                        nextIntent = new Intent(SectionSelect.this, CseTable.class);

                        break;
                    case "csefourthfirst":
                        nextIntent = new Intent(SectionSelect.this, CseFourthFirst.class);

                        break;
                    case "csefourthsecond":
                        nextIntent = new Intent(SectionSelect.this, CseForthSecond.class);

                        break;


                    case "mechfirstfirst":
                        nextIntent = new Intent(SectionSelect.this, MechFirstFirst.class);

                        break;
                    case "mechfirstsecond":
                        nextIntent = new Intent(SectionSelect.this, MechFirstSecond.class);

                        break;
                    case "mechsecondfirst":
                        nextIntent = new Intent(SectionSelect.this, MechSecondFirst.class);

                        break;
                    case "mechsecondsecond":
                        nextIntent = new Intent(SectionSelect.this, MechSecondSecond.class);

                        break;
                    case "mechthirdfirst":
                        nextIntent = new Intent(SectionSelect.this, MechThirdFirst.class);

                        break;
                    case "mechthirdsecond":
                        nextIntent = new Intent(SectionSelect.this, MechTable.class);

                        break;
                    case "mechfourthfirst":
                        nextIntent = new Intent(SectionSelect.this, MechFourthFirst.class);

                        break;
                    case "mechfourthsecond":
                        nextIntent = new Intent(SectionSelect.this, MechFourthSecond.class);

                        break;


                    case "civilfirstfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilFirstFirst.class);

                        break;
                    case "civilfirstsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilFirstSecond.class);

                        break;
                    case "civilsecondfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilSecondFirst.class);

                        break;
                    case "civilsecondsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilSecondSecond.class);

                        break;
                    case "civilthirdfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilThirdFirst.class);

                        break;
                    case "civilthirdsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilTable.class);

                        break;
                    case "civilfourthfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilFourthFirst.class);

                        break;
                    case "civilfourthsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilFourthSecond.class);

                        break;


                    case "eeefirstfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeFirstFirst.class);

                        break;
                    case "eeefirstsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeFirstSecond.class);

                        break;
                    case "eeesecondfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeSecondFirst.class);

                        break;
                    case "eeesecondsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeSecondSecond.class);

                        break;
                    case "eeethirdfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeThirdFirst.class);

                        break;
                    case "eeethirdsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeTable.class);

                        break;
                    case "eeefourthfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeFourthFirst.class);

                        break;
                    case "eeefourthsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeFourthSecond.class);

                        break;

                    case "ecefirstfirst":
                        nextIntent = new Intent(SectionSelect.this, EceFirstFirst.class);

                        break;
                    case "ecefirstsecond":
                        nextIntent = new Intent(SectionSelect.this, EceFirstSecond.class);

                        break;
                    case "ecesecondfirst":
                        nextIntent = new Intent(SectionSelect.this, EceSecondFirst.class);

                        break;
                    case "ecesecondsecond":
                        nextIntent = new Intent(SectionSelect.this, EceSecondSecond.class);

                        break;
                    case "ecethirdfirst":
                        nextIntent = new Intent(SectionSelect.this, EceThirdFirst.class);

                        break;
                    case "ecethirdsecond":
                        nextIntent = new Intent(SectionSelect.this, EceTable.class);

                        break;
                    case "ecefourthfirst":
                        nextIntent = new Intent(SectionSelect.this, EceFourthFirst.class);

                        break;
                    case "ecefourthsecond":
                        nextIntent = new Intent(SectionSelect.this, EceFourthSecond.class);

                        break;
                }
                nextIntent.putExtra("sectiondata", "sectionA");
                startActivity(nextIntent);
            }
        });

        section_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = null;
                switch (value) {
                    case "csefirstfirst":
                        nextIntent = new Intent(SectionSelect.this, CseFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "csefirstsecond":
                        nextIntent = new Intent(SectionSelect.this, CseFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "csesecondfirst":
                        nextIntent = new Intent(SectionSelect.this, CseSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "csesecondsecond":
                        nextIntent = new Intent(SectionSelect.this, CseSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "csethirdfirst":
                        nextIntent = new Intent(SectionSelect.this, CseThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "csethirdsecond":
                        nextIntent = new Intent(SectionSelect.this, CseTable.class);
                        startActivity(nextIntent);
                        break;
                    case "csefourthfirst":
                        nextIntent = new Intent(SectionSelect.this, CseFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "csefourthsecond":
                        nextIntent = new Intent(SectionSelect.this, CseForthSecond.class);
                        startActivity(nextIntent);
                        break;


                    case "mechfirstfirst":
                        nextIntent = new Intent(SectionSelect.this, MechFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "mechfirstsecond":
                        nextIntent = new Intent(SectionSelect.this, MechFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "mechsecondfirst":
                        nextIntent = new Intent(SectionSelect.this, MechSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "mechsecondsecond":
                        nextIntent = new Intent(SectionSelect.this, MechSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "mechthirdfirst":
                        nextIntent = new Intent(SectionSelect.this, MechThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "mechthirdsecond":
                        nextIntent = new Intent(SectionSelect.this, MechTable.class);
                        startActivity(nextIntent);
                        break;
                    case "mechfourthfirst":
                        nextIntent = new Intent(SectionSelect.this, MechFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "mechfourthsecond":
                        nextIntent = new Intent(SectionSelect.this, MechFourthSecond.class);
                        startActivity(nextIntent);
                        break;


                    case "civilfirstfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "civilfirstsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "civilsecondfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "civilsecondsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "civilthirdfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "civilthirdsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilTable.class);
                        startActivity(nextIntent);
                        break;
                    case "civilfourthfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "civilfourthsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilFourthSecond.class);
                        startActivity(nextIntent);
                        break;


                    case "eeefirstfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "eeefirstsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "eeesecondfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "eeesecondsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "eeethirdfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "eeethirdsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeTable.class);
                        startActivity(nextIntent);
                        break;
                    case "eeefourthfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "eeefourthsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeFourthSecond.class);
                        startActivity(nextIntent);
                        break;

                    case "ecefirstfirst":
                        nextIntent = new Intent(SectionSelect.this, EceFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "ecefirstsecond":
                        nextIntent = new Intent(SectionSelect.this, EceFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "ecesecondfirst":
                        nextIntent = new Intent(SectionSelect.this, EceSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "ecesecondsecond":
                        nextIntent = new Intent(SectionSelect.this, EceSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "ecethirdfirst":
                        nextIntent = new Intent(SectionSelect.this, EceThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "ecethirdsecond":
                        nextIntent = new Intent(SectionSelect.this, EceTable.class);
                        startActivity(nextIntent);
                        break;
                    case "ecefourthfirst":
                        nextIntent = new Intent(SectionSelect.this, EceFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "ecefourthsecond":
                        nextIntent = new Intent(SectionSelect.this, EceFourthSecond.class);
                        startActivity(nextIntent);
                        break;
                }
            }
        });

        section_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = null;
                switch (value) {
                    case "csefirstfirst":
                        nextIntent = new Intent(SectionSelect.this, CseFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "csefirstsecond":
                        nextIntent = new Intent(SectionSelect.this, CseFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "csesecondfirst":
                        nextIntent = new Intent(SectionSelect.this, CseSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "csesecondsecond":
                        nextIntent = new Intent(SectionSelect.this, CseSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "csethirdfirst":
                        nextIntent = new Intent(SectionSelect.this, CseThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "csethirdsecond":
                        nextIntent = new Intent(SectionSelect.this, CseTable.class);
                        startActivity(nextIntent);
                        break;
                    case "csefourthfirst":
                        nextIntent = new Intent(SectionSelect.this, CseFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "csefourthsecond":
                        nextIntent = new Intent(SectionSelect.this, CseForthSecond.class);
                        startActivity(nextIntent);
                        break;


                    case "mechfirstfirst":
                        nextIntent = new Intent(SectionSelect.this, MechFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "mechfirstsecond":
                        nextIntent = new Intent(SectionSelect.this, MechFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "mechsecondfirst":
                        nextIntent = new Intent(SectionSelect.this, MechSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "mechsecondsecond":
                        nextIntent = new Intent(SectionSelect.this, MechSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "mechthirdfirst":
                        nextIntent = new Intent(SectionSelect.this, MechThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "mechthirdsecond":
                        nextIntent = new Intent(SectionSelect.this, MechTable.class);
                        startActivity(nextIntent);
                        break;
                    case "mechfourthfirst":
                        nextIntent = new Intent(SectionSelect.this, MechFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "mechfourthsecond":
                        nextIntent = new Intent(SectionSelect.this, MechFourthSecond.class);
                        startActivity(nextIntent);
                        break;


                    case "civilfirstfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "civilfirstsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "civilsecondfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "civilsecondsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "civilthirdfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "civilthirdsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilTable.class);
                        startActivity(nextIntent);
                        break;
                    case "civilfourthfirst":
                        nextIntent = new Intent(SectionSelect.this, CivilFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "civilfourthsecond":
                        nextIntent = new Intent(SectionSelect.this, CivilFourthSecond.class);
                        startActivity(nextIntent);
                        break;


                    case "eeefirstfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "eeefirstsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "eeesecondfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "eeesecondsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "eeethirdfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "eeethirdsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeTable.class);
                        startActivity(nextIntent);
                        break;
                    case "eeefourthfirst":
                        nextIntent = new Intent(SectionSelect.this, EeeFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "eeefourthsecond":
                        nextIntent = new Intent(SectionSelect.this, EeeFourthSecond.class);
                        startActivity(nextIntent);
                        break;

                    case "ecefirstfirst":
                        nextIntent = new Intent(SectionSelect.this, EceFirstFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "ecefirstsecond":
                        nextIntent = new Intent(SectionSelect.this, EceFirstSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "ecesecondfirst":
                        nextIntent = new Intent(SectionSelect.this, EceSecondFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "ecesecondsecond":
                        nextIntent = new Intent(SectionSelect.this, EceSecondSecond.class);
                        startActivity(nextIntent);
                        break;
                    case "ecethirdfirst":
                        nextIntent = new Intent(SectionSelect.this, EceThirdFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "ecethirdsecond":
                        nextIntent = new Intent(SectionSelect.this, EceTable.class);
                        startActivity(nextIntent);
                        break;
                    case "ecefourthfirst":
                        nextIntent = new Intent(SectionSelect.this, EceFourthFirst.class);
                        startActivity(nextIntent);
                        break;
                    case "ecefourthsecond":
                        nextIntent = new Intent(SectionSelect.this, EceFourthSecond.class);
                        startActivity(nextIntent);
                        break;
                }
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

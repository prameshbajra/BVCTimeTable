package com.example.pramesh.bvctimetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cseButton ,eceButton, civilButton, eeeButton, mechButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cseButton = (Button) findViewById(R.id.cseButton);
        eceButton = (Button)findViewById(R.id.eceButton);
        eeeButton = (Button) findViewById(R.id.eeeButton);
        civilButton = (Button) findViewById(R.id.civilButton);
        mechButton = (Button) findViewById(R.id.mechButton);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.mipmap.icon_launcher);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        cseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cseIntent = new Intent(MainActivity.this,CseTable.class);
                startActivity(cseIntent);
            }
        });

        mechButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mechIntent = new Intent(MainActivity.this,MechTable.class);
                startActivity(mechIntent);
            }
        });

        civilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent civilIntent = new Intent(MainActivity.this,CivilTable.class);
                startActivity(civilIntent);
            }
        });

        eeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eeeIntent = new Intent(MainActivity.this,EeeTable.class);
                startActivity(eeeIntent);
            }
        });

        eceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eceIntent = new Intent(MainActivity.this,EceTable.class);
                startActivity(eceIntent);
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

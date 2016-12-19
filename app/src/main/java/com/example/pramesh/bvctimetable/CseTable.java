package com.example.pramesh.bvctimetable;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class CseTable extends AppCompatActivity {

    private TextView mondayFirst,mondaySecond,mondayThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_table);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mondayFirst=(TextView) findViewById(R.id.mondayFirst);
        mondaySecond = (TextView) findViewById(R.id.mondaySecond);
        mondayThird = (TextView) findViewById(R.id.mondayThird);

        mondayFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle("Android Training Lab");
                builder.setMessage("Taught By RVS sir");
                builder.setCancelable(true);
                builder.show();
            }
        });

        mondaySecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle("Android Training Lab");
                builder.setMessage("Taught By RVS sir");
                builder.setCancelable(true);
                builder.show();
            }
        });

        mondayThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CseTable.this);
                builder.setTitle("Android Training Lab");
                builder.setMessage("Taught By RVS sir");
                builder.setCancelable(true);
                builder.show();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        setTitle("Computer Science Engineering");
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

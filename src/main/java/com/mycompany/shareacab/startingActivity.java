package com.mycompany.shareacab;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class startingActivity extends ActionBarActivity {

    Button create_journey, join_plan , update , contact;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        initialize();
    }


    private void initialize(){
        create_journey = (Button) findViewById(R.id.bCJ);
        join_plan = (Button) findViewById(R.id.bJP);
        update = (Button) findViewById(R.id.bUD);
        contact = (Button) findViewById(R.id.bCFR);
        create_journey.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(startingActivity.this,Create.class);
                myIntent.putExtra("key",value); // Optional Parameters
                startActivity(myIntent);
            }
        });
        join_plan.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Intent myIntent = new Intent(startingActivity.this,Search.class);
                myIntent.putExtra("key",value);
                startingActivity.this.startActivity(myIntent);
            }
        });
        update.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Intent myIntent = new Intent(startingActivity.this,Update.class);
                myIntent.putExtra("key",value);
                startingActivity.this.startActivity(myIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_starting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

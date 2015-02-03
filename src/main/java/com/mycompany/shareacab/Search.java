package com.mycompany.shareacab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by akshitkumar1 on 17/01/15.
 */
public class Search extends Activity {

    Spinner from, to, time_slot ;
    String value;

    @Override
    protected void onCreate(Bundle savedStateInstance) {
        super.onCreate(savedStateInstance);
        setContentView(R.layout.search);
        Intent intent = getIntent();
        value = intent.getStringExtra("key");
        from();
        to();
        timeslot();
    }

    private void from() {
        from = (Spinner) findViewById(R.id.sFrom);
        String[] items = new String[]{"IIT Madras", "Chennai Airport", "Chennai Central"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        from.setAdapter(adapter);
    }

    private void to() {
        to = (Spinner) findViewById(R.id.sTo);
        String[] items = new String[]{"IIT Madras", "Chennai Airport", "Chennai Central"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        to.setAdapter(adapter);
    }

    private void timeslot() {
        time_slot = (Spinner) findViewById(R.id.sTime);
        String[] items = new String[]{};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        time_slot.setAdapter(adapter);
    }


}

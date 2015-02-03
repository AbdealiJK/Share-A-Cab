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
public class Create extends Activity {

    Spinner from, to, time_slot, pass_limit;
    Button book;
    String value;

    @Override
    protected void onCreate(Bundle savedStateInstance) {
        super.onCreate(savedStateInstance);
        setContentView(R.layout.create);
        Intent intent = getIntent();
        value = intent.getStringExtra("key");
        from();
        to();
        passLimit();
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


    private void passLimit() {
        pass_limit = (Spinner) findViewById(R.id.sPassLimit);
        String[] items = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        pass_limit.setAdapter(adapter);
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}

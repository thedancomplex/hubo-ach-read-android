package com.example.hubo_ach_read_android;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     // reference the table layout
        TableLayout tbl = (TableLayout)findViewById(R.id.RHE);
        // delcare a new row
        TableRow newRow = new TableRow(this);
        // add views to the row
        newRow.addView(new TextView(this)); // you would actually want to set properties on this before adding it
        // add the row to the table layout
        tbl.addView(newRow);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

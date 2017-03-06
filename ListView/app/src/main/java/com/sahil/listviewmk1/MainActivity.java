package com.sahil.listviewmk1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {

    View emptyView;
    ListView listView;
    String[]names=new String[]{"GOOGLE","INFO","DELL","IBM","IGATE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emptyView =  findViewById(R.id.empty_view);
        listView = (ListView) findViewById(R.id.list_View);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_element, names);
        listView.setEmptyView(emptyView);
        //This allows us to display the empty view when there is no data to populate the list view.
        listView.setAdapter(adapter);
    }
}

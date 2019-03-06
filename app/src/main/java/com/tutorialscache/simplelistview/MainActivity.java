package com.tutorialscache.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //array of strings
    String[] countryNames = {"Pakistan","Guatemala","Indonesia","Argentina","Kyrgyzstan","Afghanistan","Ethiopia","India",
                            "United States","Turkey","Australia","South Africa","Egypt"};
    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting listview from activity_main.xml layout
        listView = findViewById(R.id.listView);

        //initializing adapter
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,countryNames);

        //setting ArrayAdapter on listView
        listView.setAdapter(arrayAdapter);

        //making listView clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String countryName = countryNames[position];
                //showing clicked item on toast
                Toast.makeText(getApplicationContext(),countryName,Toast.LENGTH_LONG).show();
            }
        });

    }
}

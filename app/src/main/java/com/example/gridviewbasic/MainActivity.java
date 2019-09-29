package com.example.gridviewbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] countrynames;
    int[] flags = {R.drawable.australia,R.drawable.bangladesh,R.drawable.china,R.drawable.france,
    R.drawable.germany,R.drawable.italy,R.drawable.maxico,R.drawable.russia,
    R.drawable.spain,R.drawable.unitedstate};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridViewId);
        countrynames = getResources().getStringArray(R.array.country_names);
        CustomAdapter adapter = new CustomAdapter(this,countrynames,flags);
        gridView.setAdapter(adapter);
    }
}

package com.example.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<data> inf = new ArrayList<data>();
        inf.add(new data("Ritik", "Phy", "A+"));
        inf.add(new data("Rit", "Phy", "B+"));
        inf.add(new data("Ri", "Phy", "A+"));

        Adapter adapter = new Adapter(this, inf);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
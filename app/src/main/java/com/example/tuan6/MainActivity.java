package com.example.tuan6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvcauthu;
    ArrayList<Cauthu> arraycauthu;
    CauthuAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        adapter = new CauthuAdapter(this,R.layout.dong_cau_thu, arraycauthu);
        lvcauthu.setAdapter(adapter);


    }
    private  void Anhxa(){
        lvcauthu = (ListView) findViewById(R.id.listviewCauthu);
        arraycauthu = new ArrayList<>();

        arraycauthu.add(new Cauthu("Messi","Cau thu",R.drawable.messi,R.drawable.argentina));
        arraycauthu.add(new Cauthu("Ronaldinho","Cau thu",R.drawable.ronaldinho,R.drawable.brazil));
        arraycauthu.add(new Cauthu("Pele","Cau thu",R.drawable.pele,R.drawable.brazil));
        arraycauthu.add(new Cauthu("Ronaldo","Cau thu",R.drawable.ronaldo,R.drawable.portugal));
        arraycauthu.add(new Cauthu("Maradona","Cau thu",R.drawable.maradona,R.drawable.argentina));
    }
}
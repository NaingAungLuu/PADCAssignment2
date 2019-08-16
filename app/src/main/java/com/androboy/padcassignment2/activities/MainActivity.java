package com.androboy.padcassignment2.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.androboy.padcassignment2.R;
import com.androboy.padcassignment2.adapters.CarListAdapter;
import com.androboy.padcassignment2.delegates.CarListItemDelegate;

public class MainActivity extends AppCompatActivity implements CarListItemDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        RecyclerView rvCarList = findViewById(R.id.rvCarList);
        rvCarList.setLayoutManager(new LinearLayoutManager(getApplicationContext() , LinearLayoutManager.VERTICAL , false));

        CarListAdapter adapter = new CarListAdapter(this);
        rvCarList.setAdapter(adapter);

    }

    @Override
    public void onTapCarItem() {

    }
}

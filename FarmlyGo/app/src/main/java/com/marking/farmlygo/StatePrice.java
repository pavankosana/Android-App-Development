package com.marking.farmlygo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class StatePrice extends AppCompatActivity {

    private static final String TAG = "StatePrice";
    private ArrayList<String> mSNames = new ArrayList<>();
    private ArrayList<String> mPrices = new ArrayList<>();
    StatesList statesList;
    String imageName, stateName1, stateName2, stateName3, stateName4, stateName5, stateName6, stateName7, stateName8, stateName9, statePrice1, statePrice2, statePrice3, statePrice4, statePrice5, statePrice6, statePrice7, statePrice8, statePrice9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_price);
        Log.d(TAG, "OnCreate: started");

        getSupportActionBar().setTitle("State Wise Prices");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if(getIntent().hasExtra("image_name"))
        {
            imageName = getIntent().getStringExtra("image_name");
            stateName1 = getIntent().getStringExtra("stateName1");
            stateName2 = getIntent().getStringExtra("stateName2");
            stateName3 = getIntent().getStringExtra("stateName3");
            stateName4 = getIntent().getStringExtra("stateName4");
            stateName5 = getIntent().getStringExtra("stateName5");
            stateName6 = getIntent().getStringExtra("stateName6");
            stateName7 = getIntent().getStringExtra("stateName7");
            stateName8 = getIntent().getStringExtra("stateName8");
            stateName9 = getIntent().getStringExtra("stateName9");
            statePrice1 = getIntent().getStringExtra("statePrice1");
            statePrice2 = getIntent().getStringExtra("statePrice2");
            statePrice3 = getIntent().getStringExtra("statePrice3");
            statePrice4 = getIntent().getStringExtra("statePrice4");
            statePrice5 = getIntent().getStringExtra("statePrice5");
            statePrice6 = getIntent().getStringExtra("statePrice6");
            statePrice7 = getIntent().getStringExtra("statePrice7");
            statePrice8 = getIntent().getStringExtra("statePrice8");
            statePrice9 = getIntent().getStringExtra("statePrice9");
        }

        mSNames.add(stateName1);
        mPrices.add(statePrice1);

        mSNames.add(stateName2);
        mPrices.add(statePrice2);

        mSNames.add(stateName3);
        mPrices.add(statePrice3);

        mSNames.add(stateName4);
        mPrices.add(statePrice4);

        mSNames.add(stateName5);
        mPrices.add(statePrice5);

        mSNames.add(stateName6);
        mPrices.add(statePrice6);

        mSNames.add(stateName7);
        mPrices.add(statePrice7);

        mSNames.add(stateName8);
        mPrices.add(statePrice8);

        mSNames.add(stateName9);
        mPrices.add(statePrice9);

//        stateName1.("Andhra Pradesh");
//        statePrice1.add("100.00");
//
//        mSNames.add("Karnataka");
//        mPrices.add("90.50");
//
//        mSNames.add("Kerala");
//        mPrices.add("85.75");
//
//        mSNames.add("Tamil Nadu");
//        mPrices.add("110.10");

        initStateRecyclerView();
    }

    private void initStateRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view2);
        StateRecyclerViewAdapter adapter = new StateRecyclerViewAdapter(this, mSNames, mPrices);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

package com.marking.farmlygo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SellActivity extends AppCompatActivity {


    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;
    private static final String TAG = "SellActivity";




    EditText mpid;
    EditText mpname;
    EditText mprice;
    EditText mquan;
    EditText mloc;

    Button bpos;
    Button bshow;


    public ArrayList<String> pids = new ArrayList<>();
    public ArrayList<String> pnames = new ArrayList<>();
    public ArrayList<String> prices = new ArrayList<>();
    public ArrayList<String> quans = new ArrayList<>();
    public ArrayList<String> locs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);


        mpid = findViewById(R.id.pid);
        mpname = findViewById(R.id.pname);
        mprice = findViewById(R.id.price);
        mquan = findViewById(R.id.quan);
        mloc = findViewById(R.id.loc);
        bpos = findViewById(R.id.post);
        bshow = findViewById(R.id.show);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        bpos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postDetails();
            }
        });


        Button showbtn = (Button) findViewById(R.id.show);
        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startResult();
            }
        });
    }

    public void postDetails()
    {
        if (!TextUtils.isEmpty(mpid.getText()) && !TextUtils.isEmpty(mpname.getText()) && !TextUtils.isEmpty(mprice.getText()) && !TextUtils.isEmpty(mquan.getText()) && !TextUtils.isEmpty(mloc.getText())) {
            String p = mpid.getText().toString();
            String n = mpname.getText().toString();
            String pri= mprice.getText().toString();
            String q= mquan.getText().toString();
            String l= mloc.getText().toString();


            //userID = fAuth.getCurrentUser().getUid();
            //DocumentReference documentReference = fStore.collection("products").document(userID);
            //Map<String,Object> product = new HashMap<>();

            //product.put("Id",p);
            //product.put("Name",n);
            //product.put("price",pri);
            //product.put("quantity",q);
            //product.put("location", l);

            //documentReference.set(product).addOnSuccessListener(new OnSuccessListener<Void>() {
              //  @Override
               // public void onSuccess(Void aVoid) {
                //    Log.d(TAG, "onSuccess: user Profile is created for "+ userID);
                //}
            //}).addOnFailureListener(new OnFailureListener() {
              //  @Override
                //public void onFailure(@NonNull Exception e) {
                  //  Log.d(TAG, "onFailure: " + e.toString());
                //}
            //});

            pids.add(p);
            pnames.add(n);
            prices.add(pri);
            quans.add(q);
            locs.add(l);

            mpid.setText("");
            mpname.setText("");
            mprice.setText("");
            mquan.setText("");
            mloc.setText("");

            Toast.makeText(getApplicationContext(), "Details posted successfully!", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getApplicationContext(), "Please Enter the Complete Details", Toast.LENGTH_SHORT).show();
        }

    }


    public void startResult()
    {

        String[] pid_arr = new String[pids.size()];
        String[] pname_arr = new String[pnames.size()];
        String[] price_arr = new String[prices.size()];
        String[] quan_arr = new String[quans.size()];
        String[] loc_arr = new String[locs.size()];

        for (int i = 0; i < pids.size(); i++) {
            pid_arr[i] = pids.get(i);
            pname_arr[i] = pnames.get(i);
            price_arr[i] = prices.get(i);
            quan_arr[i] = quans.get(i);
            loc_arr[i] = locs.get(i);
        }

        Intent intent = new Intent(this, ResultsProduct.class);
        intent.putExtra("pid", pid_arr);
        intent.putExtra("name", pname_arr);
        intent.putExtra("price", price_arr);
        intent.putExtra("quantity", quan_arr);
        intent.putExtra("location", loc_arr);

        startActivity(intent);

    }
}

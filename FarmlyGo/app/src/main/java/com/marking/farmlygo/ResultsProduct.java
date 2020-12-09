package com.marking.farmlygo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class ResultsProduct extends AppCompatActivity {

    private TextView mPid;
    private TextView mPname;
    private TextView mPrice;
    private TextView mQuan;
    private TextView mLoc;

    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;
    private static final String TAG = "ProductsResult";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_product);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        mPid = findViewById(R.id.res_pid);
        mPname = findViewById(R.id.res_name);
        mPrice = findViewById(R.id.res_price);
        mQuan = findViewById(R.id.res_quan);
        mLoc= findViewById(R.id.res_loc);

        Bundle extras = getIntent().getExtras();




        String[] ids =extras.getStringArray("pid");
        String[] n =extras.getStringArray("name");
        String[] pr =extras.getStringArray("price");
        String[] qu =extras.getStringArray("quantity");
        String[] lo =extras.getStringArray("location");

        for (int i = 0; i < ids.length; i++) {

            mPid.setText(mPid.getText()+ "\n" + ids[i]);
            mPname.setText(mPname.getText() + "\n" + n[i]);
            mPrice.setText(mPrice.getText() + "\n" + pr[i]);
            mQuan.setText(mQuan.getText() + "\n" + qu[i]);
            mLoc.setText(mLoc.getText() + "\n" + lo[i]);

            String prod1 = mPid.getText().toString();
            String prod2 = mPname.getText().toString();
            String prod3 = mPrice.getText().toString();
            String prod4 = mQuan.getText().toString();
            String prod5 = mLoc.getText().toString();

            userID = fAuth.getCurrentUser().getUid();
            DocumentReference documentReference = fStore.collection("products").document(userID);
            Map<String,Object> product = new HashMap<>();

            product.put("Id",prod1);
            product.put("Name",prod2);
            product.put("price",prod3);
            product.put("quantity",prod4);
            product.put("location", prod5);

            documentReference.set(product).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid) {
                    Log.d(TAG, "onSuccess: user Profile is created for "+ userID);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d(TAG, "onFailure: " + e.toString());
                }
            });

        }

    }
}

package com.marking.farmlygo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class DashBoard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        Button bt1 = (Button) findViewById(R.id.sell_btn);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSellProducts();
            }
        });

        Button bt2 = (Button) findViewById(R.id.mar_btn);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMarketPrice();
            }
        });

        Button bt3 = (Button) findViewById(R.id.VR_btn);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startVillageHolder();
            }
        });


        Button bt4 = (Button) findViewById(R.id.edit);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startEditme();
            }
        });


        Button bt5 = (Button) findViewById(R.id.contact);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startContactme();
            }
        });


        Button bt6 = (Button) findViewById(R.id.share);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Farmly Go");
                    String shareMessage="Download app from this link: https://drive.google.com/file/d/1Abpxcbx90Ccd9anKSq-KuABTTpKj7lvS/view?usp=sharing" + BuildConfig.APPLICATION_ID+"\n\n";
                    intent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(intent, "share by"));
                }catch (Exception e)
                {
                    Toast.makeText(DashBoard.this, "Error occured while sharing!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void startMarketPrice()
    {
        Intent intent = new Intent(this, MarketPrices.class);
        startActivity(intent);
    }

    public void startSellProducts()
    {
        Intent intent = new Intent(this, SellActivity.class);
        startActivity(intent);
    }

    public void startVillageHolder()
    {
        Intent intent = new Intent(this, VillageHolder.class);
        startActivity(intent);
    }

    public void startEditme()
    {
        Intent intent = new Intent(this, EditProfile.class);
        startActivity(intent);
    }

    public void startContactme()
    {
        Intent intent = new Intent(this, ContactMe.class);
        startActivity(intent);
    }





    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        finish();
    }
}

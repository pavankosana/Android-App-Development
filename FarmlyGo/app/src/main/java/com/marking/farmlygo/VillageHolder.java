package com.marking.farmlygo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class VillageHolder extends AppCompatActivity {

    String[] locs = {"Andhra Pradesh", "Hyderabad", "Tamil nadu", "Maharastra", "Delhi", "Banglore", "Bhiwadi"};

    Spinner spinner;
    TextView tname, tphno, email, tage, tadd;

    ArrayAdapter<String> adapter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_village_holder);

        spinner = (Spinner) findViewById(R.id.spinner);

        tname = (TextView) findViewById(R.id.nav_villageRepresentative_tv1);
        tphno = (TextView) findViewById(R.id.nav_villageRepresentative_tv3);
        email = (TextView) findViewById(R.id.nav_villageRepresentative_tv5);
        tage = (TextView) findViewById(R.id.edit_profile_tv9);
        tadd = (TextView) findViewById(R.id.nav_villageRepresentative_tv9);



        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,locs);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i)
                {
                    case 0:

                        tname.setText("Pavan Kumar");
                        tphno.setText("9944556611");
                        email.setText("pavankumar@gmail.com");
                        tage.setText("56");
                        tadd.setText("Near ram theater, gunter, pin-520007");

                        break;

                    case 1:

                        tname.setText("Mohan prasad");
                        tphno.setText("7049556621");
                        email.setText("mohan564@gmail.com");
                        tage.setText("52");
                        tadd.setText("Near sai baba temple , kukatpalli, hyderabad, pin-420607");

                        break;

                    case 2:

                        tname.setText("Kishore");
                        tphno.setText("9955248911");
                        email.setText("kishore256@gmail.com");
                        tage.setText("49");
                        tadd.setText("Near amrutha hospatai, chennai, pin-525607");

                        break;

                    case 3:

                        tname.setText("Riteesh");
                        tphno.setText("9936547892");
                        email.setText("riteeshram@yahoo.in");
                        tage.setText("36");
                        tadd.setText("Near ram theater, Mumbai, pin-568007");

                        break;

                    case 4:

                        tname.setText("Kommaram bheem");
                        tphno.setText("9936457821");
                        email.setText("kommarambheem@gmail.com");
                        tage.setText("56");
                        tadd.setText("Near ram theater, Agara, pin-124007");

                        break;

                    case 5:

                        tname.setText("Balaya babu");
                        tphno.setText("9563247892");
                        email.setText("balayababu@gmail.com");
                        tage.setText("46");
                        tadd.setText("Near  KGF theater, banglore, pin-890007");

                        break;

                    case 6:

                        tname.setText("Kalyan ram");
                        tphno.setText("9944425631");
                        email.setText("kalyanram@gmail.com");
                        tage.setText("26");
                        tadd.setText("Near ohms theater, bhiwadi, pin-556007");


                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}

package com.marking.farmlygo;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private Context mContext;
    FirebaseFirestore db;
    int sugarcane=0, tomato=0, potato=0, apple=0, mango=0, pineapple=0, orange=0, tealeaves=0, coffeebeans=0;
    StatesList statesList;


    public RecyclerViewAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> images)
    {
        mImageNames = imageNames;
        mImages = images;
        mContext = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called. ");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);
        holder.imageName.setText(mImageNames.get(position));

        db = FirebaseFirestore.getInstance();
        final CollectionReference dbStatePrice = db.collection("State Lists");
        //int i= Integer.parseInt(mImageNames.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick, clicked on: "+ mImageNames.get(position));

                if(mImageNames.get(position)=="Sugar Cane"){
                    String commodity = "Sugar Cane";
                    String stateName1 = "Andhra Pradesh";
                    String statePrice1 = "230.00";
                    String stateName2 = "Kerala";
                    String statePrice2 = "232.43";
                    String stateName3 = "Karnataka";
                    String statePrice3 = "259.04";
                    String stateName4 = "Tamil Nadu";
                    String statePrice4 = "230.00";
                    String stateName5 = "Telangana";
                    String statePrice5 = "263.88";
                    String stateName6 = "Maharashtra";
                    String statePrice6 = "273.74";
                    String stateName7 = "Gujarat";
                    String statePrice7 = "251.75";
                    String stateName8 = "Haryana";
                    String statePrice8 = "254.20";
                    String stateName9 = "Punjab";
                    String statePrice9 = "244.52";

                    statesList = new StatesList(commodity, stateName1,statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4,statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9);
                    //sugarcane=1;
                    dbStatePrice.add(statesList).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if(mImageNames.get(position)=="Tomato"){
                    String commodity = "Tomato";
                    String stateName1 = "Andhra Pradesh";
                    String statePrice1 = "33.00";
                    String stateName2 = "Kerala";
                    String statePrice2 = "27.15";
                    String stateName3 = "Karnataka";
                    String statePrice3 = "29.04";
                    String stateName4 = "Tamil Nadu";
                    String statePrice4 = "35.00";
                    String stateName5 = "Telangana";
                    String statePrice5 = "40.88";
                    String stateName6 = "Maharashtra";
                    String statePrice6 = "25.74";
                    String stateName7 = "Gujarat";
                    String statePrice7 = "33.75";
                    String stateName8 = "Haryana";
                    String statePrice8 = "30.20";
                    String stateName9 = "Punjab";
                    String statePrice9 = "31.52";

                    statesList = new StatesList(commodity, stateName1,statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4,statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9);
                    //tomato=1;
                    dbStatePrice.add(statesList).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if(mImageNames.get(position)=="Potato"){
                    String commodity = "Potato";
                    String stateName1 = "Andhra Pradesh";
                    String statePrice1 = "38.00";
                    String stateName2 = "Kerala";
                    String statePrice2 = "42.15";
                    String stateName3 = "Karnataka";
                    String statePrice3 = "45.04";
                    String stateName4 = "Tamil Nadu";
                    String statePrice4 = "35.00";
                    String stateName5 = "Telangana";
                    String statePrice5 = "47.88";
                    String stateName6 = "Maharashtra";
                    String statePrice6 = "42.74";
                    String stateName7 = "Gujarat";
                    String statePrice7 = "39.75";
                    String stateName8 = "Haryana";
                    String statePrice8 = "40.20";
                    String stateName9 = "Punjab";
                    String statePrice9 = "44.52";

                    statesList = new StatesList(commodity, stateName1,statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4,statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9);
                    //potato=1;
                    dbStatePrice.add(statesList).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if(mImageNames.get(position)=="Apple"){
                    String commodity = "Apple";
                    String stateName1 = "Andhra Pradesh";
                    String statePrice1 = "220.00";
                    String stateName2 = "Kerala";
                    String statePrice2 = "240.15";
                    String stateName3 = "Karnataka";
                    String statePrice3 = "210.04";
                    String stateName4 = "Tamil Nadu";
                    String statePrice4 = "255.00";
                    String stateName5 = "Telangana";
                    String statePrice5 = "230.88";
                    String stateName6 = "Maharashtra";
                    String statePrice6 = "223.74";
                    String stateName7 = "Gujarat";
                    String statePrice7 = "219.75";
                    String stateName8 = "Haryana";
                    String statePrice8 = "210.20";
                    String stateName9 = "Punjab";
                    String statePrice9 = "200.52";

                    statesList = new StatesList(commodity, stateName1,statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4,statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9);
                    // apple=1;
                    dbStatePrice.add(statesList).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if(mImageNames.get(position)=="Mango"){
                    String commodity = "Mango";
                    String stateName1 = "Andhra Pradesh";
                    String statePrice1 = "70.00";
                    String stateName2 = "Kerala";
                    String statePrice2 = "72.15";
                    String stateName3 = "Karnataka";
                    String statePrice3 = "75.04";
                    String stateName4 = "Tamil Nadu";
                    String statePrice4 = "76.00";
                    String stateName5 = "Telangana";
                    String statePrice5 = "71.88";
                    String stateName6 = "Maharashtra";
                    String statePrice6 = "68.74";
                    String stateName7 = "Gujarat";
                    String statePrice7 = "65.75";
                    String stateName8 = "Haryana";
                    String statePrice8 = "77.20";
                    String stateName9 = "Punjab";
                    String statePrice9 = "80.52";

                    statesList = new StatesList(commodity, stateName1,statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4,statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9);
                    //  mango=1;
                    dbStatePrice.add(statesList).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if(mImageNames.get(position)=="Pineapple"){
                    String commodity = "Pineapple";
                    String stateName1 = "Andhra Pradesh";
                    String statePrice1 = "90.00";
                    String stateName2 = "Kerala";
                    String statePrice2 = "85.15";
                    String stateName3 = "Karnataka";
                    String statePrice3 = "88.04";
                    String stateName4 = "Tamil Nadu";
                    String statePrice4 = "86.00";
                    String stateName5 = "Telangana";
                    String statePrice5 = "94.88";
                    String stateName6 = "Maharashtra";
                    String statePrice6 = "100.74";
                    String stateName7 = "Gujarat";
                    String statePrice7 = "103.75";
                    String stateName8 = "Haryana";
                    String statePrice8 = "105.20";
                    String stateName9 = "Punjab";
                    String statePrice9 = "104.52";

                    statesList = new StatesList(commodity, stateName1,statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4,statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9);
                    //pineapple=1;
                    dbStatePrice.add(statesList).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if(mImageNames.get(position)=="Orange"){
                    String commodity = "Orange";
                    String stateName1 = "Andhra Pradesh";
                    String statePrice1 = "73.00";
                    String stateName2 = "Kerala";
                    String statePrice2 = "77.15";
                    String stateName3 = "Karnataka";
                    String statePrice3 = "76.04";
                    String stateName4 = "Tamil Nadu";
                    String statePrice4 = "74.00";
                    String stateName5 = "Telangana";
                    String statePrice5 = "79.88";
                    String stateName6 = "Maharashtra";
                    String statePrice6 = "69.74";
                    String stateName7 = "Gujarat";
                    String statePrice7 = "70.75";
                    String stateName8 = "Haryana";
                    String statePrice8 = "80.20";
                    String stateName9 = "Punjab";
                    String statePrice9 = "85.52";

                    statesList = new StatesList(commodity, stateName1,statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4,statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9);
                    //orange=1;
                    dbStatePrice.add(statesList).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if(mImageNames.get(position)=="Tea Leaves"){
                    String commodity = "Tea Leaves";
                    String stateName1 = "Andhra Pradesh";
                    String statePrice1 = "90.00";
                    String stateName2 = "Kerala";
                    String statePrice2 = "95.15";
                    String stateName3 = "Karnataka";
                    String statePrice3 = "92.04";
                    String stateName4 = "Tamil Nadu";
                    String statePrice4 = "88.00";
                    String stateName5 = "Telangana";
                    String statePrice5 = "92.88";
                    String stateName6 = "Maharashtra";
                    String statePrice6 = "89.74";
                    String stateName7 = "Gujarat";
                    String statePrice7 = "91.75";
                    String stateName8 = "Haryana";
                    String statePrice8 = "96.20";
                    String stateName9 = "Punjab";
                    String statePrice9 = "100.52";

                    statesList = new StatesList(commodity, stateName1,statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4,statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9);
                    //tealeaves=1;
                    dbStatePrice.add(statesList).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if(mImageNames.get(position)=="Coffee Beans"){
                    String commodity = "Coffee Beans";
                    String stateName1 = "Andhra Pradesh";
                    String statePrice1 = "300.00";
                    String stateName2 = "Kerala";
                    String statePrice2 = "290.15";
                    String stateName3 = "Karnataka";
                    String statePrice3 = "295.04";
                    String stateName4 = "Tamil Nadu";
                    String statePrice4 = "298.00";
                    String stateName5 = "Telangana";
                    String statePrice5 = "303.88";
                    String stateName6 = "Maharashtra";
                    String statePrice6 = "305.74";
                    String stateName7 = "Gujarat";
                    String statePrice7 = "299.75";
                    String stateName8 = "Haryana";
                    String statePrice8 = "310.20";
                    String stateName9 = "Punjab";
                    String statePrice9 = "309.52";

                    statesList = new StatesList(commodity, stateName1,statePrice1, stateName2, statePrice2, stateName3, statePrice3, stateName4,statePrice4, stateName5, statePrice5, stateName6, statePrice6, stateName7, statePrice7, stateName8, statePrice8, stateName9, statePrice9);
                    // coffeebeans=1;
                    dbStatePrice.add(statesList).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, StatePrice.class);
                intent.putExtra("image_name", mImages.get(position));
                intent.putExtra("stateName1", statesList.getStateName1());
                intent.putExtra("stateName2", statesList.getStateName2());
                intent.putExtra("stateName3", statesList.getStateName3());
                intent.putExtra("stateName4", statesList.getStateName4());
                intent.putExtra("stateName5", statesList.getStateName5());
                intent.putExtra("stateName6", statesList.getStateName6());
                intent.putExtra("stateName7", statesList.getStateName7());
                intent.putExtra("stateName8", statesList.getStateName8());
                intent.putExtra("stateName9", statesList.getStateName9());
                intent.putExtra("statePrice1", statesList.getStatePrice1());
                intent.putExtra("statePrice2", statesList.getStatePrice2());
                intent.putExtra("statePrice3", statesList.getStatePrice3());
                intent.putExtra("statePrice4", statesList.getStatePrice4());
                intent.putExtra("statePrice5", statesList.getStatePrice5());
                intent.putExtra("statePrice6", statesList.getStatePrice6());
                intent.putExtra("statePrice7", statesList.getStatePrice7());
                intent.putExtra("statePrice8", statesList.getStatePrice8());
                intent.putExtra("statePrice9", statesList.getStatePrice9());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

}
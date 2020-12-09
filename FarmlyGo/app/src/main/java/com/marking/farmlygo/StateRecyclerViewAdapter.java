package com.marking.farmlygo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class StateRecyclerViewAdapter extends RecyclerView.Adapter<StateRecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "StateRecyclerViewAdapte";
    private ArrayList<String> mStateNames = new ArrayList<>();
    private ArrayList<String> mStatePrices = new ArrayList<>();
    private Context mContext;

    public StateRecyclerViewAdapter(Context context, ArrayList<String> stateNames, ArrayList<String> statePrices)
    {
        mStateNames = stateNames;
        mStatePrices = statePrices;
        mContext = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext()).inflate(R.layout.layout_statelistitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StateRecyclerViewAdapter.ViewHolder holder, final int position) {

        Log.d(TAG, "onBindViewHolder: called. ");
        holder.stateName.setText(mStateNames.get(position));
        holder.statePrice.setText(mStatePrices.get(position));
        holder.stateParentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick, clicked on: "+ mStateNames.get(position));

                Toast.makeText(mContext, mStateNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mStateNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView stateName;
        TextView statePrice;
        RelativeLayout stateParentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            stateName = itemView.findViewById(R.id.state_name);
            statePrice = itemView.findViewById(R.id.state_price);
            stateParentLayout = itemView.findViewById(R.id.state_parent_layout);
        }
    }
}
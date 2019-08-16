package com.androboy.padcassignment2.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androboy.padcassignment2.R;
import com.androboy.padcassignment2.delegates.CarListItemDelegate;
import com.androboy.padcassignment2.views.holders.CarListViewHolder;

public class CarListAdapter extends RecyclerView.Adapter {

    CarListItemDelegate mCarListItemDelegate;

    public CarListAdapter(CarListItemDelegate mCarListItemDelegate)
    {
        this.mCarListItemDelegate = mCarListItemDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_list_item , viewGroup , false);

        return new CarListViewHolder(view , mCarListItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

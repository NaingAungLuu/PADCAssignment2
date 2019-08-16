package com.androboy.padcassignment2.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.androboy.padcassignment2.delegates.CarListItemDelegate;

public class CarListViewHolder extends RecyclerView.ViewHolder {

    private CarListItemDelegate mCarListItemDelegate;

    public CarListViewHolder(@NonNull View itemView , CarListItemDelegate delegate) {
        super(itemView);
        mCarListItemDelegate = delegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 mCarListItemDelegate.onTapCarItem();
                Log.i("info" ,"Item is clicked");
            }
        });
    }
}

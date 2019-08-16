package com.androboy.padcassignment2.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

import com.androboy.padcassignment2.delegates.CarListItemDelegate;

public class CarListViewHolder extends ViewHolder {

    private CarListItemDelegate mCarListItemDelegate;

    public CarListViewHolder(@NonNull View itemView , CarListItemDelegate delegate) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCarListItemDelegate.onTapCarItem();
            }
        });
    }
}

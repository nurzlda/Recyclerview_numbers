package com.example.recyclerview_numbers;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumbersViewHolder extends RecyclerView.ViewHolder {

    private TextView tvNumbers;

    public NumbersViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNumbers= itemView.findViewById(R.id.tv_numbers);
    }

    public void bind(String numbers){
        tvNumbers.setText(numbers);
    }

}

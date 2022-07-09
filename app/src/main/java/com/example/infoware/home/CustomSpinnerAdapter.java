package com.example.infoware.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.infoware.R;
import com.example.infoware.home.CustomsItems;

import java.util.ArrayList;

public class CustomSpinnerAdapter extends ArrayAdapter<CustomsItems> {
    public CustomSpinnerAdapter(@NonNull Context context, ArrayList<CustomsItems> customList) {
        super(context, 0, customList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return customView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return customView(position, convertView, parent);
    }

    public View customView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner_layout,parent,false);
        }
        CustomsItems items = getItem(position);
        ImageView logo1 = convertView.findViewById(R.id.apple_logo);


        if(items != null){
            logo1.setImageResource(items.getApple_logo());
        }
        return convertView;
    }
}

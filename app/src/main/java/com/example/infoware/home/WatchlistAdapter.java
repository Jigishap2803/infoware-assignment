package com.example.infoware.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.infoware.R;

public class WatchlistAdapter extends RecyclerView.Adapter<WatchlistAdapter.ViewHolder>{

    WatchlistModelClass[] watchlistModelClass;
    Context context;

    public WatchlistAdapter(WatchlistModelClass[] watchlistModelClass){
        this.watchlistModelClass = watchlistModelClass;
        }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cardview_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final WatchlistModelClass watchlistModelClassList = watchlistModelClass[position];
        holder.logo_icon.setImageResource(watchlistModelClassList.getLogo_icon());
        holder.stock_name.setText(watchlistModelClassList.getStock_name());
        holder.company_name.setText(watchlistModelClassList.getCompany_name());
        holder.change.setText(watchlistModelClassList.getChange());
        holder.current_number.setText(watchlistModelClassList.getCurrent_number());
        holder.current_value.setText(watchlistModelClassList.getCurrent_value());

    }

    @Override
    public int getItemCount() {
        return watchlistModelClass.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
       ImageView logo_icon;
       TextView stock_name;
       TextView company_name;
       TextView change;
       TextView current_number;
       TextView current_value;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            logo_icon = itemView.findViewById(R.id.logo_icon);
            stock_name = itemView.findViewById(R.id.stock_name);
            company_name = itemView.findViewById(R.id.company_name);
            change = itemView.findViewById(R.id.change);
            current_number = itemView.findViewById(R.id.current_number);
            current_value = itemView.findViewById(R.id.current_value);
        }
    }
}

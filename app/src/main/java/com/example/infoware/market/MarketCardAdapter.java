package com.example.infoware.market;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.infoware.R;

public class MarketCardAdapter extends RecyclerView.Adapter<MarketCardAdapter.ViewHolder>{
    MarketCardData[] marketCardData;
    Context context;
    public MarketCardAdapter(MarketCardData[] marketCardData){
        this.marketCardData = marketCardData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.market_card_recyclerview, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MarketCardData MarketCardDataList = marketCardData[position];
        holder.stock_name.setText(MarketCardDataList.getStock_name());
        holder.value_market.setText(MarketCardDataList.getValue_market());
        holder.change_market.setText(MarketCardDataList.getChange_market());
        holder.graph_market_iv.setImageResource(MarketCardDataList.getGraph_market_iv());

    }

    @Override
    public int getItemCount() {
        return marketCardData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView stock_name;
        TextView value_market;
        TextView change_market;
        ImageView graph_market_iv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            stock_name = itemView.findViewById(R.id.stock_name);
            value_market = itemView.findViewById(R.id.value_market);
            change_market = itemView.findViewById(R.id.change_market);
            graph_market_iv = itemView.findViewById(R.id.graph_market_iv);

        }
    }
}

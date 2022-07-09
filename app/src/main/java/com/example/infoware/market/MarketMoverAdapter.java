package com.example.infoware.market;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.infoware.R;

import java.util.List;

public class MarketMoverAdapter extends RecyclerView.Adapter<MarketMoverAdapter.ViewHolder> {
    private List<MarketMoverData> list;

    public MarketMoverAdapter(List<MarketMoverData> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public MarketMoverAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.marketmover_list_recyclerview, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MarketMoverAdapter.ViewHolder holder, int position) {
        int icon = list.get(position).getIcon1();
        String stock = list.get(position).getStock();
        String companyName = list.get(position).getCompany_name();
        String currentNumber = list.get(position).getCurrent_number();
        String change = list.get(position).getChange();
        String value = list.get(position).getValue();
        String shares = list.get(position).getShares();
        holder.setData(icon, stock, companyName, currentNumber, change, value, shares, false);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView icon;
        private TextView stockTV;
        private TextView company_nameTV;
        private TextView current_numberTV;
        private TextView changeTV;
        private TextView valueTV;
        private TextView sharesTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.icon1);
            stockTV = itemView.findViewById(R.id.stock);
            company_nameTV = itemView.findViewById(R.id.company_name);
            current_numberTV = itemView.findViewById(R.id.current_number);
            changeTV = itemView.findViewById(R.id.change);
            valueTV = itemView.findViewById(R.id.value);
            sharesTV = itemView.findViewById(R.id.shares);
        }

        public void setData(int iconRes, String stock, String companyName, String currentNumber, String change, String value, String shares, Boolean isGreen) {
            icon.setImageResource(iconRes);
            stockTV.setText(stock);
            company_nameTV.setText(companyName);
            current_numberTV.setText(currentNumber);
            changeTV.setText(change);
            valueTV.setText(value);
            sharesTV.setText(shares);
        }
    }
}

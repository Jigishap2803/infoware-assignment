package com.example.infoware.market;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.infoware.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MarketFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MarketFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MarketFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MarketFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MarketFragment newInstance(String param1, String param2) {
        MarketFragment fragment = new MarketFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_market, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView marketCardRecyclerview = getView().findViewById(R.id.marketCardRecyclerview);
        marketCardRecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        MarketCardData[] marketCardData = new MarketCardData[]{
                new MarketCardData("Dow Jones", "$35,819.56", "0.25%", R.drawable.market_graph),
                new MarketCardData("S&P 500", "$4,605.38", "0.19%", R.drawable.market_graph)
        };

        MarketCardAdapter marketCardAdapter = new MarketCardAdapter(marketCardData);
        marketCardRecyclerview.setAdapter(marketCardAdapter);





        ArrayList<MarketMoverData> list = new ArrayList<>();
        list.add(new MarketMoverData(R.drawable.icon_4, "NVDA", "Nvidia", "25.94", "0.14%", "$227.26", "10 shares"));
        list.add(new MarketMoverData(R.drawable.a_icon, "ADB", "Adobe Inc", "33.49", "5.49%", "$643.58", "20 shares"));
        list.add(new MarketMoverData(R.drawable.apple, "APPL", "Apple Inc", "29.88", "1.82%", "$1114.90", "27 shares"));
        list.add(new MarketMoverData(R.drawable.icon_4, "NVDA", "Nvidia", "25.94", "0.14%", "$227.26", "10 shares"));
        list.add(new MarketMoverData(R.drawable.a_icon, "ADB", "Adobe Inc", "33.49", "5.49%", "$643.58", "20 shares"));
        list.add(new MarketMoverData(R.drawable.apple, "APPL", "Apple Inc", "29.88", "1.82%", "$1114.90", "27 shares"));

        RecyclerView marketMoverRecyclerview = getView().findViewById(R.id.marketMoverRecyclerview);
        marketMoverRecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        marketMoverRecyclerview.setAdapter(new MarketMoverAdapter(list));


    }
}
package com.example.ayena;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FeedsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FeedsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    RecyclerView recyclerView;
    List<Model> itemList;
    String s1[], s2[];
    int images[] = {R.drawable.amanda,R.drawable.ayana,R.drawable.dorothy,R.drawable.cynthia,R.drawable.jane,R.drawable.lorna,R.drawable.mary,R.drawable.melisa,R.drawable.muriungi,R.drawable.njeri};

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FeedsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FeedsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FeedsFragment newInstance(String param1, String param2) {
        FeedsFragment fragment = new FeedsFragment();
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
        //recyclerView = recyclerView.findViewById(R.id.recyclerviewfeed);
        //s1 = getResources().getStringArray(R.array.service_providers);
        //s2 = getResources().getStringArray(R.array.description);

        //MyAdapter myAdapter = new MyAdapter(this.getActivity(),s1,s2,images);
        //recyclerView.setAdapter(myAdapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_feeds, container, false);
        initData();

        recyclerView = view.findViewById(R.id.recyclerviewfeeds);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));



        recyclerView.setAdapter(new FeedsAdapter((ArrayList<FeedsItem>) initData()));
        return view;
    }

    private List<FeedsItem> initData() {
        ArrayList<FeedsItem> feedsList = new ArrayList<>();
        feedsList.add(new FeedsItem(R.drawable.hair1,"User_Amanda","I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.hair2,"User_Melisa","I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.hair3,"User_Dorothy"," I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.hair4,"User_Cynthia"," I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.nails1,"User_Njeri","N I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.nails2,"User_Ayana"," I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.nails3,"User_Jane","I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.fakehair,"User_Lorna"," I sold this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.cuts1,"User_Mary"," I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.cuts3,"User_Muriungi"," I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.cuts4,"User_Logo"," I did this to a customer and they liked it. What do you think"));
        feedsList.add(new FeedsItem(R.drawable.cuts5,"User_Dorothy"," I did this to a customer and they liked it. What do you think"));

        return feedsList;
    }

}
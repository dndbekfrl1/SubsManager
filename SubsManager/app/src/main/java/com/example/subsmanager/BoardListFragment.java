package com.example.subsmanager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.core.app.ActivityCompat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardListFragment extends Fragment {
    final int ITEM_SIZE = 5;


    public BoardListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = (View)inflater.inflate(R.layout.fragment_board_list, container, false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<Item> items = new ArrayList<>();
        Item[] item = new Item[ITEM_SIZE];
        /*item[0] = new Item(R.drawable.a, "#1");
        item[1] = new Item(R.drawable.b, "#2");
        item[2] = new Item(R.drawable.c, "#3");
        item[3] = new Item(R.drawable.d, "#4");
        item[4] = new Item(R.drawable.e, "#5"); */

        for (int i = 0; i < ITEM_SIZE; i++) {
            items.add(item[i]);
        }

        recyclerView.setAdapter(new RecyclerAdapter(getActivity().getApplicationContext(), items, R.layout.fragment_board_list));
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_board_list, container, false);
    }
}

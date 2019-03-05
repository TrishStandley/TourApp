package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);

        String[] food = getResources().getStringArray(R.array.food_dishes);
        int[] foodImageResourceID = {R.drawable.chicken_karahi, R.drawable.seekh_kabab, R.drawable.biryani,
                R.drawable.lassi, R.drawable.poori, R.drawable.rice_kheer};

        ArrayList<Lahore> lahore = new ArrayList<Lahore>();
        for (int i = 0; i < foodImageResourceID.length; i++) {
            lahore.add(new Lahore(food[i], foodImageResourceID[i]));
        }


        TourAdapter adapter = new TourAdapter(getActivity(), lahore);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pos = position;
                Intent intent = new Intent(getActivity(), Description.class);
                intent.putExtra("Object", pos);
                intent.putExtra("FragmentNumber", 2);
                startActivity(intent);
            }

        });

        return rootView;
    }

}

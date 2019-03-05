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
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);
        String[] hotel = getResources().getStringArray(R.array.hotel_names);
        int[] hotelImageResourceId = {R.drawable.pc, R.drawable.avari, R.drawable.hos, R.drawable.flattei,
                R.drawable.nishat};
        ArrayList<Lahore> lahore = new ArrayList<Lahore>();
        for (int i = 0; i < hotelImageResourceId.length; i++) {
            lahore.add(new Lahore(hotel[i], hotelImageResourceId[i]));
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
                intent.putExtra("FragmentNumber", 3);
                startActivity(intent);
            }

        });


        return rootView;
    }

}

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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);
        ArrayList<Lahore> lahore = new ArrayList<Lahore>();
        String[] mall = getResources().getStringArray(R.array.mall_names);
        int[] mallsImageResourceID = {R.drawable.emporium_mall_lahore, R.drawable.mall_of_lahore, R.drawable.fortress_square,
                R.drawable.anarkali};
        for (int i = 0; i < mallsImageResourceID.length; i++) {
            lahore.add(new Lahore(mall[i], mallsImageResourceID[i]));
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
                intent.putExtra("FragmentNumber", 1);
                startActivity(intent);
            }

        });


        return rootView;
    }

}

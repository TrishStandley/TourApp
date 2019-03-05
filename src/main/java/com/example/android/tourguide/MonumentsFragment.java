package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
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


public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.object_list, container, false);
        String[] monuments = getResources().getStringArray(R.array.monument_names);
        int[] monumentImageResourceID = {R.drawable.badshahi_mosque, R.drawable.lahore_fort, R.drawable.minar_pakistan,
                R.drawable.wazir_khan_mosque};

        final ArrayList<Lahore> lahore = new ArrayList<Lahore>();
        for (int i = 0; i < monumentImageResourceID.length; i++) {
            lahore.add(new Lahore(monuments[i], monumentImageResourceID[i]));
        }

        final TourAdapter adapter = new TourAdapter(getActivity(), lahore);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pos = position;
                Intent intent = new Intent(getActivity(), Description.class);
                intent.putExtra("Object", pos);
                intent.putExtra("FragmentNumber", 0);
                startActivity(intent);
            }

        });

        return rootView;
    }

}

package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Lahore> {
    public TourAdapter(Activity context, ArrayList<Lahore> lahore) {
        super(context, 0, lahore);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Lahore currentObject = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID title_text_view
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentObject.getTitle());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentObject.hasImage()) {


            imageView.setImageResource(currentObject.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;

    }

}


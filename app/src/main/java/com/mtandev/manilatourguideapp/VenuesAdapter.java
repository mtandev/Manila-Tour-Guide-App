package com.mtandev.manilatourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class VenuesAdapter extends ArrayAdapter<Venue> {

    private static final String LOG_TAG = VenuesAdapter.class.getSimpleName();

    public VenuesAdapter(Activity context, ArrayList<Venue> venues) {
        super(context, 0, venues);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Venue currentVenue = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.item_title);
        titleTextView.setText(currentVenue.getVenueTitle());

        TextView textTextView = (TextView) listItemView.findViewById(R.id.item_text);
        textTextView.setText(currentVenue.getVenueText());

        ImageView photoView = (ImageView) listItemView.findViewById(R.id.item_photo);
        photoView.setImageResource(currentVenue.getImageId());

        return listItemView;
    }

}

package com.mtandev.manilatourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WhattoseeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_list);

        TextView header = (TextView) findViewById(R.id.header);

        header.setText(R.string.whattosee);

        ImageView home = (ImageView) findViewById(R.id.home_icon);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whattoseeIntent = new Intent(WhattoseeActivity.this, MainActivity.class);
                startActivity(whattoseeIntent);
                finish();
            }
        });

        ImageView events = (ImageView) findViewById(R.id.events_icon);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventsIntent = new Intent(WhattoseeActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
                finish();
            }
        });

        ImageView hotels = (ImageView) findViewById(R.id.hotel_icon);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(WhattoseeActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
                finish();
            }
        });

        ImageView restaturants = (ImageView) findViewById(R.id.restaurant_icon);
        restaturants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(WhattoseeActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
                finish();
            }
        });

        ArrayList<Venue> venues = new ArrayList<Venue>();
        venues.add(new Venue(R.string.intramuros_title, R.string.intramuros_text, R.drawable.intramuros));
        venues.add(new Venue(R.string.pinto_title, R.string.pinto_text, R.drawable.pinto));
        venues.add(new Venue(R.string.nationalmuseum_title, R.string.nationalmuseum_text, R.drawable.nationalmuseum));
        venues.add(new Venue(R.string.ayala_title, R.string.ayala_text, R.drawable.ayalamuseum));

        VenuesAdapter venueAdapter = new VenuesAdapter(this, venues);

        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(venueAdapter);
    }
}

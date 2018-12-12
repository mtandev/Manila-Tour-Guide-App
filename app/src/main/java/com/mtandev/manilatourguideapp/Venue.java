package com.mtandev.manilatourguideapp;

public class Venue {

    private int itemTitle;
    private int itemText;
    private int imageId;

    public Venue(int vTitle, int vText, int imageResourceId) {
        itemTitle = vTitle;
        itemText = vText;
        imageId = imageResourceId;
    }

    public int getVenueTitle() {
        return itemTitle;
    }

    public int getVenueText() {
        return itemText;
    }

    public int getImageId() {
        return imageId;
    }
}

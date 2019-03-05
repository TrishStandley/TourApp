package com.example.android.tourguide;

public class Lahore {
    private String mTitle;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Lahore(String title, int ImageResourceId) {
        mTitle = title;
        mImageResourceId = ImageResourceId;
    }

    public Lahore(String title, int ImageResourceId, int AudioResourceId) {
        mTitle = title;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;
    }

    public Lahore(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



}

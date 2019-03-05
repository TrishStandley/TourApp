package com.example.android.tourguide;

import android.support.annotation.Nullable;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1) {
            return new MallsFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else if (position == 3) {
            return new HotelFragment();
        } else
            return new SongsFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_monuments);
        } else if (position == 1) {
            return mContext.getString(R.string.category_malls);
        } else if (position == 2) {
            return mContext.getString(R.string.category_food);
        } else if (position == 3) {
            return mContext.getString(R.string.category_hotels);
        } else
            return mContext.getString(R.string.category_songs);
    }

    @Override
    public int getCount() {
        return 5;
    }
}

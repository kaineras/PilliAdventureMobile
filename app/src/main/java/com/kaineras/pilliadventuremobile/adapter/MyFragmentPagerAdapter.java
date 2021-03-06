package com.kaineras.pilliadventuremobile.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created the first version by kaineras on 12/02/15.
 */
public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter{

    // List of fragments which are going to set in the view pager widget
    private List<Fragment> fragments;

    /**
     * Constructor
     *
     * @param fm interface for interacting with Fragment objects inside of an
     *           Activity
     */
    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fragments = new ArrayList<>();
    }
    /**
     * Add a new fragment in the list.
     *
     * @param fragment a new fragment
     */
    public void addFragment(Fragment fragment) {
        this.fragments.add(fragment);
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Página " + (position + 1);
    }
}

package com.example.zypher_uitask.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.zypher_uitask.BookMarksFragment;
import com.example.zypher_uitask.ContentFragment;
import com.example.zypher_uitask.NotesFragment;
import com.example.zypher_uitask.R;

import java.util.ArrayList;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

     private ArrayList<Fragment> fragments;
     private ArrayList<String> titles;
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        this.fragments = new ArrayList<>();
        this.titles = new ArrayList<>();
        addFragments(new ContentFragment(), "Content");
        addFragments(new BookMarksFragment(), "BookMarks");
        addFragments(new NotesFragment(), "Notes");
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return fragments.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    void addFragments(Fragment fragment, String title){
        fragments.add(fragment);
        titles.add(title);
    }

    @Override
    public int getCount() {
        // Show total pages.
        return fragments.size();
    }
}
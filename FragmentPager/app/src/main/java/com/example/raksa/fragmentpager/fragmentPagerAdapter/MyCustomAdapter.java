package com.example.raksa.fragmentpager.fragmentPagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.raksa.fragmentpager.fragment.BlankFragment;
import com.example.raksa.fragmentpager.fragment.SecondFragment;
import com.example.raksa.fragmentpager.fragment.ThirdFragment;

/**
 * Created by Raksa on 9/30/2017.
 */

public class MyCustomAdapter extends FragmentPagerAdapter {




    public MyCustomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new BlankFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                break;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

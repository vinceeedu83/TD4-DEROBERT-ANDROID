package com.example.lpsil24.td;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by lpsil24 on 26/09/2016.
 */
class ExamplePageAdapter extends FragmentStatePagerAdapter {
    TextFragment T1;
    NumberPickerFragment N1;
    public ExamplePageAdapter(FragmentManager fm,TextFragment T2,NumberPickerFragment N2) {
        super(fm);
        T1 = T2;
        N1 = N2;
    }
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return T1;
            default:
                return N1;
        }
    }
    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return "myFrag";
    }
}
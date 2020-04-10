package com.dertsizvebugsiz.news;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

class ViewPagerAdapter extends SmartFragmentStatePagerAdapter {

    private final List<Fragment> mList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return TestFragment.newInstance(i);
            case 1:
                return TestFragment.newInstance(i);
            case 2:
                return TestFragment.newInstance(i);
            case 3:
                return TestFragment.newInstance(i);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}

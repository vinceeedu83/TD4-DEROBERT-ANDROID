package com.example.lpsil24.td;

import android.app.FragmentTransaction;
import android.provider.ContactsContract;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.widget.NumberPicker;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements  NumberPickerFragment.OnActionListener {
    private ViewPager mViewPager;
    private ExamplePageAdapter mExamplePagerAdapter;
    private TextFragment TF;
    private NumberPickerFragment NPF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TF = new TextFragment();
        NPF = new NumberPickerFragment();
        mExamplePagerAdapter = new ExamplePageAdapter(getSupportFragmentManager(),TF,NPF);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mExamplePagerAdapter);
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

            }
        };
        actionBar.addTab(
                actionBar.newTab()
                        .setText("Text")
                        .setTabListener(tabListener));
        actionBar.addTab(
                actionBar.newTab()
                        .setText("Num")
                        .setTabListener(tabListener));

        mViewPager.setOnPageChangeListener(
            new ViewPager.SimpleOnPageChangeListener() {
                @Override
                public void onPageSelected(int position) {
// When swiping between pages, select the
// corresponding tab.
                    getSupportActionBar().setSelectedNavigationItem(position);
                }
            });

    }

    @Override
    public void onAction(int a) {
        TextView TV = (TextView) findViewById(R.id.TextView1);
        TV.setText(Integer.toString(a));
    }
}

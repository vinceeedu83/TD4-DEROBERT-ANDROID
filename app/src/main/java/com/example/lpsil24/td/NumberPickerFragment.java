package com.example.lpsil24.td;

import android.app.Activity;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

/**
 * Created by lpsil24 on 26/09/2016.
 */

public class NumberPickerFragment extends Fragment {
    OnActionListener mListener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.activity_numberpicker,container, false);
        NumberPicker NB=((NumberPicker)v.findViewById(R.id.numberPicker1));
        NB.setMinValue(0);
        NB.setMaxValue(100);
        NB.setWrapSelectorWheel(true);
        NB.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                mListener.onAction(newVal);
            }
        });
        return v;
    }
    public interface OnActionListener {

        public void onAction(int a);
    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnActionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnActionListener");
        }
    }

}

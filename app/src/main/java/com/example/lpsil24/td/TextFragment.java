package com.example.lpsil24.td;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lpsil24 on 26/09/2016.
 */
public class TextFragment extends Fragment {
    private View View1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View1 = inflater.inflate(R.layout.activity_textview,container , false);
        return View1;
    }
}

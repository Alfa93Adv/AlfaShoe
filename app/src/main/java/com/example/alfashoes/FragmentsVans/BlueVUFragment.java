package com.example.alfashoes.FragmentsVans;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alfashoes.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlueVUFragment extends Fragment {


    public BlueVUFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue_vu, container, false);
    }

}
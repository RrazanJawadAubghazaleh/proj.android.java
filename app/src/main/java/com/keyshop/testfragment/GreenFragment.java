package com.keyshop.testfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class GreenFragment extends Fragment {

    private Button bnCount;
    private Commounicater com;
    private int count = 0;
    private String COUNTER = "counter";

    public GreenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (savedInstanceState != null)
            count = savedInstanceState.getInt(COUNTER);
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_green, container, false);
        bnCount = v.findViewById(R.id.bn_counter);

        bnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.count(++count);
            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com = (MainActivity) getActivity();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(COUNTER, count);
    }
}

package com.keyshop.testfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BankFragment extends Fragment {

    private TextView tvCount;
    private  int counter=0;
    private String COUNTER = "counter";
    public BankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_bank, container, false);
       tvCount=v.findViewById(R.id.tv_count);

       //put this her coz must declar and inialize the textView to use it
       if(savedInstanceState != null){
           counter=savedInstanceState.getInt(COUNTER);
           tvCount.setText(""+counter);
       }
    return  v;}

    public void upDateTextCounter(int c){
        counter=c;
        tvCount.setText(""+counter);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(COUNTER,counter);
    }
}

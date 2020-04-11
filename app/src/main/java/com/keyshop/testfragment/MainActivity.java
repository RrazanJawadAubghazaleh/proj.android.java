package com.keyshop.testfragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Commounicater {

    BankFragment bankFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bankFragment = (BankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
    }

    @Override
    public void count(int x) {
        bankFragment.upDateTextCounter(x);
    }
}

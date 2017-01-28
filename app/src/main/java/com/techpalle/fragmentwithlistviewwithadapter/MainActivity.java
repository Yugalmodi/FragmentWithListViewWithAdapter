package com.techpalle.fragmentwithlistviewwithadapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FirstFragment firstFragment;
    ListvewAdapterFragment listvewAdapterFragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    public void buttonclick(String no, String name, String sal){
        fragmentManager = getSupportFragmentManager();
        listvewAdapterFragment = (ListvewAdapterFragment) fragmentManager.findFragmentByTag("frag2");
        listvewAdapterFragment.catcData(no, name, sal);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = new FirstFragment();
        listvewAdapterFragment = new ListvewAdapterFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        if(savedInstanceState == null) {
            fragmentTransaction.add(R.id.frame_layout1, firstFragment);
            fragmentTransaction.add(R.id.frame_layout2, listvewAdapterFragment, "frag2"); //"frag2" = TAG, It is generally string
            //tag is used to re-retrieve the data
        }
        fragmentTransaction.commit();
    }
}

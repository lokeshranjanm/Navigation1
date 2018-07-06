package com.example.lokeshranjan.navigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Gallery extends Fragment {
TextView t1,t2;

    public Gallery() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_gallery, container, false);
        t1=v.findViewById(R.id.textView2);
        t2=v.findViewById(R.id.textView3);
        //get the values from bundle
        Bundle b=getArguments();
        //assign the values
        if (b!=null) {
            t1.setText(b.getString("key1"));
            t2.setText(b.getString("key2"));
        }
        return v;
    }

}

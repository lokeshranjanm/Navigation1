package com.example.lokeshranjan.navigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment implements View.OnClickListener {
EditText ed1,ed2;
Button btn;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        ed1=v.findViewById(R.id.editText);
        ed2=v.findViewById(R.id.editText2);
        btn=v.findViewById(R.id.button);
        btn.setOnClickListener(this);
        return v;

    }


    @Override
    public void onClick(View view) {
        String s=ed1.getText().toString();
        String s1=ed1.getText().toString();
        Fragment fragment=new Gallery();
        //create obj Bundle
        Bundle b=new Bundle();
        //put thwe values from bundle
        b.putString("key1",s);
        b.putString("key2",s1);
        fragment.setArguments(b);
        FragmentManager fragmentManager=getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();



    }
}

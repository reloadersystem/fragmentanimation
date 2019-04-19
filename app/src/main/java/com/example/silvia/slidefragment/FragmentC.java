package com.example.silvia.slidefragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentC extends Fragment {
    View rootview;
    Button btnback, btnbackhome;


    public FragmentC() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_fragment_c, container, false);
        btnback = rootview.findViewById(R.id.btnBack);
        btnbackhome=rootview.findViewById(R.id.btnBackHome);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        btnbackhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               getActivity().getSupportFragmentManager().popBackStack("fragmentA",0);

            }
        });
        return rootview;
    }

}

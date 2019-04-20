package com.example.silvia.slidefragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    View  rootview;

    Button btn;


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview= inflater.inflate(R.layout.fragment_fragment_a, container, false);

        btn= rootview.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager manager= getActivity().getSupportFragmentManager();

                FragmentB fragmentB= new FragmentB();

                manager.beginTransaction()
                        //.setCustomAnimations(R.anim.enter_right_to_left,R.anim.exit_right_to_left,R.anim.fade_in, R.anim.fade_out)
                        .setCustomAnimations(R.anim.enter_right_to_left,R.anim.exit_right_to_left, R.anim.exit_left_to_right,R.anim.exit_left_to_right)
                        .replace(R.id.frame, fragmentB)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }
        });





        return rootview;
    }

}

package com.example.silvia.slidefragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager= getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        FragmentA fragmentA= new FragmentA();
        transaction.add(R.id.frame, fragmentA);
        transaction.addToBackStack("fragmentA");
        transaction.commit();


    }

    @Override
    public void onBackPressed() {


        //cuando esta en el primer fragment y lo doy atras

        if(getSupportFragmentManager().getBackStackEntryCount()==1)
        {
            finish();
            return;
        }

        super.onBackPressed();
    }
}

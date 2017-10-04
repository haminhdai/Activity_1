package com.example.hamin.activity_1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration configuration = getResources().getConfiguration();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction ;
        fragmentTransaction = fragmentManager.beginTransaction();

        if(configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            LM_Fragment lm_fragment = new LM_Fragment();
            fragmentTransaction.replace(android.R.id.content, lm_fragment);
        }
        else
        {
            PM_Fragment pm_fragment = new PM_Fragment();
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        /*setContentView(R.layout.activity_main);
        Log.d("onCreate","da goi onCreat");*/
    }


    /*
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","da goi onStart" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","da goi onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","da goi onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","da goi onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestrart","da goi onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","da goi onDestroy");
    }
    */
}

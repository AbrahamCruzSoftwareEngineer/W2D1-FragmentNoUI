package com.evolutiondso.www.fragmentnoui;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLoad = (Button)findViewById(R.id.btn_load);
        DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                android.app.FragmentManager fragmentManager = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                HelloFragment hello = new HelloFragment();
                fragmentTransaction.add(R.id.fragment_container,hello,"HELLO");
                fragmentTransaction.commit();
            }
        };
        btnLoad.setOnClickListener((View.OnClickListener) listener);
    }
}

package com.project_n.splashscreen;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity {

    Button pindahFr1, pindahFr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fragment );
        pindahFr1 = (Button) findViewById(R.id.fragment1);
        pindahFr2 = (Button) findViewById(R.id.fragment2);

        pindahFr1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                loadFragment(new FragmentFirst());
            }
        });

        pindahFr2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                loadFragment(new FragmentSecond());
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction fT = getSupportFragmentManager().beginTransaction();
        fT.replace(R.id.FrameFragment, fragment);
        fT.commit();
    }
}


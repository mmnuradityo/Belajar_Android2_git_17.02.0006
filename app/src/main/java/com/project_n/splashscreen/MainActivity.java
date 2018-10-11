package com.project_n.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.project_n.splashscreen.util.PreferenceHelper;

public class MainActivity extends AppCompatActivity {

    TextView tampilUser;
    PreferenceHelper instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampilUser = (TextView) findViewById(R.id.TamilUser);
        instance = PreferenceHelper.getInstance(getApplicationContext());
        tampilUser.setText(instance.getName());
    }

    public void AddUser(View view) {
        startActivity(new Intent(MainActivity.this, AddUser.class));
    }

    public void ViewUser(View view) {
        startActivity(new Intent(MainActivity.this, ViewUser.class));

    }

    public void PindahFragment(View view) {
        startActivity(new Intent(MainActivity.this, FragmentActivity.class));
    }

    public void PindahActivity(View view) {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));

    }
}

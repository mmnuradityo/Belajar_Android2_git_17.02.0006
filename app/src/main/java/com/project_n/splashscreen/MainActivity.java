package com.project_n.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.project_n.splashscreen.activity.AddUser;
import com.project_n.splashscreen.activity.DetailActivity;
import com.project_n.splashscreen.util.PreferenceHelper;

public class MainActivity extends AppCompatActivity {

    TextView tampilUser;
    PreferenceHelper instance;
    private Button buttonAddUser;
    private Button buttonListUser;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampilUser = (TextView) findViewById(R.id.TamilUser);
        instance = PreferenceHelper.getInstance(getApplicationContext());
        tampilUser.setText(instance.getName());

        editText = (EditText) findViewById(R.id.inputText);
        buttonAddUser = (Button) findViewById(R.id.addUser);
        buttonListUser = (Button) findViewById(R.id.listUser);
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

        buttonAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddUser.class);
                startActivity(intent);
            }
        });

        buttonListUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });


    }
}

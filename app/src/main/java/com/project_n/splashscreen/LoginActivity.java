package com.project_n.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.project_n.splashscreen.util.PreferenceHelper;

public class LoginActivity extends AppCompatActivity {

    EditText UserLogin, PasswordLogin;
    PreferenceHelper instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        UserLogin = (EditText) findViewById(R.id.ET_UserName);
        PasswordLogin = (EditText) findViewById(R.id.ET_UserPass);
        instance = PreferenceHelper.getInstance(getApplicationContext());


    }


    public void TombolLogin(View view) {
        String User = UserLogin.getText().toString();
        String Pass = PasswordLogin.getText().toString();
        Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_SHORT).show();
        instance.setLogin(true);
        instance.setName(User);
        instance.setPass(Pass);

        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);
    }
}

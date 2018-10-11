package com.project_n.splashscreen;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.project_n.splashscreen.util.DataHelper;

public class AddUser extends AppCompatActivity {

    EditText UserAdd, PassAdd;
    Button AddBTN;
    protected Cursor cursor;
    DataHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        UserAdd = (EditText) findViewById(R.id.ET_AddUserName);
        PassAdd = (EditText) findViewById(R.id.ET_AddUserPass);

        dbHelper = new DataHelper(this);

        AddBTN = (Button) findViewById(R.id.BtnAddUser);
        AddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //startActivity(new Intent(AddUser.this, LoginActivity.class));
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into biodata(nama, pass) values('" +
                        UserAdd.getText().toString() + "','" +
                        PassAdd.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }

}

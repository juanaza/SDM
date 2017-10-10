package com.example.juan.session2_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.relative_layout);
        setContentView(R.layout.constraint_layout);
        Button aceptar = (Button) findViewById(R.id.btnAceptar);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                checkPassword(v);
            }
        });
    }

    public void checkPassword(View view){
        EditText pass = (EditText) findViewById(R.id.password);

        EditText repass = (EditText) findViewById(R.id.repassword);
        if (pass.getText().toString().equals(repass.getText().toString())){
            Toast.makeText(getApplicationContext(), getString(R.string.correctPass), Toast.LENGTH_SHORT).show();
        }
    }
}
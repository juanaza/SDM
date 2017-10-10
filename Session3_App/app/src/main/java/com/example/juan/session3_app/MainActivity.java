package com.example.juan.session3_app;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Toast.makeText(this, "onCreate: Me estoy creando manen espera", Toast.LENGTH_SHORT).show();
        FloatingActionButton confirmPassword = (FloatingActionButton) findViewById(R.id.fab);
        confirmPassword.setOnClickListener(new View.OnClickListener() {
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
            Snackbar.make(view, "Contraseña valida", Snackbar.LENGTH_LONG).setAction("Action", new Cerrar()).show();
        }
        else{
            Snackbar.make(view, "Contraseña no valida", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(mIntent);
        }
    }

    public class Cerrar implements View.OnClickListener{
        @Override
        public void onClick(View v){
            finish();
        }
    }



    /*@Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart: Voy a ser mostrada al usuario toy activo manen", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume: Interactuando con el mano", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause: Taluego manen voy pal segundo plano", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStop: Dejo de estar visible", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart: Vuelvo de nuevo", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy: Salvame mano voy pal huerto", Toast.LENGTH_SHORT).show();
    }*/
}

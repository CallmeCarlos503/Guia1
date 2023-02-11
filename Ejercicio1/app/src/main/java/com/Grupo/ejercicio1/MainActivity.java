package com.Grupo.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText Nombre;
Button btnGenerar;
TextView msj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre=findViewById(R.id.txtNombre);
        msj=findViewById(R.id.txtmsj);

    }
    public void nombre(View view){

            String Name;
            Name=Nombre.getText().toString();
            msj.setText("Bienvenido "+Name);

    }
}
package com.Guia1.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText num;
 Button btn_num;
 TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=findViewById(R.id.txtnum);
        Resultado=findViewById(R.id.txtResultado);
    }
    public void Calculo(View view){
        try {
            int N=Integer.parseInt(num.getText().toString());
            Resultado.setText("numero de entrada: "+(N)+"\n N+77= "+(N=N+77)+"\n" +
                    "N-3= "+(N=N-3)+"\n N*2= "+(N*2));
        }catch (Exception ex){
            Resultado.setText("Error, asigne una numeracion");
        }


    }
}
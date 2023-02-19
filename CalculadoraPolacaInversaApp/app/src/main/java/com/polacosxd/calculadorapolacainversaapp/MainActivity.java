package com.polacosxd.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
   EditText n1,n2;
   Spinner SP_Signo;
   TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         n1=findViewById(R.id.txtn1);
         n2=findViewById(R.id.txtn2);
         Result= findViewById(R.id.txtResultado);
         SP_Signo=findViewById(R.id.spOpciones);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.spOpciones,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        SP_Signo.setAdapter(adapter);
    }
    public void Calculo(View view){
        try {
            int N1= Integer.parseInt(n1.getText().toString());
            int N2= Integer.parseInt(n2.getText().toString());
            Double division1= Double.parseDouble(n1.getText().toString());
            Double division2= Double.parseDouble(n2.getText().toString());
            String opciones= SP_Signo.getSelectedItem().toString();
            DecimalFormat formato1 = new DecimalFormat("#.00");

            switch (opciones){
                case"+":
                    Result.setText("resultado de la suma: "+(N1+N2));
                    break;
                case "-":
                    Result.setText("resultado de la resta: "+(N1-N2));
                    break;
                case "*":
                    Result.setText("resultado de la multiplicacion: "+(N1*N2));
                    break;
                case "/":
                    Result.setText("resultado de la division: "+formato1.format(division1/division2));
                    break;
                default:
                    Result.setText("no deberias de llegar a esta opcion");
                    break;
            }

        }
        catch (Exception ex){
            Result.setText("Error, asigne una numeracion por favor");
        }

    }
}
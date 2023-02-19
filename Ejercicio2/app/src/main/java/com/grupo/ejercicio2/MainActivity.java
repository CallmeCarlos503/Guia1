package com.grupo.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText Precio;
    Button btnCalcular;
    TextView Total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Precio=findViewById(R.id.txtprecio);
        Total=findViewById(R.id.txtresultado);
    }
    public void Calculo(View view ){
        Double precio,total;
        DecimalFormat formato1 = new DecimalFormat("#.00"); //! limitar decimales a 2 o mas
        try{
            precio=Double.parseDouble(Precio.getText().toString());
            Total.setText("IVA: 13.4%:"+formato1.format(precio*0.134)+"\n Total con el racargo: "+ formato1.format(precio+(precio*0.134)));
        }
        catch(Exception ex){
            Total.setText("Error, porfavor asigne un numero ");
        }
    }
}
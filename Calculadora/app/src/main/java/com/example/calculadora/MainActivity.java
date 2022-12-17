package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button boton0 = findViewById(R.id.bt_0);
        Button boton1 = findViewById(R.id.bt_1);
        Button boton2 = findViewById(R.id.bt_2);
        Button boton3 = findViewById(R.id.bt_3);
        Button boton4 = findViewById(R.id.bt_4);
        Button boton5 = findViewById(R.id.bt_5);
        Button boton6 = findViewById(R.id.bt_6);
        Button boton7 = findViewById(R.id.bt_7);
        Button boton8 = findViewById(R.id.bt_8);
        Button boton9 = findViewById(R.id.bt_9);

        Button botonComa = findViewById(R.id.bt_coma);
        Button botonIgual = findViewById(R.id.bt_igual);
        Button botonSuma = findViewById(R.id.bt_suma);
        Button botonResta = findViewById(R.id.bt_resta);
        Button botonMultiplicacion = findViewById(R.id.bt_multiplicacion);
        Button botonDivision = findViewById(R.id.bt_division);
        Button botonAc = findViewById(R.id.bt_AC);



    }
}
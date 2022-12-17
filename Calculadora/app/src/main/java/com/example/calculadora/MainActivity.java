package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String valorActual="0";
    TextView pantalla;
    char operacion = ' ';
    double valorAnterior;


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
        pantalla = findViewById(R.id.pantalla);

        refrescarPantalla();
    }

    public void clickDigito(View view){
        if (valorActual.equals("0")) {
            valorActual="";
        }
        switch(view.getId()){
            case R.id.bt_0:
                valorActual+=0;
                break;
            case R.id.bt_1:
                valorActual+=1;
                break;
            case R.id.bt_2:
                valorActual+=2;
                break;
            case R.id.bt_3:
                valorActual+=3;
                break;
            case R.id.bt_4:
                valorActual+=4;
                break;
            case R.id.bt_5:
                valorActual+=5;
                break;
            case R.id.bt_6:
                valorActual+=6;
                break;
            case R.id.bt_7:
                valorActual+=7;
                break;
            case R.id.bt_8:
                valorActual+=8;
                break;
            case R.id.bt_9:
                valorActual+=9;
                break;
        }
        refrescarPantalla();
    }

    public void refrescarPantalla(){
        pantalla.setText(valorActual);

    }
    public void coma(View view){
        if(valorActual.indexOf(",") >= 0){
            return;
        }
        valorActual+=",";
        refrescarPantalla();
    }
    public void operacion(View view){
        switch(view.getId()){
            case R.id.bt_suma:
                operacion= '+';
                break;
            case R.id.bt_resta:
                operacion= '-';
                break;
            case R.id.bt_multiplicacion:
                operacion='*';
                break;
            case R.id.bt_division:
                operacion='/';
                break;
        }
        String valorActualConvertido = valorActual.replace(',','.');
        valorAnterior=Double.parseDouble(valorActualConvertido);
        valorActual = "0";
        refrescarPantalla();
    }

    public void clickAC (View view){
        valorAnterior=0;
        valorActual="0";
        operacion=' ';
        refrescarPantalla();
    }

    public void clickIgual(View view){

    }

}
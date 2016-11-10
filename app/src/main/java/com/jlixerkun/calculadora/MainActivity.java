package com.jlixerkun.calculadora;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean decimal         = false,
            suma            = false,
            resta           = false,
            multiplicacion  = false,
            division        = false,
            raiz            = false,
            porciento       = false;

    double resultado = 0;

    Double[] numero = new Double[20];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Typeface font = Typeface.createFromAsset( getAssets(), "fontawesome-webfont.ttf" );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /* Definimos los botones de la calculadora */
        final Button btnNum0 = (Button) findViewById(R.id.btnNum0);
        btnNum0.setOnClickListener(this);
        final Button btnNum1 = (Button) findViewById(R.id.btnNum1);
        btnNum1.setOnClickListener(this);
        final Button btnNum2 = (Button) findViewById(R.id.btnNum2);
        btnNum2.setOnClickListener(this);
        final Button btnNum3 = (Button) findViewById(R.id.btnNum3);
        btnNum3.setOnClickListener(this);
        final Button btnNum4 = (Button) findViewById(R.id.btnNum4);
        btnNum4.setOnClickListener(this);
        final Button btnNum5 = (Button) findViewById(R.id.btnNum5);
        btnNum5.setOnClickListener(this);
        final Button btnNum6 = (Button) findViewById(R.id.btnNum6);
        btnNum6.setOnClickListener(this);
        final Button btnNum7 = (Button) findViewById(R.id.btnNum7);
        btnNum7.setOnClickListener(this);
        final Button btnNum8 = (Button) findViewById(R.id.btnNum8);
        btnNum8.setOnClickListener(this);
        final Button btnNum9 = (Button) findViewById(R.id.btnNum9);
        btnNum9.setOnClickListener(this);
        final Button btnPunto = (Button) findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener(this);

        final Button btnMas = (Button) findViewById(R.id.btnMas);
        btnMas.setOnClickListener(this);
        final Button btnMenos = (Button) findViewById(R.id.btnMenos);
        btnMenos.setOnClickListener(this);
        final Button btnPor = (Button) findViewById(R.id.btnPor);
        btnPor.setOnClickListener(this);
        final Button btnDividido = (Button) findViewById(R.id.btnDividido);
        btnDividido.setOnClickListener(this);
        final Button btnIgual = (Button) findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(this);
        final Button btnBorrar = (Button) findViewById(R.id.btnBorrar);
        btnBorrar.setTypeface(font);
        btnBorrar.setOnClickListener(this);
        final Button btnCero= (Button) findViewById(R.id.btnCero);
        btnCero.setTypeface(font);
        btnCero.setOnClickListener(this);
        final Button btnSalida = (Button) findViewById(R.id.btnSalida);
        btnSalida.setTypeface(font);
        btnSalida.setOnClickListener(this);

    }

    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.textViewMain);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();

        try {

            switch (seleccion) {
                case R.id.btnNum0:
                    pantalla.setText(a + "0");
                    break;
                case R.id.btnNum1:
                    pantalla.setText(a + "1");
                    break;
                case R.id.btnNum2:
                    pantalla.setText(a + "2");
                    break;
                case R.id.btnNum3:
                    pantalla.setText(a + "3");
                    break;
                case R.id.btnNum4:
                    pantalla.setText(a + "4");
                    break;
                case R.id.btnNum5:
                    pantalla.setText(a + "5");
                    break;
                case R.id.btnNum6:
                    pantalla.setText(a + "6");
                    break;
                case R.id.btnNum7:
                    pantalla.setText(a + "7");
                    break;
                case R.id.btnNum8:
                    pantalla.setText(a + "8");
                    break;
                case R.id.btnNum9:
                    pantalla.setText(a + "9");
                    break;
                case R.id.btnPunto:
                    if (decimal == false) {
                        pantalla.setText(a + ".");
                        decimal = true;
                    } else {
                        return;
                    }
                    break;
                case R.id.btnCero:
                    pantalla.setText("");
                    suma = false;
                    resta = false;
                    multiplicacion = false;
                    division = false;
                    decimal = false;
                    break;
                case R.id.btnBorrar:
                    if(a.length() > 0){
                        int longitud = a.length();
                        a = a.substring(0,longitud-1);
                        numero[0] = Double.parseDouble(a);
                        pantalla.setText(a);
                    } else {
                        // Aquí hay un error aún.
                        // no entra al else
                        // revisar
                        pantalla.setText("");
                        numero[0]=0.0;
                        decimal = false;
                    }
                    break;
                case R.id.btnMas:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnMenos:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnPor:
                    multiplicacion = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnDividido:
                    division = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnIgual:
                    numero[1] = Double.parseDouble(a);

                    if (suma) {
                        resultado = numero[0] + numero[1];
                        pantalla.setText(String.valueOf(resultado));
                        suma = false;
                    }
                    if (resta) {
                        resultado = numero[0] - numero[1];
                        pantalla.setText(String.valueOf(resultado));
                        resta = false;
                    }
                    if (multiplicacion) {
                        resultado = numero[0] * numero[1];
                        pantalla.setText(String.valueOf(resultado));
                        multiplicacion = false;
                    }
                    if (division) {
                        resultado = numero[0] / numero[1];
                        pantalla.setText(String.valueOf(resultado));
                        division = false;
                    }
                    break;
                case R.id.btnSalida:
                    Intent salida = new Intent(Intent.ACTION_MAIN);
                    finish();
                    break;
            }
        } catch (Exception e) {
            pantalla.setText("#Error");
        }
    }

}

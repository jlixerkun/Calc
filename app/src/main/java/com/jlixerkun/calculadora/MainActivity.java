package com.jlixerkun.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    float valor1, valor2;
    boolean suma, resta, multiplicacion, division, raiz, porciento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        /* Definimos los botones de la calculadora */
        final Button btnNum0 = (Button) findViewById(R.id.btnNum0);
        final Button btnNum1 = (Button) findViewById(R.id.btnNum1);
        final Button btnNum2 = (Button) findViewById(R.id.btnNum2);
        final Button btnNum3 = (Button) findViewById(R.id.btnNum3);
        final Button btnNum4 = (Button) findViewById(R.id.btnNum4);
        final Button btnNum5 = (Button) findViewById(R.id.btnNum5);
        final Button btnNum6 = (Button) findViewById(R.id.btnNum6);
        final Button btnNum7 = (Button) findViewById(R.id.btnNum7);
        final Button btnNum8 = (Button) findViewById(R.id.btnNum8);
        final Button btnNum9 = (Button) findViewById(R.id.btnNum9);
        final Button btnPunto = (Button) findViewById(R.id.btnPunto);

        final Button btnMas = (Button) findViewById(R.id.btnMas);
        final Button btnMenos = (Button) findViewById(R.id.btnMenos);
        final Button btnPor = (Button) findViewById(R.id.btnPor);
        final Button btnDividido = (Button) findViewById(R.id.btnDividido);
        final Button btnPorciento = (Button) findViewById(R.id.btnPorciento);
        final Button btnIgual = (Button) findViewById(R.id.btnIgual);
        final Button btnBorrar = (Button) findViewById(R.id.btnBorrar);
        final Button btnCero= (Button) findViewById(R.id.btnCero);
        final Button btnRaiz= (Button) findViewById(R.id.btnRaiz);

//        Definimos el display  donde se ven las operaciones
        final TextView display = (TextView) findViewById(R.id.textViewMain);



// BOTONES NUMÉRICOS


        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"0");
            }
        });

        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"1");
            }
        });
        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"2");
            }
        });

        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"3");
            }
        });

        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"4");
            }
        });

        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"5");
            }
        });

        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"6");
            }
        });

        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"7");
            }
        });

        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"8");
            }
        });

        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+"9");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(display.getText()+".");
            }
        });


//        BOTONES DE OPERACIONES

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(null);
            }
        });

        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display == null){
                    display.setText("");
                } else {
                    valor1 = Float.parseFloat(display.getText() + "");
                    suma = true;
                    display.setText(null);
                }
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Float.parseFloat(display.getText() + "");
                resta = true;
                display.setText(null);
            }
        });

        btnPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Float.parseFloat(display.getText() + "");
                multiplicacion = true;
                display.setText(null);
            }
        });

        btnDividido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Float.parseFloat(display.getText() + "");
                division = true;
                display.setText(null);
            }
        });



        btnPorciento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Float.parseFloat(display.getText() + "");
                porciento = true;
                display.setText(null);
            }
        });


        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor2 = Float.parseFloat(display.getText() + "");
                if(suma == true){
                    display.setText(valor1+valor2+"");
                    suma = false;
                }
                if(resta == true){
                    display.setText(valor1-valor2+"");
                    resta = false;
                }
                if(multiplicacion == true){
                    display.setText(valor1*valor2+"");
                    multiplicacion = false;
                }
                if(division == true){
                    display.setText(valor1/valor2+"");
                    division = false;
                }
                if(porciento == true){
                    display.setText(valor1*(valor2/100)+"");
                    porciento = false;
                }
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(Math.sqrt(Float.parseFloat(display.getText() + ""))+"");
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display.getText().length()>0){
                    display.setText(display.getText().subSequence(0,display.getText().length()-1));
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

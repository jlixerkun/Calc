package com.jlixerkun.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

        Button btnPorciento = (Button) findViewById(R.id.btnPorciento);
        Button btnMas = (Button) findViewById(R.id.btnMas);
        Button btnMenos = (Button) findViewById(R.id.btnMenos);
        Button btnPor = (Button) findViewById(R.id.btnPor);
        Button btnDividido = (Button) findViewById(R.id.btnDividido);
        Button btnBorrar = (Button) findViewById(R.id.btnBorrar);
        Button btnCero= (Button) findViewById(R.id.btnCero);
        Button btnRaiz= (Button) findViewById(R.id.btnRaiz);

//        Definimos el display  donde se ven las operaciones
        final TextView display = (TextView) findViewById(R.id.textViewMain);



//        Definimos un stack para mostrar todos los numeros

        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(btnNum0.getText());
            }
        });
        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                display.setText(btnNum1.getText());
            }
        });

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });



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

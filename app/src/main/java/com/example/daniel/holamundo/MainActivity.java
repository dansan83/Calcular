package com.example.daniel.holamundo;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView myTextView, myTextView2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        View v1 = findViewById(R.id.myTextView);
        myTextView = (TextView) v1;
        myTextView.setText("");

        View v2 = findViewById(R.id.myTextView2);
        myTextView2 = (TextView) v2;
        myTextView2.setText("");

        View button0 = findViewById(R.id.button0);
        button0.setOnClickListener(this);

        View button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        View button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        View button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

        View button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);

        View button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);

        View button6 = findViewById(R.id.button6) ;
        button6.setOnClickListener(this);

        View button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);

        View button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);

        View button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);

        View buttonPunto = findViewById(R.id.buttonPunto);
        buttonPunto.setOnClickListener(this);

        View buttonLimpiar = findViewById(R.id.buttonLimpiar);
        buttonLimpiar.setOnClickListener(this);

        View buttonSuma = findViewById(R.id.buttonSuma);
        buttonSuma.setOnClickListener(this);

        View buttonResta = findViewById(R.id.buttonResta);
        buttonResta.setOnClickListener(this);

        View buttonMultiplicar = findViewById(R.id.buttonMultiplicar);
        buttonMultiplicar.setOnClickListener(this);

        final Button buttonIgual = (Button) findViewById(R.id.buttonIgual);
        buttonIgual.setOnClickListener(this);

    }

    double result, numero1 = 0, numero2 = 0;
    char operacion = '+';

    public void onClick(View v) {
        if (v.getId() == R.id.button0)
            myTextView.append("0");
        else if (v.getId() == R.id.button1)
            myTextView.append("1");
        else if (v.getId() == R.id.button2)
            myTextView.append("2");
        else if (v.getId() == R.id.button3)
            myTextView.append("3");
        else if (v.getId() == R.id.button4)
            myTextView.append("4");
        else if (v.getId() == R.id.button5)
            myTextView.append("5");
        else if (v.getId() == R.id.button6)
            myTextView.append("6");
        else if (v.getId() == R.id.button7)
            myTextView.append("7");
        else if (v.getId() == R.id.button8)
            myTextView.append("8");
        else if (v.getId() == R.id.button9)
            myTextView.append("9");
        else if (v.getId() == R.id.buttonPunto)
            myTextView.append(".");
        else if (v.getId() == R.id.buttonLimpiar) {
            myTextView.setText("");
            myTextView2.setText("");
            numero1 = 0;
            operacion = '+';
        } else if (v.getId() == R.id.buttonSuma) calcular('+');
        else if (v.getId() == R.id.buttonResta) calcular('-');
        else if (v.getId() == R.id.buttonMultiplicar) calcular('*');
        else if (v.getId() == R.id.buttonDivide) calcular('/');
        else if (v.getId() == R.id.buttonIgual) calcular('=');
    }

    public void calcular(char a) {
         double result=numero1;
        String cadena = myTextView.getText().toString();
        try {
            numero2 = Double.parseDouble(cadena);
            if (operacion == '+') result = numero1 + numero2;
            else if (operacion == '-') result = numero1 - numero2;
            else if (operacion == '*') result = numero1 * numero2;
            else if (operacion == '/') result = numero1 / numero2;
            numero1 = result;
            operacion = a;
            if (a == '=') {
                //myTextView.setText("");
                myTextView2.setText("" + numero1);
            } else {
                myTextView.setText("");
                myTextView2.setText("" + numero1);
            }

        } catch (Exception nfe) {
            myTextView.setText(" no es valida la operación");
        }
    }
}


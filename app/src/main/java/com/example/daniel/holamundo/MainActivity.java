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

        final Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);

        View button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);

        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);

        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        final Button buttonPunto = (Button) findViewById(R.id.buttonPunto);
        buttonPunto.setOnClickListener(this);

        final Button buttonLimpiar = (Button) findViewById(R.id.buttonLimpiar);
        buttonLimpiar.setOnClickListener(this);

        final Button buttonSuma = (Button) findViewById(R.id.buttonSuma);
        buttonSuma.setOnClickListener(this);

        final Button buttonResta = (Button) findViewById(R.id.buttonResta);
        buttonResta.setOnClickListener(this);

        final Button buttonMultiplicar = (Button) findViewById(R.id.buttonMultiplicar);
        buttonMultiplicar.setOnClickListener(this);

        final Button buttonIgual = (Button) findViewById(R.id.buttonIgual);
        buttonIgual.setOnClickListener(this);

    }

    double result, m1 = 0, m2 = 0;
    char op1 = '+';

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
            m1 = 0;
            op1 = '+';
        }
        else if (v.getId() == R.id.buttonSuma) calcula ('+');
        else if (v.getId() == R.id.buttonResta) calcula ('-');
        else if (v.getId() == R.id.buttonMultiplicar) calcula ('*');
        else if (v.getId() == R.id.buttonDivide) calcula ('/');
        else if (v.getId() == R.id.buttonIgual) calcula ('=');
    }

    public void calcula (char op){
        double result=m1;
        String cadena= myTextView.getText().toString();
        try{
            m2=Double.parseDouble(cadena);
            if(op1=='+') result=m1+m2;
            else if (op1=='-') result=m1-m2;
            else if (op1=='*') result=m1*m2;
            else if (op1=='/') result=m1/m2;
            m1=result;
            op1=op;
            if (op1=='='){
               //myTextView.setText("");
                myTextView2.setText(""+m1);
            }else {
                myTextView.setText("");
                myTextView2.setText(""+m1);
            }

        }catch (NumberFormatException nfe){
            Toast.makeText(this,"numero incorrecto",1).show();
        }
    }

}
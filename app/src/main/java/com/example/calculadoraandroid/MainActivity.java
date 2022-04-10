package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    private Button buttonSuma;
    private Button buttonResta;
    private Button buttonMulti;
    private Button buttonDiv;
    private Button buttonClear;
    private Button buttonComa;
    private Button buttonIgual;
    private TextView resultado;

    private String operacion;
    private Double numero1=0.0;
    private Double numero2=0.0;

    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton radioButtonSuma;
    private RadioButton radioButtonSResta;
    private RadioButton radioButtonMulti;
    private RadioButton radioButtonDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        buttonSuma = findViewById(R.id.buttonSuma);
        buttonResta = findViewById(R.id.buttonResta);
        buttonMulti = findViewById(R.id.buttonMult);
        buttonDiv = findViewById(R.id.buttonDivision);
        buttonIgual = findViewById(R.id.buttonResult);
        buttonClear = findViewById(R.id.buttonClear);
        buttonComa = findViewById(R.id.buttonComa);
        resultado = findViewById(R.id.textView);

        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        radioButtonSuma = findViewById(R.id.RadioButtonSuma);
        radioButtonSResta = findViewById(R.id.RadioButtonResta);
        radioButtonMulti = findViewById(R.id.RadioButtonMult);
        radioButtonDiv = findViewById(R.id.RadioButtonDiv);

        checkBox.setOnClickListener(view -> {
            if(checkBox.isChecked())
                radioGroup.setVisibility(View.VISIBLE);
            else {
                radioGroup.setPadding(0,0,0,0);
                radioGroup.setVisibility(View.INVISIBLE);
                buttonSuma.setEnabled(true);
                buttonResta.setEnabled(true);
                buttonMulti.setEnabled(true);
                buttonDiv.setEnabled(true);
            }
        });

        radioButtonSuma.setOnClickListener(view -> {
            buttonSuma.setEnabled(false);
        });

        radioButtonSResta.setOnClickListener(view -> {
            buttonResta.setEnabled(false);
        });

        radioButtonMulti.setOnClickListener(view -> {
            buttonMulti.setEnabled(false);
        });

        radioButtonDiv.setOnClickListener(view -> {
            buttonDiv.setEnabled(false);
        });


        button0.setOnClickListener(this);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonSuma.setOnClickListener(this);

        buttonResta.setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonComa.setOnClickListener(this);

        buttonIgual.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        try{
            if(view instanceof Button){
                Button button = (Button) view;

                if(button==button0){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+button.getTag().toString());


                }else if(button==button1){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+"1");


                }else if(button==button2){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+"2");


                }else if(button==button3){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+"3");


                }else if(button==button4){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+"4");


                }else if(button==button5){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+"5");


                }else if(button==button6){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+"6");


                }else if(button==button7){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+"7");


                }else if(button==button8){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+"8");


                }else if(button==button9){
                    if (resultado.getText().equals("0"))
                        resultado.setText(button.getTag().toString());
                    else
                        resultado.setText(resultado.getText()+"9");


                }else if(button==buttonComa)
                    resultado.setText(resultado.getText()+".");


                if(button==buttonSuma){
                    operacion = "+";
                    numero1 = Double.valueOf(resultado.getText().toString());
                    resultado.setText(" ");

                }else if(button == buttonResta){
                    operacion = "-";
                    numero1 = Double.valueOf(resultado.getText().toString());
                    resultado.setText(" ");

                }else if(button == buttonMulti){
                    operacion = "*";
                    numero1 = Double.valueOf(resultado.getText().toString());
                    resultado.setText(" ");

                }else if(button == buttonDiv){
                    operacion = "/";
                    numero1 = Double.valueOf(resultado.getText().toString());
                    resultado.setText(" ");

                }else if(button == buttonClear)
                    resultado.setText("0");

                else if(button == buttonIgual)
                    calculo();

            }

        }catch (Exception e){
            Toast.makeText(this, "No has elegido el segundo operando", Toast.LENGTH_SHORT).show();
        }

    }

    private double suma(double n1, double n2) {
        double r;
        r = n1+n2;
        return r;
    }

    private double resta(double n1, double n2) {
        double r;
        r = n1-n2;
        return r;
    }

    private double division(double n1, double n2) {
        double r;
        r = n1/n2;
        return r;
    }

    private double multiplicacion(double n1, double n2) {
        double r;
        r = n1*n2;
        return r;
    }

    private void calculo(){

        numero2 = Double.valueOf(resultado.getText().toString());
        Double calcular;

        if (operacion == "+") {
            calcular = suma(numero1, numero2);
            resultado.setText(calcular + " ");

        } else if (operacion == "-") {
            calcular = resta(numero1, numero2);
            resultado.setText(calcular + " ");
        } else if (operacion == "*") {
            calcular = multiplicacion(numero1, numero2);
            resultado.setText(calcular + " ");
        } else if (operacion == "/") {
            calcular = division(numero1, numero2);
            resultado.setText(calcular + " ");
        }
    }
}
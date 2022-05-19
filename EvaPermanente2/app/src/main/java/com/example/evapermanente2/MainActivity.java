package com.example.evapermanente2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etDato;
    ClaseBase claseBase = new ClaseBase();
    TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDato = findViewById(R.id.tv_datos);
        respuesta = findViewById(R.id.tv_respuesta);
        mNumAleatorio();
    }

    public void  btnMostrar (View v){

        claseBase.atributoUno = Integer.parseInt(etDato.getText().toString());

        for (int i = 0; i == claseBase.atributoUno; i++ ){

            respuesta.setText("" + claseBase.devolverCadena());

        }
    }

    /*public void btnAlearioNumero (View v){

        int numAleatorio = (int) ClaseBase.atributoDos;
        correo.atributoUno = Integer.parseInt(etDato.getText().toString());

        if (numAleatorio == correo.atributoUno) {
            respuesta.setText("Correcto!! es: " + numAleatorio);
            mNumAleatorio();
            etDato.setText("");
        } else
        {
            respuesta.setText("Ohh :(, fallaste, intentalo de nuevo " + "\n");
            String pista;
            if (numAleatorio > correo.atributoUno)
            {
                 pista = "mayor";
            } else {
                pista = "menor";
            }
            respuesta.append("Te dare una pista: es " + pista);

        }
    }*/

    private void mNumAleatorio (){
        ClaseBase.atributoDos = Math.random()*10+1;
    }
/*
    public void btnEnviarMensaje (View v)
    {
        String usuarioDestino = etDato.getText().toString();
        etDato.setText("" + usuarioDestino + correo.devolverCaracter()+ "gmail.com");
        respuesta.setText("Mensaje enviado:" + "\n");
        respuesta.append("mensaje: " + correo.devolverCadena());
    }*/
}
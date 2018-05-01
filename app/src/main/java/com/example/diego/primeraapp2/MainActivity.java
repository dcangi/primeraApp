package com.example.diego.primeraapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        mostrarResultado();
    }

    public void contadorIncrementar (View vista){
        contador++;
        mostrarResultado();
    }
    public void contadorDecrementar (View vista){
        contador--;
        mostrarResultado();
    }
    public void contadorResetear (View vista){
        contador = 0;
        mostrarResultado();
    }
    public void mostrarResultado (){

        TextView textoResultado = (TextView)findViewById(R.id.textoMostrarContador);

        textoResultado.setText("Contador: " + contador );
    }
}

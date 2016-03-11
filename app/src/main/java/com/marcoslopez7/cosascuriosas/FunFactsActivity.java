package com.marcoslopez7.cosascuriosas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends AppCompatActivity {

    //Miembros de la clase
    private FactBook factBook;
    private ColorWheel colorWheel;

    //Miembros de la clase que representa la interfaz de la vista
    private TextView factText;
    private Button button;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        //Aquí comienza a correr nuestro código
        factText = (TextView) findViewById(R.id.datoCurioso); //Apuntamos al text view de la interfaz
        button = (Button) findViewById(R.id.boton);//Apuntamos al botón de la interfaz
        relativeLayout = (RelativeLayout) findViewById(R.id.pantalla); //Apuntamos al relativeLayout

        factBook = new FactBook(); //Inicialializamos el nuevo tipo de dato que acabamos de crear
        colorWheel = new ColorWheel(); //inicializamos la variable tipo Color Wheel

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aquí le damos funcionalidad al botón
                String fact = "";
                int color;

                fact = factBook.getFact(); //obtenemos un nuevo de dato con ayuda del nuevo objeto que creamos
                color = colorWheel.getColor();

                factText.setText(fact); //mostramos en la pantalla
                relativeLayout.setBackgroundColor(color); //Aquí cambiamos el color de la pantalla
                button.setTextColor(color);//Aquí cambiamos el color de texto del botón
            }
        });
    }
}

package com.marcoslopez7.cosascuriosas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    //Miembros de la clase
    private TextView factText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        //Aquí comienza a correr nuestro código
        factText = (TextView) findViewById(R.id.datoCurioso); //Apuntamos al text view de la interfaz
        button = (Button) findViewById(R.id.boton);//Apuntamos al botón de la interfaz

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aquí le damos funcionalidad al botón
                String fact = "El Real Madrid es el mejor de la historia, porque tiene 10 champions, y el barca no";
                factText.setText(fact);
            }
        });
    }
}

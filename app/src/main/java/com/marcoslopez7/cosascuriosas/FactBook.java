package com.marcoslopez7.cosascuriosas;

import java.util.Random;

/**
 * Created by marcoslopez7 on 11/03/16.
 */
public class FactBook {

    private String[] facts = {
            "Historiadores dicen que Giusseppe Garibaldi celebró la heroica campaña de unificación de Italia, comiendo pizza.",
            "En el mundo hay mil millones de fumadores y 240 millones de personas que abusan del alcohol",
            "El primer objeto que se comercializó con la imagen de Mickey fue un reloj.",
            "En el apogeo del imperio, el 50 por ciento del presupuesto de la Roma antigua se utilizaba para pagar el ejército.",
            "Según un estudio las mujeres lloran un promedio de 30 a 64 veces al año. Los hombres lo hacen un promedio de 6 veces al año.",
            "La carne de cabra contiene 45 % menos de grasa saturada que la carne de pollo.",
            "En 2005 un equipo de médicos realizaron en Francia el primer trasplante parcial de cara.",
            "Escribir tus emociones tiene beneficios para la salud. Estudios han encontrado que la escritura expresiva ayuda a sanar las heridas.",
            "Las Cuevas de Hielo Eisriesenwelt en Austria, son las cuevas de hielo más grandes del mundo. Fueron descubiertas en el siglo XIX.",
            "En solo 30 minutos tu cuerpo produce suficiente calor para hervir medio litro de agua."
    }; //arreglo de datos

    public String getFact(){

        Random randomGenerator = new Random(); //inicializamos una variable de tipo random
        int randomNumber = randomGenerator.nextInt(facts.length); //definimos un rando de números aleatorios

        return facts[randomNumber]; //se selecciona el dato dependiendo del número aleatorio
    }
}

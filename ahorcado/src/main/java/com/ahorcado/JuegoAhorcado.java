package com.ahorcado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JuegoAhorcado {

    private List<String> palabraOculta;
    private List<String> letrasAdivinadas;
    private int intentosRestantes;
    private List<String> letrasIncorrectas;

    public JuegoAhorcado(){
        inicializarJuego();
    }

    private void inicializarJuego(){
        String[] palabrasadivinar = {"java", "mysql", "springboot", "nodejs"};
        Random r = new Random();
        String palabraadivinar = palabrasadivinar[r.nextInt(palabrasadivinar.length)];

        palabraOculta = new ArrayList<>(Arrays.asList(palabraadivinar.split("")));
        letrasAdivinadas = new ArrayList<>();
        for (int i = 0; i < palabraOculta.size(); i++) {
            letrasAdivinadas.add("_");
        }
        intentosRestantes = 3;
        letrasIncorrectas = new ArrayList<>();
    }
    

    public List<String> getPalabraOculta() {
        return palabraOculta;
    }

    public List<String> getLetrasAdivinadas() {
        return letrasAdivinadas;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public List<String> getLetrasIncorrectas() {
        return letrasIncorrectas;
    }

    public void adivinarLetra(String letra){
        letra = letra.toLowerCase();
        if (palabraOculta.contains(letra)) {
            for (int i = 0; i < palabraOculta.size(); i++) {
                if (palabraOculta.get(i).equals(letra)) {
                    letrasAdivinadas.set(i, letra);
                }
            }    
        } else if (!letrasIncorrectas.contains(letra)) {
            intentosRestantes--;
            letrasIncorrectas.add(letra);
        } else if(letrasIncorrectas.contains(letra) || letrasAdivinadas.contains(letra) ) {
            System.out.println("Esta letra ya se ingresó");
        }
    }
    

    public boolean juegoTerminado() {
        return intentosRestantes == 0 || !letrasAdivinadas.contains("_");
    }

    public boolean juegoGanado(){
        return !letrasAdivinadas.contains("_");
    }
}

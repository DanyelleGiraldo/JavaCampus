package com.ahorcado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JuegoAhorcado juego = new JuegoAhorcado();

        while (!juego.juegoTerminado()){
            System.out.println("Palabra: "+ String.join(" ", juego.getLetrasAdivinadas()));
            System.out.println("Intentos restantes: "+ juego.getIntentosRestantes());
            System.out.println("Letras incorrectas: "+ String.join(", ", juego.getLetrasIncorrectas()));
            System.out.println("Ingrese una letra: ");
            String letra = sc.nextLine();

            if(letra == null || letra.isEmpty() || letra.length() != 1 || !Character.isLetter(letra.charAt(0))){
                System.out.println("Porfavor ingrese un solo caracter valido");
            }
            juego.adivinarLetra(letra);

            if(juego.juegoGanado()){
                System.out.println("Has ganado adivinaste la palabra: "+ String.join("", juego.getLetrasAdivinadas()));
            }
        }

        if(!juego.juegoGanado()){
            System.out.println("Perdiste, has sido ahorcado");
            System.out.println("La palabra correcta era: " + String.join("", juego.getPalabraOculta()));
        }

    }
}
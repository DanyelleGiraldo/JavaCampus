package com.arraylists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // --
        list.add("Backend Java");
        list.add(0,"Fundamentos");
        System.out.println(list);
        // --
        String elemento = list.get(0);
        System.out.println(elemento);
        // --
        list.set (0,"Programacion web");
        System.out.println(list);
        // --
        String eliminado = list.remove(1);
        System.out.println(eliminado);

        // --
        list.add("Pasteleria");
        boolean result = list.remove("Pasteleria");
        // --
        System.out.println(result);
    }
}
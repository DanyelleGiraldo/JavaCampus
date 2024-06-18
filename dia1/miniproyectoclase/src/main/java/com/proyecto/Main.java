package com.proyecto;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Estudiante myestudiante = new Estudiante();
        ArrayList<Estudiante> lsStudents = new ArrayList<>();
        Estudiante student;

        try(Scanner sc = new Scanner(System.in)){
            while(JOptionPane.showConfirmDialog(null, "Quiere agregar un estudiante?", "Informacion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE)== 0){
                student = new Estudiante();
                System.out.println("Ingrese el nombre del estudiante");
                student.setNombre(sc.nextLine());
                System.out.println("Ingrese el apellido del estudiante");
                student.setApellido(sc.nextLine());
                System.out.println("Ingrese la edad del estudiante");
                student.setEdad(sc.nextInt());
                sc.nextLine();
                lsStudents.add(student);
            }
        }
        
        for(Estudiante item : lsStudents){
            System.out.println(item.getNombre());
        }

    }

    

}
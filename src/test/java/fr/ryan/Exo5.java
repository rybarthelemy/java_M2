package fr.ryan;

import java.util.Scanner;


public class Exo5 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // récupérer le nombre 
        System.out.print("Entrez un nom ");
        String nom = clavier.next();

        clavier.close();
        
        System.out.println(Character.isUpperCase(nom.charAt(0)));
    }

}

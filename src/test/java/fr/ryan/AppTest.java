package fr.ryan;

import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // récupérer le nombre 
        System.out.print("Entrez un nombre ");
        int nombre = clavier.nextInt();

        clavier.close();

        if ( nombre % 2 == 0) {
            System.out.println(nombre + " est pair");
        } 
        System.out.println(nombre + " est impair");
       
    }

}

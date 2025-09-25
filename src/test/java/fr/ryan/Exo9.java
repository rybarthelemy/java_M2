package fr.ryan;

import java.util.Scanner;


public class Exo9 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // récupérer un phrase
        System.out.print("Entrez une année ");
        int annee = clavier.nextInt();

        clavier.close();

        if (annee % 400 == 0) {
            System.out.println("True");
        } else if (annee % 100 == 0) {
            System.out.println("False");
        } else if (annee % 4 == 0) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

}

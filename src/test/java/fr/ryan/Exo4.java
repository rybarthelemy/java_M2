package fr.ryan;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // récupérer le nombre 
        System.out.print("Quelle  couleur souhaitez-vous ? ");
        String lettres = clavier.next();

        clavier.close();
        String lettre = lettres.toUpperCase();

        if (lettre.length() == 1) {

            if (lettre.equals("R")) {
                System.out.println("Vous avez choisi le Rouge.");
            } else if (lettre.equals("B")) {
                System.out.println("Vous avez choisi le bleu.");
            }else if (lettre.equals("V")) {
                System.out.println("Vous avez choisi le vert.");
            } else {
                System.out.println("Connais pas");
            }

        }
    }

}

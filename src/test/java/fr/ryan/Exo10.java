package fr.ryan;

import java.util.Scanner;


public class Exo10 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // récupérer un phrase
        System.out.print("Entrez un mois (Entre 1 et 12) ");
        int mois = clavier.nextInt();
        System.out.print("Entrez une année ");
        int annee = clavier.nextInt();

        clavier.close();



        if ( mois < 1 || mois > 12) {
            System.out.println("Le mois doit être entre 1 et 12");
        } else if ( mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
            System.out.println(31 + " Jours");
        } else if ( mois == 4 || mois == 6 || mois == 9 || mois == 11 ) {
            System.out.println(30 + " Jours");
        } else if ((annee % 4 == 0) && (annee % 100 != 0|| annee % 400 == 0)) {
            System.out.println(29 + " Jours");
        } else {
            System.out.println(28 + " Jours");
        }

    }

}

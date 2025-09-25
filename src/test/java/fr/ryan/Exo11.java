package fr.ryan;

import java.time.YearMonth;
import java.util.Scanner;


public class Exo11 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        // récupérer une phrase
        System.out.print("Entrez un mois (Entre 1 et 12) ");
        int mois = clavier.nextInt();
        System.out.print("Entrez une année ");
        int annee = clavier.nextInt();

        clavier.close();

        YearMonth ym = YearMonth.of(annee, mois);

        System.out.println(ym.lengthOfMonth() + " jours");


    }

}

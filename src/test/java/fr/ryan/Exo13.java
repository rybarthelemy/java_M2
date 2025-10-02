package fr.ryan;

import java.util.Scanner;


public class Exo13 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        // récupérer le nombre d'entiers qu'elle devra traiter
        System.out.print("Combien d'entiers ? ");
        int CbEntier = clavier.nextInt();
        int totalEntier = 0;
        int max = 0;

        for (int i = 1; i <= CbEntier; i++) {
            System.out.print("Entrez un entier : ");
            int entier = clavier.nextInt();
            if (entier % 2 == 0) {
                totalEntier = totalEntier + entier;
            }

            if (entier > max) {
                max = entier;
            }


        }

        clavier.close();

        System.out.println("Somme des nombres pairs = " + totalEntier + " , plus grand nombre = " + max);


    }

}

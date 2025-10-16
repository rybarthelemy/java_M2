package fr.ryan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exo16 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Votre mois de naissance : ");
        int moisNaissance = clavier.nextInt();
        System.out.print("Votre jour de naissance : ");
        int JourNaissance = clavier.nextInt();

        clavier.close();

        LocalDate aujourdHui = LocalDate.now();
        int anneeActuelle = aujourdHui.getYear();

        LocalDate anniversaire = LocalDate.of(anneeActuelle, moisNaissance, JourNaissance);

        if (anniversaire.isBefore(aujourdHui) || anniversaire.isEqual(aujourdHui) == false && anniversaire.isBefore((aujourdHui))) {
            anniversaire = anniversaire.plusYears(1);
        }

        long joursRestants = ChronoUnit.DAYS.between(aujourdHui, anniversaire);
        System.out.println("Il reste " + joursRestants + " dodos jusqu'à votre anniversaire.");
    }

}

// la variable long permet de stocker des nombres entier mais avec une plus grande capacité.

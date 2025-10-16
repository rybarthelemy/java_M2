package fr.ryan;

import java.util.Scanner;

public class Exo17 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Votre Message : ");
        String message = clavier.nextLine(); // lire toute la ligne (avec espaces)

        System.out.print("Votre Décalage : ");
        int decalage = clavier.nextInt();

        clavier.close();

        // Normaliser le décalage pour qu'il soit entre 0 et 25
        int shift = ((decalage % 26) + 26) % 26;

        StringBuilder resultat = new StringBuilder();
        String texteMajuscule = message.toUpperCase();

        for (int i = 0; i < texteMajuscule.length(); i++) {
            char c = texteMajuscule.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                char lettre = (char) ('A' + (c - 'A' + shift) % 26);
                resultat.append(lettre);
            } else {
                // chiffres et autres caractères restent inchangés
                resultat.append(c);
            }
        }

        System.out.println("Message chiffré : " + resultat.toString());
    }
}

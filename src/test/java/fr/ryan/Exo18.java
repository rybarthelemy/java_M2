package fr.ryan;

import java.util.Scanner;

public class Exo18 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Votre message chiffré : ");
        String message = clavier.nextLine();

        System.out.print("Votre décalage : ");
        int decalage = clavier.nextInt();

        clavier.close();

        String texteMajuscule = message.toUpperCase();
        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < texteMajuscule.length(); i++) {
            char c = texteMajuscule.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                char lettre = (char) ('A' + (c - 'A' - decalage + 26) % 26);
                resultat.append(lettre);
            } else {
                resultat.append(c);
            }
        }

        System.out.println("Message déchiffré : " + resultat.toString());
    }
}

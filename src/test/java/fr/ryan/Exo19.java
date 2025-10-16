package fr.ryan;
import java.util.Random;
import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) {
        // Afficher le premier message pour commencer le jeu
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");

        int max = 99;
        int min = 1;
        Random rd = new Random();
        int nombreRandom = rd.nextInt(max - min + 1) + min;

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nombrePropose = clavier.nextInt();

        clavier.close();

        System.out.println("Vous proposez : " + nombrePropose);

        System.out.println("Le nombre auquel je pensais était : " + nombreRandom);

        int ecart = nombreRandom - nombrePropose;
        if (ecart == 0) {
            System.out.println("Quel bol, vous avez trouvé !");
        } else if (ecart > 0) {
            System.out.println("Perdu ! Il vous manquait " + ecart + ".");
        } else {
            System.out.println("Perdu ! Vous avez dépassé de " + (-ecart) + ".");
        }

    }
}

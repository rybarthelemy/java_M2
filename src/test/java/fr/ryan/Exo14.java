package fr.ryan;

public class Exo14 {
    public static void main(String[] args) {
        String texte = "Éric notre valet alla te laver ton ciré";

        //tout mettre en minuscules
        String minuscule = texte.toLowerCase();

        // Suppression des espaces et la ponctuaction
        String texteAJour = minuscule.replaceAll("[^a-zà-ÿ]", "");

        // Inverser la chaine
        String inverse = new StringBuilder(texteAJour).reverse().toString();

        boolean resultat = texteAJour.equals(inverse);

        System.out.println(resultat);


    }

}
// La méthode replace() remplace une suite exacte de caractères par une autre.
//Elle ne comprend pas les expressions régulières (regex)

//La méthode replaceAll() remplace tous les caractères qui correspondent à une expression régulière (regex) par une autre chaîne.
//Elle permet donc d’enlever ou de remplacer plusieurs types de caractères à la fois.
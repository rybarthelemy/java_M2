package fr.ryan;

public class Exo15 {
    public static void main(String[] args) {
        String texte = "   Plein    d'espaces...      et de la ponctuation !!!   ";

        String nettoye = texte.trim();

        String[] mots = nettoye.split("[^\\p{L}\\p{N}]+");


        int nbMots;
        if (mots.length == 1 && mots[0].isEmpty()) {
            nbMots = 0;
        } else {
            nbMots = mots.length;
        }

        // 4. On affiche le résultat
        System.out.println("Nombre de mots : " + nbMots);

    }

}

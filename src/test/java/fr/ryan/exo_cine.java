package fr.ryan;

public class exo_cine {
    public static void main(String[] args) {
        int agePersonne = 13;
        Boolean personnesInterdites = false;
        Boolean accompgneeAdulte = false;

        if (!personnesInterdites && (agePersonne >= 14 || accompgneeAdulte)) {
            System.out.println("Enrée autorisée");
        } else {
            System.out.println("Enrée refusée");
        }

    }
}

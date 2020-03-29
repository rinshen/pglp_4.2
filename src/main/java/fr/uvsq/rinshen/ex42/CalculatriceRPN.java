package fr.uvsq.rinshen.ex42;

/**
 * Classe contenant la fonction main.
 */
public final class CalculatriceRPN {

    /**
     * Constructeur de la classe FromCSV.
     * Ne devrait jamais etre appelé, mais checkstyle exige que chaque
     * classe ait un constructeur
     */
    private CalculatriceRPN() {
    }

    /**
     * Constructeur de la classe FromCSV.
     * @param args -> arguments de la ligne de commande
     */
    public static void main(final String[] args) {
        SaisieRPN saisie = new SaisieRPN();
        while (true) {
            saisie.lireEntree();
            saisie.getMoteur().affichePile();
        }
    }
}

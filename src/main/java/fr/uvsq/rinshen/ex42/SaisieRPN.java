package fr.uvsq.rinshen.ex42;

/**
 * Classe permettant a l'utilisateur de taper ses commandes dans la calculette.
 */
public class SaisieRPN {
    /**
     * Scanner permettant d'acceder en lecture au terminal.
     */
    private java.util.Scanner scanner;
    /**
     * Moteur chargé du calcul.
     */
    private MoteurRPN moteur;

    /**
     * Constructeur de la classe SaisieRPN.
     */
    public SaisieRPN() {
        scanner = new java.util.Scanner(System.in);
        moteur = new MoteurRPN();
    }

    /**
     * Fonction qui attends l'entrée de l'utilisateur.
     */
    public void lireEntree() {
        if (scanner.hasNextFloat()) {
            getMoteur().ajouteOperande(scanner.nextFloat());
        } else {
            getMoteur().executeOperateur(scanner.next());
        }
    }

    /**
     * Getter de l'attribut moteur.
     * @return MoteurRPN chargé des calculs
     */
    public MoteurRPN getMoteur() {
        return moteur;
    }
}

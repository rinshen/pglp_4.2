package fr.uvsq.rinshen.ex42;

/**
 * Classe contenant la fonction main.
 */
public final class CalculatriceRpn {
	/**
	 * Fontion main.
	 * @param args Argumnts de la ligne de commande
	 */
	public static void main(final String[] args) {
		SaisieRpn saisie = new SaisieRpn();
		while (true) {
			saisie.lireEntree();
			saisie.getMoteur().affichePile();
		}
	}
}

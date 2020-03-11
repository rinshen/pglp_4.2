package fr.uvsq.rinshen.ex42;

public class CalculatriceRPN {
	public static void main(String[] args) {
		SaisieRPN saisie = new SaisieRPN();
		while(true) {
			saisie.lire_entree();
			saisie.moteur.affiche_pile();
		}
	}
}

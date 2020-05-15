package fr.uvsq.rinshen.ex42;

import java.util.ArrayList;

/**
 * Classe de base pour la manipluation d'une liste.
 */
public class Interpreteur {
	/**
	 * Liste contenant les nombres entrés dans la calculatrice.
	 */
	private ArrayList<Double> pile;

	/**
	 * Constructeur de la classe Interpreteur.
	 */
	public Interpreteur() {
		pile = new ArrayList<Double>();
	}

	/**
	 * Fonction permettant d'annuler la dernière entrée.
	 */
	public void undo() {
		getPile().remove(getPile().size() - 1);
	}

	/**
	 * Fonction appelée pour éteindre la calculatrice.
	 */
	public void quit() {
		System.exit(0);
	}

	/**
	 * Getter pour récuperer la pile.
	 * @return Pile contenant les nombres dans la mémoire de la calculette
	 */
	public ArrayList<Double> getPile() {
		return pile;
	}
}

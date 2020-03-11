package fr.uvsq.rinshen.ex42;

public class SaisieRPN {
	java.util.Scanner scanner;
	MoteurRPN moteur;
	
	public SaisieRPN() {
		scanner=new java.util.Scanner(System.in);
		moteur=new MoteurRPN();
	}
	
	public void lire_entree() {
		if(scanner.hasNextFloat()) {
			moteur.ajoute_operande(scanner.nextFloat());
		}
		else {
			moteur.execute_operateur(scanner.next());
		}
	}
}

package fr.uvsq.rinshen.ex42;

/**
 * Classe contenant les principales fonctions de calcul.
 */
public class MoteurRpn extends Interpreteur {

	/**
	 * Constructeur de la classe MoteurRPN.
	 */
	public MoteurRpn() {
		super();
	}

	/**
	 * Fonction permettant d'ajouter une opérande sur la pile.
	 * @param op Opérande a ajouter
	 */
	public void ajouteOperande(final double op) {
		getPile().add(op);
	}

	/**
	 * Fonction permettant de récupérer le 1er élément de la pile.
	 * @return Nombre en haut de la pile
	 */
	public double pop() {
		double res = getPile().get(getPile().size() - 1);
		getPile().remove(getPile().size() - 1);
		return res;
	}

	/**
	 * Addition.
	 * @param op1 1ère opérande
	 * @param op2 2ème opérande
	 */
	public void addition(final double op1, final double op2) {
		double res = op1 + op2;
		getPile().add(res);
	}

	/**
	 * Soustraction.
	 * @param op1 1ère opérande
	 * @param op2 2ème opérande
	 */
	public void soustraction(final double op1, final double op2) {
		double res = op2 - op1;
		getPile().add(res);
	}

	/**
	 * Multiplication.
	 * @param op1 1ère opérande
	 * @param op2 2ème opérande
	 */
	public void multiplication(final double op1, final double op2) {
		double res = op1 * op2;
		getPile().add(res);
	}

	/**
	 * Division.
	 * @param op1 1ère opérande
	 * @param op2 2ème opérande
	 */
	public void division(final double op1, final double op2) {
		double res = op2 / op1;
		getPile().add(res);
	}

	/**
	 * Fonction prenant en paramètre un opérateur et
	 * qui l'applique sur les deux nombres au sommet de la pile.
	 * @param op Opérateur à appliquer
	 */
	public void executeOperateur(final String op) {
		double op1;
		double op2;
		switch (op) {
			case "+":
				op1 = pop();
				op2 = pop();
				addition(op1, op2);
				break;
			case "-":
				op1 = pop();
				op2 = pop();
				soustraction(op1, op2);
				break;
			case "*":
				op1 = pop();
				op2 = pop();
				multiplication(op1, op2);
				break;
			case "/":
				op1 = pop();
				op2 = pop();
				division(op1, op2);
				break;
			case "undo":
				undo();
				break;
			case "quit":
				quit();
				break;
			default:
				System.out.println("operation non reconnue");
		}
	}

	/**
	 * Fonction permettant d'afficher la pile sur le terminal.
	 */
	public void affichePile() {
		for (int i = 0; i < getPile().size(); i++) {
			System.out.print(getPile().get(i) + " ");
		}
		System.out.print("\n");
	}
}

package fr.uvsq.rinshen.ex42;

public class MoteurRPN extends Interpreteur {

	public MoteurRPN() {
		super();
	}
	
	public void ajoute_operande(double op){
		pile.add(op);
	}
	
	public double pop() {
		double res=pile.get(pile.size());
		pile.remove(pile.size());
		return res;
	}
	
	public void addition(double op1, double op2) {
		double res=op1+op2;
		pile.add(res);
	}
	
	public void soustraction(double op1, double op2) {
		double res=op1-op2;
		pile.add(res);
	}
	
	public void multiplication(double op1, double op2) {
		double res=op1*op2;
		pile.add(res);
	}

	public void division(double op1, double op2) {
		double res=op1/op2;
		pile.add(res);
	}
	
	public void execute_operateur(String op) {
		double op1=pop();
		double op2=pop();
		switch(op) {
			case "+":
				addition(op1,op2);
			break;
			case "-":
				soustraction(op1,op2);
			break;
			case "*":
				multiplication(op1,op2);
			break;
			case "/":
				division(op1,op2);
			break;
			default:
				System.out.println("operation non reconnue");
		}
	}
	
	public void affiche_pile() {
		for(int i=0;i<pile.size();i++) {
			System.out.print(pile.get(i) + " ");
		}
		System.out.print("\n");
	}
}

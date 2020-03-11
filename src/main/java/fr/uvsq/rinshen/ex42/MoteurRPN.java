package fr.uvsq.rinshen.ex42;

public class MoteurRPN extends Interpreteur {

	public MoteurRPN() {
		super();
	}
	
	public void ajoute_operande(double op){
		pile.add(op);
	}
	
	public double pop() {
		double res=pile.get(pile.size()-1);
		pile.remove(pile.size()-1);
		return res;
	}
	
	public void addition(double op1, double op2) {
		double res=op1+op2;
		pile.add(res);
	}
	
	public void soustraction(double op1, double op2) {
		double res=op2-op1;
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
		double op1;
		double op2;
		switch(op) {
			case "+":
				op1=pop();
				op2=pop();
				addition(op1,op2);
			break;
			case "-":
				op1=pop();
				op2=pop();
				soustraction(op1,op2);
			break;
			case "*":
				op1=pop();
				op2=pop();
				multiplication(op1,op2);
			break;
			case "/":
				op1=pop();
				op2=pop();
				division(op1,op2);
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
	
	public void affiche_pile() {
		for(int i=0;i<pile.size();i++) {
			System.out.print(pile.get(i) + " ");
		}
		System.out.print("\n");
	}
}

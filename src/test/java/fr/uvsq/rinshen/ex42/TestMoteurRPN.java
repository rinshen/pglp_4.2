package fr.uvsq.rinshen.ex42;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoteurRPN {

	@Test
	public void test_ajoute_operande() {
		MoteurRPN moteur=new MoteurRPN();
		double val = 5;
		double test = val;
		moteur.ajoute_operande(val);
		double res = moteur.pop();
		assertEquals(test, res, 0);
	}

	@Test
	public void test_addition() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = 9;
		moteur.ajoute_operande(val1);
		moteur.ajoute_operande(val2);
		moteur.execute_operateur("+");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}

	@Test
	public void test_soustraction() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = 1;
		moteur.ajoute_operande(val1);
		moteur.ajoute_operande(val2);
		moteur.execute_operateur("-");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}

	@Test
	public void test_multiplication() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = 20;
		moteur.ajoute_operande(val1);
		moteur.ajoute_operande(val2);
		moteur.execute_operateur("*");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}

	@Test
	public void test_division() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = 1.25;
		moteur.ajoute_operande(val1);
		moteur.ajoute_operande(val2);
		moteur.execute_operateur("/");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}
	
	@Test
	public void test_division_zero() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 0;
		double test = Double.POSITIVE_INFINITY;
		moteur.ajoute_operande(val1);
		moteur.ajoute_operande(val2);
		moteur.execute_operateur("/");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}
	
	@Test
	public void test_undo() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = val1;
		moteur.ajoute_operande(val1);
		moteur.ajoute_operande(val2);
		moteur.undo();
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}

}

package fr.uvsq.rinshen.ex42;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoteurRPN {

	@Test
	public void test_ajoute_operande() {
		MoteurRPN moteur=new MoteurRPN();
		double val = 5;
		double test = val;
		moteur.ajouteOperande(val);
		double res = moteur.pop();
		assertEquals(test, res, 0);
	}

	@Test
	public void test_addition() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = 9;
		moteur.ajouteOperande(val1);
		moteur.ajouteOperande(val2);
		moteur.executeOperateur("+");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}

	@Test
	public void test_soustraction() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = 1;
		moteur.ajouteOperande(val1);
		moteur.ajouteOperande(val2);
		moteur.executeOperateur("-");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}

	@Test
	public void test_multiplication() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = 20;
		moteur.ajouteOperande(val1);
		moteur.ajouteOperande(val2);
		moteur.executeOperateur("*");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}

	@Test
	public void test_division() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = 1.25;
		moteur.ajouteOperande(val1);
		moteur.ajouteOperande(val2);
		moteur.executeOperateur("/");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}
	
	@Test
	public void test_division_zero() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 0;
		double test = Double.POSITIVE_INFINITY;
		moteur.ajouteOperande(val1);
		moteur.ajouteOperande(val2);
		moteur.executeOperateur("/");
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}
	
	@Test
	public void test_undo() {
		MoteurRPN moteur=new MoteurRPN();
		double val1 = 5;
		double val2 = 4;
		double test = val1;
		moteur.ajouteOperande(val1);
		moteur.ajouteOperande(val2);
		moteur.undo();
		double res =  moteur.pop();
		assertEquals(test, res, 0);
	}

}

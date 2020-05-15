package fr.uvsq.rinshen.ex42;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoteurRPN {

	@Test
	public void test_ajoute_operande() {
		MoteurRpn moteur=new MoteurRpn();
		double val = 5;
		double test = val;
		moteur.ajouteOperande(val);
		double res = moteur.pop();
		assertEquals(test, res, 0);
	}

	@Test
	public void test_addition() {
		MoteurRpn moteur=new MoteurRpn();
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
		MoteurRpn moteur=new MoteurRpn();
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
		MoteurRpn moteur=new MoteurRpn();
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
		MoteurRpn moteur=new MoteurRpn();
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
		MoteurRpn moteur=new MoteurRpn();
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
		MoteurRpn moteur=new MoteurRpn();
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

package fr.uvsq.rinshen.ex42;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoteurRPN {

	@Test
	public void test_ajoute_operande() {
		MoteurRPN moteur=new MoteurRPN();
		double val = 5;
		double res=0;
		moteur.ajoute_operande(val);
		test=moteur.pop();
		assertEquals(res, val, 0);
	}

	@Test
	public void test_addition() {
		fail("Not yet implemented");
	}

	@Test
	public void test_soustraction() {
		fail("Not yet implemented");
	}

	@Test
	public void test_multiplication() {
		fail("Not yet implemented");
	}

	@Test
	public void test_division() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_division_zero() {
		fail("Not yet implemented");
	}

	@Test
	public void test_execute_operateur() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_undo() {
		fail("Not yet implemented");
	}

}

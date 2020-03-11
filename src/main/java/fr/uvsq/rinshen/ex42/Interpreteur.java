package fr.uvsq.rinshen.ex42;

import java.util.ArrayList;

public class Interpreteur 
{
	protected ArrayList<Double> pile;
	
	public Interpreteur() {
		pile=new ArrayList<Double>();
	}
	
    public void undo() {
    	pile.remove(pile.size());
    }
    
    public void quit() {
    	System.exit(0);
    }
}

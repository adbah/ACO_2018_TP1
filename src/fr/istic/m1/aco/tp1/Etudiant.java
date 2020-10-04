package fr.istic.m1.aco.tp1;

import java.util.HashSet;
import java.util.Set;

public class Etudiant {
	
	private String nom, prenom;
	
	//Ensemble de cours
	private  Set<Cours> c;
	
	public Etudiant () {
		
		nom="bah";
	    prenom="adama";
		c = new HashSet<>();
	}
	
	public Set<Cours> getC() {
		return this.c;
	}
	
	public void setC(Set<Cours> newC) {
		if(newC!= null) {
			 this.c= newC;
		}
}

}

package fr.istic.m1.aco.tp1;

import java.util.HashSet;
import java.util.Set;

public class Cours {
	
	private String libelle;
	
	//private  Set <Etudiant> etuInscrits ;
	
	private Etudiant etu;
	
	public Cours() {
		
		libelle="ACO";
		
		//etuInscrits= new HashSet<>();
	}
	public Cours(String lib) {
		
		libelle=lib;
	}
	
	public Etudiant getEtu() {
		
		return this.etu;
	}
	public void setEtu(Etudiant e) {
		
		this.etu=e;
	}

	
	

}

package TP4_parte3;

import java.time.LocalDate;

public class Cuillerre extends Ustensille{
	private double longeur;

	public Cuillerre(int annee, double longeur) {
		super(annee);
		this.longeur = longeur;
	}
	
	public double CalculeValeur() {
		if(super.annee>30) {
			return (LocalDate.now().getYear()-super.annee)*0.5;
		}
		else {
			return 0.0;
		}
	}
	
	public boolean equals(Object o) {
		if(super.equals(o)) {
			return ((Cuillerre) o).longeur==this.longeur;
			
		}
		else {
		return false;
		}
	}
	

}

package TP4_parte3;

import java.time.LocalDate;

public class AssietteCarre extends Assiette{
	private double cote;

	public AssietteCarre(int annee, double cote) {
		super(annee);
		this.cote = cote;
	}
	
	
	public double CalculeSurface() {
		return cote*cote;
	}
	
	public double CalculeValeur() {
		if(super.annee>50) {
			return (LocalDate.now().getYear()-super.annee-50)*2;
		}
		else {
			return 0.0;
		}
	}
	
	public boolean equals(Object o) {
		if(super.equals(o)) {
			return ((AssietteCarre) o).cote==this.cote;
			
		}
		else {
		return false;
		}
	}
}
	


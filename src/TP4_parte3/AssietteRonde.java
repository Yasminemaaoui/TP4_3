package TP4_parte3;
import java.time.LocalDate;

public class AssietteRonde extends Assiette{
	private double rayon;

	public AssietteRonde(int annee, double rayon) {
		super(annee);
		this.rayon = rayon;
	}
	
	public double CalculeSurface() {
		return 3.14*rayon*rayon;
	}
	
	public double CalculeValeur() {
		if(super.annee>50) {
			return (LocalDate.now().getYear()-super.annee-50)*1;
		}
		else {
			return 0.0;
		}
	}
	
	public boolean equals(Object o) {
		if(super.equals(o)) {
			return ((AssietteRonde) o).rayon==this.rayon;
			
		}
		else {
		return false;
		}
	}
}

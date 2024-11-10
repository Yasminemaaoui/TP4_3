package TP4_parte3;

public abstract class Ustensille {
	protected int annee;

	public Ustensille(int annee) {
		this.annee = annee;
	}

	public int getAnnee() {
		return annee;
	}
	
	@Override
	public boolean  equals(Object o) {
		if(o ==null && o.getClass()!=this.getClass()) {
			return false;
		}
		return this.annee==((Ustensille)o).annee ;
	}
	
	
}

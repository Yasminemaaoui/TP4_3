package TP4_parte3;

public class Collection {
	public static void main(String[] args) {
		Ustensille[] us = new Ustensille[5];
		us[0] = new AssietteRonde(1926, 8.4);
		us[1] = new Cuillerre(1881, 7.3);
		us[2] = new AssietteCarre(1935, 5.6);
		us[3] = new Cuillerre(1917, 8.8);
		us[4] = new AssietteRonde(1837, 5.4);
		Cuillerre rech =new Cuillerre(1881, 7.3);
		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
		afficherRecherche(us,rech);
		}
	
	public static void afficherCuilleres(Ustensille us[]) {
		int s=0;
		for(int i=0;i<5;i++) {
			if(us[i] instanceof Cuillerre) {
				s++ ;
			}
		}
		System.out.println("il y a "+s+" Cuillerre");
	}
	
	public static void afficherSurfaceAssiettes(Ustensille us[]) {
		double s=0;
		for(int i=0;i<5;i++) {
			if(us[i]instanceof AssietteRonde) {
				s+=((AssietteRonde)us[i]).CalculeSurface();
			}
			else if(us[i]instanceof AssietteCarre) {
				s+=((AssietteCarre)us[i]).CalculeSurface();
			}
		}
		System.out.println("Surface totale des assiettes : "+s);

	}
	
	public static void afficherValeurTotale(Ustensille us[]) {
		double s=0;
		for(int i=0;i<5;i++) {
			if(us[i]instanceof Cuillerre) {
				s+=((Cuillerre)us[i]).CalculeValeur();
			}
			else if(us[i]instanceof AssietteRonde) {
				s+=((AssietteRonde)us[i]).CalculeValeur();
			}
			else if(us[i]instanceof AssietteCarre) {
				s+=((AssietteCarre)us[i]).CalculeValeur();
			}
		}
		System.out.println("Valeur Totale des Ustensiles : "+s);
		}
	
	public static void afficherRecherche(Ustensille us[],Object o) {
		boolean trouve=false;
		for(int i=0;i<5;i++) {
			if(us[i].equals(o)) {
				System.out.println("Objet trouvé"+us[i]);
				trouve=true;
				break;
			}
		}
		if(!trouve) {
			System.out.println("Objet non trouvé");
		}
		}
		
	}
	





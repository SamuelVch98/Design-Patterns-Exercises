import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		MotsAvecLongueurStrategy longueur = new MotsAvecLongueurStrategy(5);
		MotsAvecPalindromesStrategy palindromes = new MotsAvecPalindromesStrategy();
		MotsCommencantParStrategy motCommencantPar = new MotsCommencantParStrategy('t');
		ListerMots listerMots = new ListerMots("test");
		And and = new And(longueur, motCommencantPar);
		Not not = new Not(longueur, motCommencantPar);
		Et et = new Et(longueur, motCommencantPar);
		Ou ou = new Ou(longueur, motCommencantPar, palindromes);
		Compteur compteur = new Compteur(ou);
		
		//listerMots.imprimerSi(longueur);
		//listerMots.imprimerSi(not);
		//listerMots.imprimerSi(et);
		//listerMots.imprimerSi(ou);
		listerMots.imprimerSi(compteur);
		System.out.println("Il y a " + compteur.compter() + " mots");
	}
}

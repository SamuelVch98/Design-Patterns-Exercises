import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnalyseurDeTexte {
	public static void main(String[] args) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		
		AnalyseurDeTexteImpl analyseur = new AnalyseurDeTexteImpl();
		nbrMots nbrMots = new nbrMots();
		NbrLignes nbrLignes = new NbrLignes();
		nbrBelgique nbrBelgique = new nbrBelgique();
		nbrPalindromes nbrPalindromes = new nbrPalindromes();
		
		analyseur.registerObserver(nbrMots);
		analyseur.registerObserver(nbrLignes);
		analyseur.registerObserver(nbrBelgique);
		analyseur.registerObserver(nbrPalindromes);
		
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader("test"));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			analyseur.notifyObservers(ligne);
		}
		lecteurAvecBuffer.close();
		analyseur.endObservers();
	}
}

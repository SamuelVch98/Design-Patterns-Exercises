
public class Main {

	public static void main(String[] args) {
		MagasinDeLivre livres = new MagasinDeLivre();
		MagasinDeDVD dvd = new MagasinDeDVD();
		
		dvd.ajouterProduit("Je suis une légende", 2010);
		dvd.ajouterProduit("Avengers : End game", 2018);
		
		livres.ajouterProduit("Le passeur", 2014);
		livres.ajouterProduit("Le domaine des murmures", 2012);
		
		System.out.println(livres.retourneProduit("Le passeur"));
		System.out.println(dvd.retourneProduit("Je suis une légende"));
	}
}

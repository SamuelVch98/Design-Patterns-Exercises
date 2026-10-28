
public class Main {

	public static void main(String[] args) {
		Magasin magasin = new Magasin();
		
		magasin.ajouterProduit("Je suis une légende", 2010, new StrategyDVD());
		magasin.ajouterProduit("Avengers : End game", 2018, new StrategyDVD());
		
		magasin.ajouterProduit("Le passeur", 2014, new StrategyLivre());
		magasin.ajouterProduit("Le domaine des murmures", 2012, new StrategyLivre());
		
		System.out.println(magasin.retourneProduit("Le passeur"));
		System.out.println(magasin.retourneProduit("Je suis une légende"));
	}
}

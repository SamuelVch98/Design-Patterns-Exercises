
public class StrategyLivre implements Strategy {

	@Override
	public Produit createProduct(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}


public class StrategyDVD implements Strategy {

	@Override
	public Produit createProduct(String name, int anneeDeParution) {
		return new DVD(name, anneeDeParution);
	}
}

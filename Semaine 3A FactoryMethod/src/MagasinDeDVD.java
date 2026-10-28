
public class MagasinDeDVD extends Magasin {

	@Override
	public Produit createProduct(String name, int anneeDeParution) {
		return new DVD(name, anneeDeParution);
	}
}

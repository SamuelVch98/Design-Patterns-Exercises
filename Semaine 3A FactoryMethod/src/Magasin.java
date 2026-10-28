import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
	
	private Map<String,Produit> etagere= new HashMap<String,Produit>();
	
	public void ajouterProduit(String name, int anneeDeParution){
		Produit p= this.createProduct(name, anneeDeParution);
		etagere.put(name,p);
	}
	
	public Produit retourneProduit(String name){
		return etagere.get(name);
	}
	
	public abstract Produit createProduct(String name, int anneeDeParution);
}

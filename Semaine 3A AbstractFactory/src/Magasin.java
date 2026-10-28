import java.util.HashMap;
import java.util.Map;

public class Magasin {
	
	private Map<String,Produit> etagere= new HashMap<String,Produit>();
	
	public void ajouterProduit(String name, int anneeDeParution, Strategy s){
		Produit p= s.createProduct(name, anneeDeParution);
		etagere.put(name,p);
	}
	
	public Produit retourneProduit(String name){
		return etagere.get(name);
	}	
}


public class Compteur implements ImprimerStrategy {
	
	private ImprimerStrategy strategy;
	private int compteur = 0;
	
	

	public Compteur(ImprimerStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	@Override
	public boolean imprimerSi(String mot) {
		if(strategy.imprimerSi(mot)) {
			compteur++;
			return true;
		}
		return false;
	}
	
	public int compter() {
		return compteur;
	}
}

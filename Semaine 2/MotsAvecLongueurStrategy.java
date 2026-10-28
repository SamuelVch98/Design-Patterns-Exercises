
public class MotsAvecLongueurStrategy implements ImprimerStrategy {

	private int longueur;

	public MotsAvecLongueurStrategy(int longueur) {
		super();
		this.longueur = longueur;
	}

	@Override
	public boolean imprimerSi(String mot) {
		return mot.length() == longueur;
	}
}


public class MotsCommencantParStrategy implements ImprimerStrategy {

	private char lettreAChercher;
	
	
	public MotsCommencantParStrategy(char lettreAChercher) {
		super();
		this.lettreAChercher = lettreAChercher;
	}

	@Override
	public boolean imprimerSi(String mot) {
		if(mot.charAt(0) != lettreAChercher) return false;
		
		return true;
	}
}

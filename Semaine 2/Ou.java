
public class Ou implements ImprimerStrategy {

	ImprimerStrategy strategies[];

	public Ou(ImprimerStrategy... strategies) {
		super();
		this.strategies = strategies;
	}

	@Override
	public boolean imprimerSi(String mot) {
		for(int i = 0; i < strategies.length; i++) {
			if(strategies[i].imprimerSi(mot)) return true;
		}
		return false;
	}

}

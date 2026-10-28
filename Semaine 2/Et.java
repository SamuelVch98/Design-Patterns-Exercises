import java.util.List;

public class Et implements ImprimerStrategy {
	
	ImprimerStrategy strategies[];

	public Et(ImprimerStrategy... strategies) {
		super();
		this.strategies = strategies;
	}

	@Override
	public boolean imprimerSi(String mot) {
		for(int i = 0; i < strategies.length; i++) {
			if(!strategies[i].imprimerSi(mot)) return false;
		}
		return true;
	}
}

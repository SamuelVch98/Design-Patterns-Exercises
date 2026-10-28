
public class Not implements ImprimerStrategy {

	private ImprimerStrategy strategy;
	private ImprimerStrategy strategy2;
	

	public Not(ImprimerStrategy strategy, ImprimerStrategy strategy2) {
		super();
		this.strategy = strategy;
		this.strategy2 = strategy2;
	}
	
	@Override
	public boolean imprimerSi(String mot) {
		return !strategy.imprimerSi(mot) && !strategy2.imprimerSi(mot);
	}

}

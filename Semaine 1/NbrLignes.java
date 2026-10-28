
public class NbrLignes implements AnalyseurObserver {
	
	private int nbrLignes = 0;

	@Override
	public void update(String ligne) {
		nbrLignes++;
	}

	@Override
	public void print() {
		System.out.println("Il y a " + nbrLignes + " ligne(s)");
	}
}

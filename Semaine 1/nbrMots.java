
public class nbrMots implements AnalyseurObserver {
	
	private int nbrMots = 0;

	@Override
	public void update(String ligne) {
		for (String mot : ligne.trim().split(" ")) {
			nbrMots++;
		}
	}

	@Override
	public void print() {
		System.out.println("Il y a " + nbrMots + " mot(s)");
	}
}

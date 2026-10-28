
public class nbrBelgique implements AnalyseurObserver {
	
	private int nbrBelgique = 0;

	@Override
	public void update(String ligne) {
		if(ligne.contains("Belgique")) {
			nbrBelgique++;
		}
	}

	@Override
	public void print() {
		System.out.println("Il y a " + nbrBelgique + " ligne(s) qui contient le mot Belgique");
	}
}

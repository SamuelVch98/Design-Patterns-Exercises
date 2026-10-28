
public class MotsAvecPalindromesStrategy implements ImprimerStrategy{
	
	public MotsAvecPalindromesStrategy() {
		
	}

	@Override
	public boolean imprimerSi(String mot) {
		if(!estPalindrome(mot)) return false;
		
		return true;
	}
	
	public boolean estPalindrome(String mot) {
		if (mot == null)
			return false;
		StringBuffer stringbuffer = new StringBuffer(mot);
		return mot.equals(stringbuffer.reverse().toString());
	}
}

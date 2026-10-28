package validation;

import java.util.Calendar;
import domaine.CarteDeCredit;
import domaine.Discover;

public class DiscoverGenerateur extends Generateur {

	public DiscoverGenerateur(Generateur successeur) {
		super(successeur);
	}

	@Override
	public boolean valider(String numero) {
		if((numero.startsWith("6011") || numero.startsWith("65")) 
				&& numero.length() == 16) {
			return true;
		}
		return false;
	}
	
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new Discover(numero, dateExpiration, nom);
		}
		return super.creerCarte(numero, dateExpiration, nom);
	}

}

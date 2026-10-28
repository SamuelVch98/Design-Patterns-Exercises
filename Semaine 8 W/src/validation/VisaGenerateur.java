package validation;

import java.util.Calendar;
import domaine.CarteDeCredit;
import domaine.Visa;

public class VisaGenerateur extends Generateur {

	public VisaGenerateur(Generateur successeur) {
		super(successeur);
	}

	@Override
	public boolean valider(String numero) {
		if(numero.startsWith("4") && numero.length() == 16) {
			return true;
		}
		return false;
	}
	
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new Visa(numero, dateExpiration, nom);
		}
		return super.creerCarte(numero, dateExpiration, nom);
	}

}

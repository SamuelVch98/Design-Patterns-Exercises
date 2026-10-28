package validation;

import java.util.Calendar;
import domaine.AmEx;
import domaine.CarteDeCredit;

public class AmExGenerateur extends Generateur {

	public AmExGenerateur(Generateur successeur) {
		super(successeur);
	}

	@Override
	public boolean valider(String numero) {
		if(numero.startsWith("34") || numero.startsWith("37")) {
			if(numero.length() == 15) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new AmEx(numero, dateExpiration, nom);
		}
		return super.creerCarte(numero, dateExpiration, nom);
	}
}

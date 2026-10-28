package validation;

import java.util.Calendar;
import domaine.CarteDeCredit;
import domaine.MasterCard;

public class MasterCardGenerateur extends Generateur {

	public MasterCardGenerateur(Generateur successeur) {
		super(successeur);
	}

	@Override
	public boolean valider(String numero) {
		if(numero.charAt(0)=='5' && numero.charAt(1)>= '1' && numero.charAt(1) <= '5' && numero.length() == 16) {
			return true;
		}
		return false;
	}
	
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new MasterCard(numero, dateExpiration, nom);
		}
		return super.creerCarte(numero, dateExpiration, nom);
	}

}

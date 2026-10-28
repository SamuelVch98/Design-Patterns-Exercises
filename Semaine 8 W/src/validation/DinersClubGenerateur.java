package validation;

import java.util.Calendar;
import domaine.CarteDeCredit;
import domaine.DinersClub;

public class DinersClubGenerateur extends Generateur {

	public DinersClubGenerateur(Generateur successeur) {
		super(successeur);
	}

	@Override
	public boolean valider(String numero) {
		if(numero.startsWith("36") && numero.length() == 14) {
			return true;
		}
		return false;
	}
	
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new DinersClub(numero, dateExpiration, nom);
		}
		return super.creerCarte(numero, dateExpiration, nom);
	}
}

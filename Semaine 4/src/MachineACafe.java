public class MachineACafe {

	private int montantEnCours = 0;
	private ToucheBoisson boisson = null;
	private State state;

	public enum State {
		IDLE {
			public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe mac) {
				mac.afficherPasAssez(toucheBoisson);
				return;
			}

			public void rendreMonnaie(MachineACafe mac) {
				mac.setState(State.IDLE);
			}
		}, 
		COLLECTE {
			public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe mac) {
				if (toucheBoisson.getPrix() > mac.montantEnCours) {
					mac.boisson = toucheBoisson;
					mac.afficherPasAssez(mac.boisson);
					mac.boisson = toucheBoisson;
					mac.setState(State.PAS_ASSEZ);
					return;
				}
				mac.montantEnCours -= toucheBoisson.getPrix();
				mac.afficherBoisson(toucheBoisson);
				mac.afficherMontant();
				if (mac.montantEnCours == 0)
					mac.setState(State.IDLE);
				else
					mac.setState(State.COLLECTE);
			}
		}, 
		PAS_ASSEZ {
			public void entrerMonnaie(Piece p, MachineACafe mac) {
				mac.montantEnCours += p.getValeur();
				mac.afficherMontant();
				if (mac.boisson.getPrix() > mac.montantEnCours) {
					mac.afficherPasAssez(mac.boisson);
				} else {
					mac.montantEnCours -= mac.boisson.getPrix();
					mac.afficherBoisson(mac.boisson);
					mac.boisson = null;
					mac.afficherMontant();
					if (mac.montantEnCours == 0)
						mac.setState(State.IDLE);
					else
						mac.setState(State.COLLECTE);
				}
			}

			public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe mac) {
				throw new IllegalStateException();
			}
		};

		public void entrerMonnaie(Piece p, MachineACafe mac) {
			mac.montantEnCours += p.getValeur();
			mac.afficherMontant();
			mac.setState(State.COLLECTE);
		}

		public abstract void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe mac);

		public void rendreMonnaie(MachineACafe mac) {
			mac.afficherRetour();
			mac.montantEnCours = 0;
			mac.boisson = null;
		}
	}

	public MachineACafe() {
		setState(State.IDLE);
	}

	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}

	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}

	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);

	}

	public void setState(State state) {
		this.state = state;
	}

	public void entrerMonnaie(Piece piece) {
		state.entrerMonnaie(piece, this);
	}

	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		state.selectionnerBoisson(toucheBoisson, this);
	}

	public void rendreMonnaie() {
		state.rendreMonnaie(this);
	}
}

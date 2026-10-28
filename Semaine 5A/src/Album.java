
public class Album {

	private final String titre; // required
	private final String nomArtiste; // required 
	private final String label; // optional
	private final String producteur; // optional
	private final String pays; // optional
	private final String version; // optional
	private final String genre; // optional
	private final int annee; // optional
	private final boolean isRemasterise; // optional
	private final int anneeParutionOriginale; // optional
	private final double debitStandard; // optional
	private final double debitAbonne; // optional



	private Album(Builder builder) {
		this.titre = builder.titre;
		this.nomArtiste = builder.nomArtiste;
		this.label = builder.label;
		this.producteur = builder.producteur;
		this.pays = builder.pays;
		this.version = builder.version;
		this.genre = builder.genre;
		this.annee = builder.annee;
		this.isRemasterise = builder.isRemasterise;
		this.anneeParutionOriginale = builder.anneeParutionOriginale;
		this.debitStandard = builder.debitStandard;
		this.debitAbonne = builder.debitAbonne;
	}

	public String getTitre() {
		return titre;
	}


	public String getNomArtiste() {
		return nomArtiste;
	}

	public String getLabel() {
		return label;
	}

	public String getProducteur() {
		return producteur;
	}

	public String getPays() {
		return pays;
	}
	
	public String getVersion() {
		return version;
	}
	
	public String getGenre() {
		return genre;
	}

	public int getAnneeParution() {
		return annee;
	}

	public boolean isRemasterise() {
		return isRemasterise;
	}

	public int getAnneeParutionOriginale() {
		return anneeParutionOriginale;
	}

	public double getDebitStandard() {
		return debitStandard;
	}
	
	public double getDebitAbonne() {
		return debitAbonne;
	}

	public static class Builder {
		private final String titre; // required
		private final String nomArtiste; // required 
		private String label; // optional
		private String producteur; // optional
		private String pays; // optional
		private String version; // optional
		private String genre; // optional
		private int annee; // optional
		private boolean isRemasterise; // optional
		private int anneeParutionOriginale; // optional
		private double debitStandard; // optional
		private double debitAbonne; // optional
		
		public Builder(String titre, String nomArtiste) {
			super();
			this.titre = titre;
			this.nomArtiste = nomArtiste;
		}
		
		public Builder label(String label) {
			this.label = label;
			return this;
		}
		
		public Builder producteur(String producteur) {
			this.producteur = producteur;
			return this;
		}
		
		public Builder pays(String pays) {
			this.pays = pays;
			return this;
		}
		
		public Builder version(String version) {
			this.version = version;
			return this;
		}
		
		public Builder genre(String genre) {
			this.genre = genre;
			return this;
		}
		
		public Builder annee(int annee) {
			this.annee = annee;
			return this;
		}
		
		public Builder isRemasterise(boolean isRemasterise) {
			this.isRemasterise = isRemasterise;
			return this;
		}
		
		public Builder anneeParutionOriginale(int anneeParutionOriginale) {
			this.anneeParutionOriginale = anneeParutionOriginale;
			return this;
		}
		
		public Builder debitStandard(double debitStandard) {
			this.debitStandard = debitStandard;
			return this;
		}
		
		public Builder debitAbonne(double debitAbonne) {
			this.debitAbonne = debitAbonne;
			return this;
		}
		
		public Album build() {
			return new Album(this);
		}
	}

}

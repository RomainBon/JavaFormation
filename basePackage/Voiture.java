package basePackage;

public class Voiture {
	private String marque;
	private String Immatriculation;
	private String couleur;

	public Voiture(String marque, String immatriculation) {
		super();
		this.setMarque(marque);
		this.setImmatriculation(immatriculation);
	}

	public Voiture(String marque, String immatriculation, String couleur) {
		super();
		this.setMarque(marque);
		this.setImmatriculation(immatriculation);
		this.setCouleur(couleur);
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getImmatriculation() {
		return this.Immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.Immatriculation = immatriculation;
	}

	public String getCouleur() {
		return this.couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + this.getMarque() + ", Immatriculation=" + this.getImmatriculation() + ", couleur="
				+ this.getCouleur() + "]";
	}
}

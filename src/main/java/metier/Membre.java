package metier;


public class Membre {
    private int id_membre;
    private String nom_membre;
    private String adresse;
    private String tele;
    
    public Membre(int id_membre, String nom_membre, String adresse, String tele) {
        this.id_membre = id_membre;
        this.nom_membre = nom_membre;
        this.adresse = adresse;
        this.tele = tele;
    }

	public int getId_membre() {
		return id_membre;
	}

	public void setId_membre(int id_membre) {
		this.id_membre = id_membre;
	}

	public String getNom_membre() {
		return nom_membre;
	}

	public void setNom_membre(String nom_membre) {
		this.nom_membre = nom_membre;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

    
}


package metier;

import java.util.Date;
public class Membre {

    private int id_livre;
    private String titre_livre;
    private String auteur_livre;
    private String editeur_livre;
    private Date date_pub;

    
    public Livre ( int id_membre, String nom_membre,String adresse_membre,int tele_membre) {
        
        this.id_membre=id_membre;
        this.titre_livre=titre_livre;
        this.auteur_livre=auteur_livre;
        this.editeur_livre=editeur_livre;
        this.date_pub=date_pub;
        
    }


	public int getId_livre() {
		return id_livre;
	}


	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}


	public String getTitre_livre() {
		return titre_livre;
	}


	public void setTitre_livre(String titre_livre) {
		this.titre_livre = titre_livre;
	}


	public String getAuteur_livre() {
		return auteur_livre;
	}


	public void setAuteur_livre(String auteur_livre) {
		this.auteur_livre = auteur_livre;
	}


	public String getEditeur_livre() {
		return editeur_livre;
	}


	public void setEditeur_livre(String editeur_livre) {
		this.editeur_livre = editeur_livre;
	}


	public Date getDate_pub() {
		return date_pub;
	}


	public void setDate_pub(Date date_pub) {
		this.date_pub = date_pub;
	}
    
}

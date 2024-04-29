package Metier;
import java.io.Serializable;
import java.util.Date;

public class livre implements Serializable  {

	private int id_livre;
	private String titre_livre;
	private String auteur_livre;
	private String editeur_livre;
	

    private Date date_pub; // Utilisation de java.util.Date pour la date de publication

	// les condtructeurs 
	public livre ( int id_livre, String titre_livre,String auteur_livre,String editeur_livre,java.util.Date date_pub) {
		 
		this.id_livre=id_livre;
		this.titre_livre=titre_livre;
		this.auteur_livre=auteur_livre;
		this.editeur_livre=editeur_livre;
		this.date_pub=date_pub;
		
	}
	//---------------------------------
	public livre() {};
	
	public int   getId_livre() {
		return id_livre;
	}
	
	public String getTitre_livre() {
		return titre_livre;
	}
	
	public String getAuteur_livre() {
		return auteur_livre;
	}
	
	
	
	public String getEditeur_livre() {
		return editeur_livre;
	}
	
	
	public Date getDate_pub() {
		return date_pub;
	}
	
	public void setId_livre(int id_livre) {
		this.id_livre=id_livre;
	}
	
	public void setTritre_livre(String titre_livre) {
		this.titre_livre= titre_livre;
	}
	
	public void setAuteur_livre(String auteur_livre) {
		this.auteur_livre=auteur_livre;
	}
	
	public void setEditeur_livre(String editeur_livre) {
		this.editeur_livre=editeur_livre;
	}
	
	public void setDate_pub(Date date_pub) {
		this.date_pub=date_pub;
		
	}
	@Override
	public String toString() {
		return " livre [id =" +id_livre+ "   |titre ="+ titre_livre +"|  auteur_livre ="+auteur_livre +"|   Editeur ="+editeur_livre+ "|  date pub ="+date_pub+"";
		
		
	}
	
}

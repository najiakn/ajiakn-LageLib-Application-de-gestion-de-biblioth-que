package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 


import Metier.livre;

public class implementLivre implements Ilivre {

	@Override
	public livre ajouter(livre L) {
	Connection  connection =Connect.getConnection();
	try {
		PreparedStatement ps=connection.prepareStatement("insert into livre values (?,?,?,?,?)");
		ps.setInt(1,L.getId_livre());
		ps.setString(2,L.getTitre_livre());
		ps.setString(3,L.getAuteur_livre());
		ps.setString(4,L.getEditeur_livre());
		
		java.sql.Date datepub = new java.sql.Date(L.getDate_pub().getTime());
        ps.setDate(5, datepub);
		ps.executeUpdate();
		PreparedStatement ps2=connection.prepareStatement("select max(id_livre) as max from livre");
	 
		
		ps.close();
	}
	catch(SQLException e ) {
		e.printStackTrace();
	}
	
	return L;
	}

	@Override
	public List<livre> chercher(String mc) {
		List<livre> livres=new ArrayList<livre>();
		Connection  connection =Connect.getConnection();
           
		try {
			PreparedStatement ps =connection.prepareStatement("select * from livre where titre_livre like ? ");
			ps.setString(1,mc);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				livre  l = new livre ();
				l.setId_livre(rs.getInt("id_livre"));
				l.setTritre_livre(rs.getString("titre_livre"));
				l.setAuteur_livre(rs.getString("auteur_livre"));
				l.setEditeur_livre(rs.getString("editeur"));
				l.setDate_pub(rs.getDate("annee_pub"));
				livres.add(l);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return livres;
	}

	@Override
	public livre lister(int id) {
		
	
		return null;
	}

	@Override
	public livre modifier(livre L) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}
	

}

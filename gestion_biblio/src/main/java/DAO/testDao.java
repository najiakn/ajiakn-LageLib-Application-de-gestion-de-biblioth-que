package DAO;

import Metier.livre;
import java.util.Date;
import java.util.List;


public class testDao {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
        Date date = new java.util.Date(2024 - 1900, 4-1, 10); // L'année est 2025, le mois est 8 (août, 0-indexé), le jour est 10
        Date date2 = new java.util.Date(2023 - 1900, 2-1,12);
implementLivre dao = new implementLivre();
livre l1 = dao.ajouter(new livre(126, "l126", "auteur26", "editeur126", date));

livre l2 = dao.ajouter(new livre(127, "l27", "auteur127", "editeur127", date2));

System.out.println(l1.toString());
System.out.println(l2.toString());*/
		implementLivre dao = new implementLivre();
		List<livre> livs=dao.chercher("%1%");
		for(livre l :livs) {
			System.out.println(l.toString());
		
		}

	}

}

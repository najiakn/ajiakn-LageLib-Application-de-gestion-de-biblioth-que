package dao;


import metier.Livre;

public class TestDAO {

    public static void main(String[] args) {
        ILivreDAO livreDAO = new LivreDAOImpl();

        Livre livre1 = new Livre(15, "Titre111", "Auteur1", "Editeur10", new java.util.Date());

   
        Livre livreSauvegarde = livreDAO.save(livre1);
        if (livreSauvegarde != null) {
            System.out.println("Livre ajouté avec succès : " + livreSauvegarde.getTitre_livre());
        } else {
            System.out.println("Erreur lors de l'ajout du livre");
        }
    }
}

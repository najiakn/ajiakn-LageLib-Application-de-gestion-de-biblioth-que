package dao;

import java.util.List;

import metier.Membre;

public class TestDAO2 {
    public static void main(String[] args) {
        IMembreDAO membreDAO = new MembreDAOImpl();

       
        Membre membre1 = new Membre(9, "membre9", "adresse9", "303(03");

        membreDAO.save(membre1);
 

        List<Membre> membres = membreDAO.MembreParMc("");
        for (Membre membre : membres) {
            System.out.println("Membre : " + membre.getNom_membre() + " - " + membre.getAdresse() + " - " + membre.getTele());
        }
    }
}


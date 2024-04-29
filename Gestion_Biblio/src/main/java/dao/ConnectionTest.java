package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class ConnectionTest {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Charger le driver JDBC
            Class.forName("org.postgresql.Driver");

            // Établir la connexion à la base de données
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/biblio", "postgres", "ader12");

            // Créer une déclaration SQL
            stmt = con.createStatement();

            // Exécuter la requête SQL pour récupérer les livres
            rs = stmt.executeQuery("select * from livre");

            // Afficher les informations sur les livres
            System.out.println("Liste des livres :");
            while (rs.next()) {
                int id_livre = rs.getInt("id_livre");
                String titre_livre = rs.getString("titre_livre");
                String auteur_livre = rs.getString("auteur_livre");
                String editeur_livre = rs.getString("editeur");
                Date date_pub = rs.getDate("annee_pub");

                System.out.println(id_livre + " - " + titre_livre + " - " + auteur_livre + " - " + editeur_livre + " - " + date_pub);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
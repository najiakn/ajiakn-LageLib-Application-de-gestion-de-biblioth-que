package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Livre;

public class LivreDAOImpl implements ILivreDAO {

    private Connection connection;

    public LivreDAOImpl() {
        connection = SingletonConnection.getConnection();
    }

    @Override
    public Livre save(Livre l) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO livre (id_livre, titre_livre, auteur_livre, editeur, annee_pub) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, l.getId_livre());
            ps.setString(2, l.getTitre_livre());
            ps.setString(3, l.getAuteur_livre());
            ps.setString(4, l.getEditeur_livre());
            ps.setDate(5, new java.sql.Date(l.getDate_pub().getTime()));

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }

    @Override
    public List<Livre> LivreParMc(String mc) {
        List<Livre> livres = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM livre WHERE titre_livre LIKE ?");
            ps.setString(1, "%" + mc + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Livre livre = new Livre(rs.getInt("id_livre"), rs.getString("titre_livre"), rs.getString("auteur_livre"), rs.getString("editeur"), rs.getDate("annee_pub"));
                livres.add(livre);
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livres;
    }

    @Override
    public Livre getLivre(int id) {
        Livre livre = null;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM livre WHERE id_livre = ?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                livre = new Livre(rs.getInt("id_livre"), rs.getString("titre_livre"), rs.getString("auteur_livre"), rs.getString("editeur"), rs.getDate("annee_pub"));
            }

            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livre;
    }

    @Override
    public Livre update(Livre l) {
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE livre SET titre_livre = ?, auteur_livre = ?, editeur = ?, annee_pub = ? WHERE id_livre = ?");
            ps.setString(1, l.getTitre_livre());
            ps.setString(2, l.getAuteur_livre());
            ps.setString(3, l.getEditeur_livre());
            ps.setDate(4, new java.sql.Date(l.getDate_pub().getTime()));
            ps.setInt(5, l.getId_livre());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }

    @Override
    public void deleteLivre(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM livre WHERE id_livre = ?");
            ps.setInt(1, id);

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


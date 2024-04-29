package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Membre;

public class MembreDAOImpl implements IMembreDAO {

    private Connection connection;

    public MembreDAOImpl() {
        connection = SingletonConnection.getConnection();
    }

    @Override
    public Membre save(Membre M) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO membre (nom_membre, adresse, tele) VALUES (?, ?, ?)");
            ps.setString(1, M.getNom_membre());
            ps.setString(2, M.getAdresse());
            ps.setString(3, M.getTele());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return M;
    }

    @Override
    public List<Membre> MembreParMc(String mv) {
        List<Membre> membres = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM membre WHERE nom_membre LIKE ?");
            ps.setString(1, "%" + mv + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                membres.add(new Membre(rs.getInt("id_membre"), rs.getString("nom_membre"), rs.getString("adresse"), rs.getString("tele")));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return membres;
    }

    @Override
    public Membre getMembre(int id) {
        Membre membre = null;
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM membres WHERE id_membre = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                membre = new Membre(rs.getInt("id_membre"), rs.getString("nom_membre"), rs.getString("adresse"), rs.getString("tele"));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return membre;
    }

    @Override
    public Membre update(Membre M) {
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE membre SET nom_membre=?, adresse=?, tele=? WHERE id_membre=?");
            ps.setString(1, M.getNom_membre());
            ps.setString(2, M.getAdresse());
            ps.setString(3, M.getTele());
            ps.setInt(4, M.getId_membre());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return M;
    }

    @Override
    public void deleteMembre(int id) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM membre WHERE id_membre=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


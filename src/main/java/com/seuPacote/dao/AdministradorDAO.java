package com.seuPacote.dao;

import com.seuPacote.model.Administrador;
import com.seuPacote.infra.DataBaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdministradorDAO {
    public void save(Administrador administrador) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "INSERT INTO Administrador (ID, Senha) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, administrador.getID());
        stmt.setString(2, administrador.getSenha());
        stmt.executeUpdate();
        conn.close();
    }

    public Administrador findByID(int id) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "SELECT * FROM Administrador WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            Administrador admin = new Administrador(rs.getInt("ID"), rs.getString("Senha"));
            conn.close();
            return admin;
        }
        conn.close();
        return null;
    }

    public void update(Administrador administrador) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "UPDATE Administrador SET Senha = ? WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, administrador.getSenha());
        stmt.setInt(2, administrador.getID());
        stmt.executeUpdate();
        conn.close();
    }

    public void delete(int id) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "DELETE FROM Administrador WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        conn.close();
    }
}

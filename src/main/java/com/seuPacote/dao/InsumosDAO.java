package com.seuPacote.dao;

import com.seuPacote.model.Insumos;
import com.seuPacote.infra.DataBaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InsumosDAO {
    public void save(Insumos insumo) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "INSERT INTO Insumos (ID, Nome, Marca, Quantidade, Aviso_Insumo_minimo) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, insumo.getID());
        stmt.setString(2, insumo.getNome());
        stmt.setString(3, insumo.getMarca());
        stmt.setInt(4, insumo.getQuantidade());
        stmt.setString(5, insumo.getAvisoInsumoMinimo());
        stmt.executeUpdate();
        conn.close();
    }

    public Insumos findByID(int id) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "SELECT * FROM Insumos WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            Insumos insumo = new Insumos(
                    rs.getInt("ID"),
                    rs.getString("Nome"),
                    rs.getString("Marca"),
                    rs.getInt("Quantidade"),
                    rs.getString("Aviso_Insumo_minimo")
            );
            conn.close();
            return insumo;
        }
        conn.close();
        return null;
    }

    public void update(Insumos insumo) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "UPDATE Insumos SET Nome = ?, Marca = ?, Quantidade = ?, Aviso_Insumo_minimo = ? WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, insumo.getNome());
        stmt.setString(2, insumo.getMarca());
        stmt.setInt(3, insumo.getQuantidade());
        stmt.setString(4, insumo.getAvisoInsumoMinimo());
        stmt.setInt(5, insumo.getID());
        stmt.executeUpdate();
        conn.close();
    }

    public void delete(int id) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "DELETE FROM Insumos WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        conn.close();
    }
}

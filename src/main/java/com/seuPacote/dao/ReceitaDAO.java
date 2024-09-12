package com.seuPacote.dao;

import com.seuPacote.model.Receita;
import com.seuPacote.infra.DataBaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReceitaDAO {

    private Connection connection;

    public ReceitaDAO() {
        this.connection = DataBaseConnection.getConnection();
    }

    public void save(Receita receita) throws SQLException {
        String sql = "INSERT INTO Receita (Rec_Ingred_Pizza, Suco) VALUES (?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, receita.getRecIngredPizza());
        stmt.setString(2, receita.getSuco());
        stmt.executeUpdate();
        stmt.close();
    }

    public Receita findById(int id) throws SQLException {
        String sql = "SELECT * FROM Receita WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Receita receita = null;

        if (rs.next()) {
            receita = new Receita(rs.getInt("ID"), rs.getString("Rec_Ingred_Pizza"), rs.getString("Suco"));
        }
        rs.close();
        stmt.close();
        return receita;
    }

    public List<Receita> findAll() throws SQLException {
        String sql = "SELECT * FROM Receita";
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Receita> receitas = new ArrayList<>();

        while (rs.next()) {
            Receita receita = new Receita(rs.getInt("ID"), rs.getString("Rec_Ingred_Pizza"), rs.getString("Suco"));
            receitas.add(receita);
        }
        rs.close();
        stmt.close();
        return receitas;
    }

    public void update(Receita receita) throws SQLException {
        String sql = "UPDATE Receita SET Rec_Ingred_Pizza = ?, Suco = ? WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, receita.getRecIngredPizza());
        stmt.setString(2, receita.getSuco());
        stmt.setInt(3, receita.getId());
        stmt.executeUpdate();
        stmt.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM Receita WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
    }
}

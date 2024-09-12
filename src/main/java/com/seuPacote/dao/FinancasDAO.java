package com.seuPacote.dao;

import com.seuPacote.model.Financas;
import com.seuPacote.infra.DataBaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FinancasDAO {

    private Connection connection;

    public FinancasDAO() {
        this.connection = DataBaseConnection.getConnection();
    }

    public void save(Financas financas) throws SQLException {
        String sql = "INSERT INTO Financas (Lucro, Gastos) VALUES (?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setDouble(1, financas.getLucro());
        stmt.setDouble(2, financas.getGastos());
        stmt.executeUpdate();
        stmt.close();
    }

    public Financas findById(int id) throws SQLException {
        String sql = "SELECT * FROM Financas WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Financas financas = null;

        if (rs.next()) {
            financas = new Financas(rs.getInt("ID"), rs.getDouble("Lucro"), rs.getDouble("Gastos"));
        }
        rs.close();
        stmt.close();
        return financas;
    }

    public List<Financas> findAll() throws SQLException {
        String sql = "SELECT * FROM Financas";
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Financas> financasList = new ArrayList<>();

        while (rs.next()) {
            Financas financas = new Financas(rs.getInt("ID"), rs.getDouble("Lucro"), rs.getDouble("Gastos"));
            financasList.add(financas);
        }
        rs.close();
        stmt.close();
        return financasList;
    }

    public void update(Financas financas) throws SQLException {
        String sql = "UPDATE Financas SET Lucro = ?, Gastos = ? WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setDouble(1, financas.getLucro());
        stmt.setDouble(2, financas.getGastos());
        stmt.setInt(3, financas.getId());
        stmt.executeUpdate();
        stmt.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM Financas WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
    }
}

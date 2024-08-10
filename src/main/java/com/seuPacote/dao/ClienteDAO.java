package com.seuPacote.dao;

import com.seuPacote.infra.DatabaseConnection;
import com.seuPacote.model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public void save(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO Cliente (ID, FazerPedido, Pagar, Avaliar) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getFazerPedido());
            stmt.setDouble(3, cliente.getPagar());
            stmt.setString(4, cliente.getAvaliar());
            stmt.executeUpdate();
        }
    }

    public Cliente findById(int id) throws SQLException {
        String sql = "SELECT * FROM Cliente WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Cliente(
                        rs.getInt("ID"),
                        rs.getString("FazerPedido"),
                        rs.getDouble("Pagar"),
                        rs.getString("Avaliar")
                );
            }
        }
        return null;
    }

    public List<Cliente> findAll() throws SQLException {
        String sql = "SELECT * FROM Cliente";
        List<Cliente> clientes = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                clientes.add(new Cliente(
                        rs.getInt("ID"),
                        rs.getString("FazerPedido"),
                        rs.getDouble("Pagar"),
                        rs.getString("Avaliar")
                ));
            }
        }
        return clientes;
    }

    public void update(Cliente cliente) throws SQLException {
        String sql = "UPDATE Cliente SET FazerPedido = ?, Pagar = ?, Avaliar = ? WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getFazerPedido());
            stmt.setDouble(2, cliente.getPagar());
            stmt.setString(3, cliente.getAvaliar());
            stmt.setInt(4, cliente.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM Cliente WHERE ID = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}

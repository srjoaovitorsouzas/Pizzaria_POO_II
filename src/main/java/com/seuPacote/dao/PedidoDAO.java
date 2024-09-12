package com.seuPacote.dao;

import com.seuPacote.model.Pedido;
import com.seuPacote.infra.DataBaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {

    private Connection connection;

    public PedidoDAO() {
        this.connection = DataBaseConnection.getConnection();
    }

    public void save(Pedido pedido) throws SQLException {
        String sql = "INSERT INTO Pedido (Pedido, Preco, Cod_Pedido) VALUES (?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, pedido.getPedido());
        stmt.setDouble(2, pedido.getPreco());
        stmt.setString(3, pedido.getCodPedido());
        stmt.executeUpdate();
        stmt.close();
    }

    public Pedido findById(int id) throws SQLException {
        String sql = "SELECT * FROM Pedido WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Pedido pedido = null;

        if (rs.next()) {
            pedido = new Pedido(rs.getInt("ID"), rs.getString("Pedido"), rs.getDouble("Preco"), rs.getString("Cod_Pedido"));
        }
        rs.close();
        stmt.close();
        return pedido;
    }

    public List<Pedido> findAll() throws SQLException {
        String sql = "SELECT * FROM Pedido";
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Pedido> pedidos = new ArrayList<>();

        while (rs.next()) {
            Pedido pedido = new Pedido(rs.getInt("ID"), rs.getString("Pedido"), rs.getDouble("Preco"), rs.getString("Cod_Pedido"));
            pedidos.add(pedido);
        }
        rs.close();
        stmt.close();
        return pedidos;
    }

    public void update(Pedido pedido) throws SQLException {
        String sql = "UPDATE Pedido SET Pedido = ?, Preco = ?, Cod_Pedido = ? WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, pedido.getPedido());
        stmt.setDouble(2, pedido.getPreco());
        stmt.setString(3, pedido.getCodPedido());
        stmt.setInt(4, pedido.getId());
        stmt.executeUpdate();
        stmt.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM Pedido WHERE ID = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        stmt.close();
    }
}

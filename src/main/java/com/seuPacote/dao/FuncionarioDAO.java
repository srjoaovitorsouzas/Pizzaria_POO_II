package com.seuPacote.dao;

import com.seuPacote.model.Funcionario;
import com.seuPacote.infra.DataBaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    public void save(Funcionario funcionario) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "INSERT INTO Funcionario (ID, Biometria, Bater_o_Ponto_Data_e_Hora) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, funcionario.getID());
        stmt.setString(2, funcionario.getBiometria());
        stmt.setTimestamp(3, Timestamp.valueOf(funcionario.getBaterOPontoDataHora()));
        stmt.executeUpdate();
        conn.close();
    }

    public Funcionario findByID(int id) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "SELECT * FROM Funcionario WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            Funcionario func = new Funcionario(
                    rs.getInt("ID"),
                    rs.getString("Biometria"),
                    rs.getTimestamp("Bater_o_Ponto_Data_e_Hora").toLocalDateTime()
            );
            conn.close();
            return func;
        }
        conn.close();
        return null;
    }

    public void update(Funcionario funcionario) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "UPDATE Funcionario SET Biometria = ?, Bater_o_Ponto_Data_e_Hora = ? WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, funcionario.getBiometria());
        stmt.setTimestamp(2, Timestamp.valueOf(funcionario.getBaterOPontoDataHora()));
        stmt.setInt(3, funcionario.getID());
        stmt.executeUpdate();
        conn.close();
    }

    public void delete(int id) throws SQLException {
        Connection conn = DataBaseConnection.getConnection();
        String sql = "DELETE FROM Funcionario WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        conn.close();
    }
}

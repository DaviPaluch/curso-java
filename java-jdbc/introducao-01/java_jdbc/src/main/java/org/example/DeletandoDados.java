package org.example;

import java.sql.*;

public class DeletandoDados {
    public static void main(String[] args) throws SQLException {
        CriaConexao fatory = new CriaConexao();
        Connection connection = fatory.recuperarConexao();

        Statement statement = connection.createStatement();
        statement.execute("DELETE FROM produto WHERE id > 2");

        int linhasmodificadas = statement.getUpdateCount();
        System.out.println("Quantidade de linhas modificadas:" + linhasmodificadas);

    }
}

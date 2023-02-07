package org.example;
import java.sql.*;

public class App
{
    public static void main( String[] args ) throws SQLException {

        CriaConexao criaConexao = new CriaConexao();
        Connection connection  = criaConexao.recuperarConexao();

        Statement statement = connection.createStatement();

        statement.execute("SELECT * FROM produto");

        ResultSet rst = statement.getResultSet();

        while (rst.next()){
            int id = rst.getInt("id");
            System.out.println(id);
            String nome = rst.getString("nome");
            System.out.println(nome);
            String descricao = rst.getString("descricao");
            System.out.println(descricao);
        }

        System.out.println("Encerrando conexao");
        connection.close();

    }
}

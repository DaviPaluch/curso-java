package org.example;

import java.sql.*;

public class SqlStatementPrepared {
    public static void main(String[] args) throws SQLException {

        CriaConexao criaConexao = new CriaConexao();
        try (Connection connection  = criaConexao.recuperarConexao();) {
            connection.setAutoCommit(false);


            try (PreparedStatement statement = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?,?)"
                    , PreparedStatement.RETURN_GENERATED_KEYS);) {
                adicionarVariavel("Tecladoo", "Teclado mecanico); DELETE FROM produto", statement);
                adicionarVariavel("Teclado", "Teclado ergonomico); DELETE FROM produto", statement);

                connection.commit();


            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ROLLBACK EXECUTADO");
                connection.rollback(); /* ----> o rollback executado de fato*/
            }
        }
    }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement statement) throws SQLException{

        statement.setString(1, nome);
        statement.setString(2,descricao);

        if (nome.equals("Tecladoo")){
            throw new RuntimeException("Não foi possivel adicionar o produto");
        }

        statement.execute();

        try (ResultSet resultSet = statement.getGeneratedKeys();){
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                System.out.println(id);
            }
        }



    }
}

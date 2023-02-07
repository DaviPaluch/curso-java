package org.example;

import java.sql.*;
public class InserindoDados {

    public static void main(String[] args) throws SQLException {
         CriaConexao factoty = new CriaConexao();
         Connection connection = factoty.recuperarConexao();

         Statement stm = connection.createStatement();
         stm.execute("INSERT INTO produto (nome,descricao) VALUES ('iphone 14', 'iphone 14 pro max vermelho')"
            , Statement.RETURN_GENERATED_KEYS);

         ResultSet rst = stm.getGeneratedKeys();
         while (rst.next()){
             int id = rst.getInt(1);
             System.out.println(id);
         }
    }


}

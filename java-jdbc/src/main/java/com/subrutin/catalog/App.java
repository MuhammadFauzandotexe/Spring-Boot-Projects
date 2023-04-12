package com.subrutin.catalog;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.subrutin.catalog.domain.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  List<Book> result = new ArrayList<>();

          String sqlQuery = "Select * from Book";

          try (Connection conn = DriverManager.getConnection(
                  "jdbc:postgresql://127.0.0.1:5432/book_catalog", "subrutin", "subrutin");
               PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery)) {

              ResultSet resultSet = preparedStatement.executeQuery();

              while (resultSet.next()) {

                  long id = resultSet.getLong("id");
                  String title = resultSet.getString("title");
                  String authorName = resultSet.getString("author_name");
                  String description = resultSet.getString("description");

                  Book obj = new Book();
                  obj.setId(id);
                  obj.setTitle(title);
                  obj.setAuthorName(authorName);
                  obj.setDescription(description);

                  result.add(obj);

              }
              result.forEach(x -> System.out.println(x));

          } catch (SQLException e) {
              System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
          } catch (Exception e) {
              e.printStackTrace();
          }

      }
    
}

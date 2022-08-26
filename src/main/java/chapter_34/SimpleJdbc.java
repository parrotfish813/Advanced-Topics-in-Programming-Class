package chapter_34;
import java.sql.*;
public class SimpleJdbc {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    // Step-1 Load the JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver loaded");
    // Step-2 Establish a connection
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "scott", "tiger");
    System.out.println("Database connected");
    // Step-3 Create a statement
    Statement statement = connection.createStatement();
    // Step-4 Execute a statement
    ResultSet resultSet = statement.executeQuery
    ("select firstName, mi, lastName from Student where lastName = 'Smith'");
 //      ("select firstName, mi, lastName from Student");
    // Iterate through the result and print the student names
    while (resultSet.next())
      System.out.println(resultSet.getString(1) + "\t" +
        resultSet.getString(2) + "\t" + resultSet.getString(3));
    // Close the connection
    connection.close();
  }
}

// public class DBConnection {

// import java.sql.Connection;
// import java.sql.DriverManager;

//  public static Connection createConnection(){

//      Connection connection = null;

//      String url = "http://localhost/phpmyadmin/index.php?route=/database/structure&db=CS4125"; //MySQL URL and followed by the database name
//      String username = "root"; //MySQL username
//      String password = "root123"; //MySQL password  
//      try{
//          try
//          {
//             Class.forName("com.mysql.jdbc.Driver"); //loading mysql driver
//          }
//          catch (ClassNotFoundException e)
//          {
//             e.printStackTrace();
//          }
//          connection = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
//          System.out.println("Printing connection object "+ connection);
//      }
//      catch (Exception e)
//      {
//         e.printStackTrace();
//      }
//      return connection;
//  }

// }

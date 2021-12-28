import java.sql.*;

public class insertDB {
    private String name;
    private String gender;
    private String taille;
    private String color;
    private String age;

  insertDB(String name, String gender, String taille, String color, String age){
    this.name = name;
    this.gender = gender;
    this.taille = taille;
    this.color = color;
    this.age = age;

    connectDB();

  }

  public void connectDB(){
      Connection connect = null;
      Statement state = null;
      PreparedStatement ps = null;
      ResultSet rs = null;

      try {
          Class.forName("com.mysql.jdbc.Driver");
          connect = DriverManager.getConnection("jdbc:mysql://localhost/Agents?user=root&password=0000");
          state = connect.createStatement();

          connect.prepareStatement("insert into users(name, gender, taille, hairColor, age) values ('" +
                  this.name + "', '" + this.gender + "', '" + this.taille + "', '" + this.color + "', '" + this.age + "');").executeUpdate();

      } catch (Exception ex){
          ex.printStackTrace();
      }
    }
}

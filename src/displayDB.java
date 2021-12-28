import java.sql.*;

public class displayDB {

    displayDB(){
        Connection connect = null;
        Statement state = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/Agents?user=root&password=0000");
            state = connect.createStatement();

            rs = state.executeQuery("select * from users");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("|\tNom \t\t Sexe \t\t\tTaille \t\t\tCouleur des cheveux \t\t\tAge\t\t |");
            System.out.println("------------------------------------------------------------------------------------------");

            while(rs.next()) {
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String taille = rs.getString("taille");
                String hairColor = rs.getString("hairColor");
                String age = rs.getString("age");
                System.out.println("|\t" + name + "\t  "+ gender +" \t\t\t"+ taille +" \t\t\t\t"+ hairColor +" \t\t\t\t\t"+ age +"\t ");
                System.out.println("------------------------------------------------------------------------------------------");





            }

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

    }



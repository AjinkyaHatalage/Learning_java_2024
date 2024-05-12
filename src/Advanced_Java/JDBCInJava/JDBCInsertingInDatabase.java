package Advanced_Java.JDBCInJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertingInDatabase {
    public static void main(String[] args) throws SQLException {
        // Creating the connection
        // mysql -u user_Name -p password_entered  -> use this command on command line for connecting to database
        String URL = "jdbc:mysql://localhost:3306/demo";
        String Username ="root";
        String Password ="Actimize1!";

        //initialize connection
        Connection conn = null;

        int rollno  = 2;
        String name = "Ajinkya";
        int age = 23;
        // SQL Query
        String sql = "insert into student(rollno , name , age) "+ "values(" + rollno + " ," + name +","+ age+");";

        try{
            // getconnection by calling drivermanger
            conn = DriverManager.getConnection(URL,Username,Password);

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if(m==1){
                System.out.println("Inserted Succesfully : "+ sql);
            }
            else{
                System.out.println("Insertion Failed");
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally {
            conn.close();
        }


    }
}

import java.sql.*;
public class Dbconnection{
    public static void main(String[] args){
        //1.Connecting to the data base
        //URL,username,password
        try{
        String url="jdbc:mysql://localhost:3306/suchandra";
        String user="root";
        String pass="suchandra";
        Connection con=DriverManager.getConnection(url,user,pass);
        if(con!=null)System.out.println("Successfully Connected");
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
//java -classpath";connector path"filename
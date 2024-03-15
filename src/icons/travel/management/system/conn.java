//JDBC java database connicityvity
//JDBC concept in 5
//1.Register the driver class  use driver my sql
//2. creating connection string
//3.creating a statement

package travel.management.system;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    
    conn(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         c=DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","mysql");
         s=c.createStatement();
    }catch(Exception e){
        e.printStackTrace();
    }
    
}
}

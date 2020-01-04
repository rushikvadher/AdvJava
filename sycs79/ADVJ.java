package sycs79;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class ADVJ{
    public static void main(String[] args) {
        String DB_URL="jdbc:mysql://127.0.0.1:3306/mysql";
        Connection conn;
        Statement stmt;
        try{
            conn=DriverManager.getConnection(DB_URL,"root","scott");
            System.out.println("Connected");
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("use empdb1;");
            stmt.execute("insert into sycs1 values(1,'rushik')");
            rs=stmt.executeQuery("select * from sycs1;");
            while(rs.next()){
            System.out.println("\n"+rs.getInt(1)+"   "+rs.getString(2));
            }
        }
        catch(Exception j){
            j.printStackTrace();
    }
    }
}

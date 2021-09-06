package librarysystem;

import java.sql.Connection;
import java.sql.*;

public class Connector {
    
    String dbName,userName,password;
    Connection conn;
    public PreparedStatement pst;
    
    public Connector(String dbName, String userName, String password) throws SQLException{
        this.dbName=dbName;
        this.userName=userName;
        this.password=password;
        doConnect();
    }
    
    public void doConnect()throws SQLException{
        try{
            this.conn=DriverManager.getConnection(dbName, userName, password);
        }catch (Exception e){
            System.out.println("Error : " +e.toString());
        }
    }
    
    public void prepStatement(String statement) throws SQLException{
        try{
        pst=conn.prepareStatement(statement);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void execUpdate() throws SQLException{
        try{
        pst.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public ResultSet execQuery(){
        ResultSet rs=null;
        try{
            rs=pst.executeQuery();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }
}

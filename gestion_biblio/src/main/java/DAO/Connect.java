package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import jakarta.el.ELException;

public class Connect {

private static Connection connection;
static {
	try { 

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/biblio","postgres","1234");

       
    } catch ( Exception e ) {
           e.printStackTrace();
        }
        
    }
public static  Connection getConnection() {
	return connection;
}
    
	
    
}
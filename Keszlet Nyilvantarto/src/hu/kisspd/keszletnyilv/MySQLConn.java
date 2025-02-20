package hu.kisspd.keszletnyilv;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class MySQLConn {
    Connection conn = null;
    public static Connection ConnectDB()
    {
        String host = "jdbc:mysql://linsql.verebely.dc:3306/diak55";
        String user = "diak55";
        String password = "TVYAIK";
        try
        {
            Connection conn = DriverManager.getConnection(host, user, password);
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(
                    null, 
                    "Nem sikerült csatlakozni az adatbázishoz! " + e.getMessage(),
                    "Hiba", 
                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

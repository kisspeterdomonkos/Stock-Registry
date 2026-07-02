package hu.kisspd.keszletnyilv;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class MySQLConn {
    Connection conn = null;
    public static Connection ConnectDB()
    {
        String host = "jdbc:mysql://localhost:3306/adatbazis_neve?useSSL=false&serverTimezone=Europe/Budapest";
        String user = "root";
        String password = "";
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

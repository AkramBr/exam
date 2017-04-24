
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Akram
 */
public class connect {
    Connection conn=null;
    public static Connection ConnecrDb(){
        try{
         Class.forName("org.sqlite.JDBC");
         Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Akram\\Desktop\\Nouveau dossier\\Exams.sqlite");
         return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}

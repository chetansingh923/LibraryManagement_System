

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    static Connection con=null;
    public static Connection ConnectToDB() {
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","1234");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}
}

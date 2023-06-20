
package electricity_billing_system;

import java.sql.*;

public class Database {
    Connection c;
    Statement s;
    Database(){
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_system","root","90928");
            s = c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

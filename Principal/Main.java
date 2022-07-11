
package Principal;
import Vista.*;
import Modelo.*;


public class Main {
    
    
    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        conexion.getConnection();

        
        Login Login = new Login();
        Login.setVisible(true);
    }
    
}

package Config;
 
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class BaseDeDatos {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConexion()throws SQLException{
        Connection conexion=null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comision1109",
                    "root","");
        }catch(SQLException e){
            System.out.println(e.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    } 
    public static void main(String [] argms) throws SQLException{
        BaseDeDatos con = new BaseDeDatos();
 
        Connection  conexion =null;
        conexion = con.getConexion();

        PreparedStatement ps;
        ResultSet rs;
 
        ps = conexion.prepareStatement("SELECT * FROM participantes");
        rs = ps.executeQuery();
 
        while(rs.next()){
            int id = rs.getInt("id");
            String nombres = rs.getString("nombre");
             String apellidos = rs.getString("apellidos");
             String email = rs.getString("email");
             String telefono = rs.getString("telefono");
            System.out.println("id: "+ id +" Nombres: "+ nombres +" Apellidos: "
                    +apellidos+ "Email: "+ email + " Telefono: "+telefono);
        }
 
    }
}

package negocio;

import datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import util.Funciones;

public class inicioSesion extends Conexion{
    
    private String dni;
    private String clave;


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }   

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

  
    public int iniciarSesion() throws Exception{
        String sql="select p.apellido_paterno,p.apellido_materno,p.nombres,u.estado from personal p inner join usuario u on p.dni=u.dni_usuario where p.dni='"+this.getDni()+"' and u.clave=md5('"+this.getClave()+"')";
        
        System.out.println(sql);        
        
        ResultSet resultado = this.ejecutarSQLSelect(sql);
        
        if (resultado.next()) {
            if (resultado.getString("estado").equals("A")) {
                Funciones.NOMBRE_USUARIO_LOGUEADO=resultado.getString("apellido_paterno")+" "+resultado.getString("apellido_materno")+", "+resultado.getString("nombres");
                return 1;
            }else{
                return 2;
            }
        }
        
        return -1;
    }
    
    
    public int iniciarSesionSP() throws Exception{
        String sql="select p.apellido_paterno,p.apellido_materno,p.nombres,u.estado from personal p inner join usuario u on p.dni=u.dni_usuario where p.dni=? and u.clave=md5(?)";
        
        //System.out.println(sql);        
        
        PreparedStatement sentencia = this.abrirConexion().prepareStatement(sql);
        
        sentencia.setString(1, getDni());
        sentencia.setString(2, getClave());
        
        //ResultSet resultado = this.ejecutarSQLSelect(sql);
        
        ResultSet resultado = this.ejecutarSQLSelectSP(sentencia);
        
        if (resultado.next()) {
            if (resultado.getString("estado").equals("A")) {
                Funciones.NOMBRE_USUARIO_LOGUEADO=resultado.getString("apellido_paterno")+" "+resultado.getString("apellido_materno")+", "+resultado.getString("nombres");
                return 1;
            }else{
                return 2;
            }
        }
        
        return -1;
    }
    
    private int numero1,numero2,numero3,numero4;
    private int resultado;
    Random r = new Random();            
    
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
    
    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getNumero4() {
        return numero4;
    }

    public void setNumero4(int numero4) {
        this.numero4 = numero4;
    }     
    

}

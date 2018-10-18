/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author laboratorio_computo
 */
public class articulos extends Conexion{
    
    private int codigo_articulo;
    private String descripcion;
    private String codigo_linea;
    private String codigo_categoria;
    private String codigo_marca;
    private double precio_venta;
    private int stock;

    public int getCodigo_articulo() {
        return codigo_articulo;
    }

    public void setCodigo_articulo(int codigo_articulo) {
        this.codigo_articulo = codigo_articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo_linea() {
        return codigo_linea;
    }

    public void setCodigo_linea(String codigo_linea) {
        this.codigo_linea = codigo_linea;
    }

    public String getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(String codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getCodigo_marca() {
        return codigo_marca;
    }

    public void setCodigo_marca(String codigo_marca) {
        this.codigo_marca = codigo_marca;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

      
    
    
    public ResultSet listar() throws Exception{
        String sql="SELECT articulo.codigo_articulo,articulo.nombre as nombre,   linea.descripcion as linea,   categoria.descripcion as categoria,   marca.descripcion as marca,   articulo.precio_venta,   articulo.stock FROM   public.articulo,   public.linea,   public.categoria,   public.marca WHERE   articulo.codigo_categoria = categoria.codigo_categoria AND  articulo.codigo_marca = marca.codigo_marca AND  linea.codigo_linea = categoria.codigo_linea order by 2";
        PreparedStatement sentencia = abrirConexion().prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        
        ResultSet resultado = ejecutarSQLSelectSP(sentencia);
        return resultado;
    }
    
    public String[] obtenerCamposBusqueda(){
        String campos[] = {"codigo_articulo","nombre","linea","categoria","marca","precio_venta","stock"};
        return campos;
    }
    
}

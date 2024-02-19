/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author oziel
 */
public class Producto {
    String imagen;
    String nombreProducto;
    int cantidadProducto;
    String descripcionProducto;
    int idProducto;
    String codigoProducto;
    double precioUnitario;
    double precioMayoreo;

    public Producto() {
    }

    public Producto(String imagen, String nombreProducto, int cantidadProducto, String descripcionProducto, int idProducto, String codigoProducto, double precioUnitario, double precioMayoreo) {
        this.imagen = imagen;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.descripcionProducto = descripcionProducto;
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.precioUnitario = precioUnitario;
        this.precioMayoreo = precioMayoreo;
    }
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioMayoreo() {
        return precioMayoreo;
    }

    public void setPrecioMayoreo(double precioMayoreo) {
        this.precioMayoreo = precioMayoreo;
    }
    
}

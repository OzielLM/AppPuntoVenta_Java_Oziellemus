/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import java.util.ArrayList;
import java.util.List;
import modelos.Producto;

/**
 *
 * @author oziel
 */
public class NegocioProducto {
    public static List<Producto> lstProductos = new ArrayList<>();
    
    public NegocioProducto(){
        //lstProductos = new ArrayList<>();
    }
    
    //Altas, Bajas Cambios, reglas basicas de negocio
    public boolean altaProducto(Producto p){
        //Validaciones ...
        if(p.getNombreProducto().isEmpty()){
            return false;
        }else{
            lstProductos.add(p);
            return true;
        }
    }
    
    public boolean bajaProducto(Producto p){
        try{
            lstProductos.remove(p.getIdProducto()-1);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;

import personal.Trabajador;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class EmpresaPrivada extends Empresa{
    private double ventas_mensual_fijo;
    private int numero_sucursales;

    public EmpresaPrivada(double ventas_mensual_fijo, int numero_sucursales, String nombre, String siglas, String ciudad, Trabajador[] trabajadores) {
        super(nombre, siglas, ciudad, trabajadores);
        this.ventas_mensual_fijo = ventas_mensual_fijo;
        this.numero_sucursales = numero_sucursales;
    }

    public double getVentas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void setVentas_mensual_fijo(double ventas_mensual_fijo) {
        this.ventas_mensual_fijo = ventas_mensual_fijo;
    }

    public int getNumero_sucursales() {
        return numero_sucursales;
    }

    public void setNumero_sucursales(int numero_sucursales) {
        this.numero_sucursales = numero_sucursales;
    }

    
    @Override
    public String toString(){
        String cadena="";
        for (int i=0; i< trabajadores.length;i++) {
            cadena+= String.format("[%d]%s\n",i+1,getTrabajadores()[i].toString());
        }
        
        return String.format("%s\n"
                + "Ventas: $ %.2f\n"
                + "Sucursales: %d\n"
                + "Lista de Trabajadores:\n\n"
                + "%s\n",super.toString(),getVentas_mensual_fijo(),getNumero_sucursales(),cadena);
    }
    
}

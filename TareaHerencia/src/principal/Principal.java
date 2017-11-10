/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import laempresa.EmpresaPrivada;
import personal.Trabajador;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Trabajador[] trabajadores= new Trabajador[2];
        //Contructor(costo_seguro,horas_trabajadas,costo_por_hora,nombre,apellido,edad,cedula)
        trabajadores[0]= new Trabajador(100,40,10,"Ana Luisa","Velez Alcivar",30,"12903939");
        trabajadores[1]= new Trabajador(100,50,10,"Mario Anibal","Vela Narvaez",35,"212889");
        
        //Constructor(ventas_mensual_fijo,numero_sucursales,nombre,siglas,ciudad,trabajadores)
        EmpresaPrivada ep1= new EmpresaPrivada(200000,12,"Soluciones Software","SS's","Loja",trabajadores);
        
        System.out.println(ep1);
    }
    
}

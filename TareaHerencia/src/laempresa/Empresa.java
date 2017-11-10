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
public class Empresa {
    private String nombre;
    private String siglas;
    private String ciudad;
    Trabajador trabajadores[];

    public Empresa(String nombre, String siglas, String ciudad, Trabajador[] trabajadores) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.ciudad = ciudad;
        this.trabajadores = trabajadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    @Override
    public String toString(){
        return String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s",getNombre(),getSiglas(),getCiudad());
    }
}

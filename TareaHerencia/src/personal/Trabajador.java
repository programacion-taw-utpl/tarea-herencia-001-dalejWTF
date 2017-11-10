/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author danulloa2 <danielulloam@gmail.com>
 */
public class Trabajador extends Persona {
    private double costo_seguro;
    private double horas_trabajadas;
    private double costo_por_hora;
    private double sueldo;
    public Trabajador(double costo_seguro, double horas_trabajadas, double costo_por_hora, String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
        this.costo_seguro = costo_seguro;
        this.horas_trabajadas = horas_trabajadas;
        this.costo_por_hora = costo_por_hora;
        calcular_sueldo();
    }

    public double getCosto_seguro() {
        return costo_seguro;
    }

    public void setCosto_seguro(double costo_seguro) {
        this.costo_seguro = costo_seguro;
    }

    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double getCosto_por_hora() {
        return costo_por_hora;
    }

    public void setCosto_por_hora(double costo_por_hora) {
        this.costo_por_hora = costo_por_hora;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public void calcular_sueldo(){
        this.sueldo=(getHoras_trabajadas()*getCosto_por_hora())+getCosto_seguro();
    }
    
    
    
    @Override
    public String toString(){
        return String.format("%s\n"
                + "\tSeguro: $%.2f\n"
                + "\tHoras Trabajadas: %.2f\n"
                + "\tValor por hora: $%.2f\n"
                + "\tSueldo: $%.2f", super.toString(),getCosto_seguro(),getHoras_trabajadas(),getCosto_por_hora(),getSueldo());
    }
    
}

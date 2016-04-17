/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarvehiculos;

/**
 *
 * @author alejandrosebastian
 */
public class Vehiculo {
    
    protected int numeroSerie;
    protected String marca;
    protected int año;
    protected double precio;

    public Vehiculo(int numeroSerie, String marca, int año, double precio) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "numeroSerie=" + numeroSerie + ", marca=" + marca + ", a\u00f1o=" + año + ", precio=" + precio + '}';
    }
}

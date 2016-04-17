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
public class Camioneta extends Vehiculo{
    
    private double capacidadCarga;
    private int cantEjes;
    private int cantRodadas;

    public Camioneta(double capacidadCarga, int cantEjes, int cantRodadas, int numeroSerie, String marca, int año, double precio) {
        super(numeroSerie, marca, año, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantEjes = cantEjes;
        this.cantRodadas = cantRodadas;
    }

    @Override
    public String toString() {
        return "Tipo de vehiculo: Camioneta"+"Numero de serie: "+numeroSerie+"\nMarca: "+marca+"\nAño: "+año+"\nPrecio: "+precio+"\nCapacidad de carga: "
                +capacidadCarga+"Kg"+"\nCantidad de ejes: "+cantEjes+"\nCantidad de rodadas: "+cantRodadas;
    }
}

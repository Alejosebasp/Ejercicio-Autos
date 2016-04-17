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
public class Auto extends Vehiculo{
    
    protected int cantPasajeros;
    private String tipoDeVehiculo; 

    public Auto(String tipoDeVehiculo,int cantPasajeros, int numeroSerie, String marca, int año, double precio) {
        super(numeroSerie, marca, año, precio);
        this.cantPasajeros = cantPasajeros;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }
    

    @Override
    public String toString() {
        return "Tipo de Vehiculo: "+tipoDeVehiculo+"\nNumero de serie: "+numeroSerie+"\nMarca: "+marca+"\nAño: "+año+"\nPrecio: "+precio+
                "\nCantidad de pasajeros: "+cantPasajeros;
    }
    
}

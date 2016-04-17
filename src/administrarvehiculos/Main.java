/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarvehiculos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alejandrosebastian
 */

public class Main {

public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        AdministrarVehiculos admin = new AdministrarVehiculos();
        
        int eleccion = 1;
        boolean eleccion2 = true;
        String tipoVehiculo = "";
        
        do {
        do {
            try {
                System.out.println("Elija una opcion para empezar:"
                +"\n1. Agregar un Auto de lujo."
                +"\n2. Agregar un Auto compacto."
                +"\n3. Agregar una Vagoneta."
                +"\n4. Agregar una Camioneta"
                +"\n5. Listar todos los vehiculos."
                +"\n0. Para cerrar el programa.");
                
                eleccion = Integer.parseInt(leer.next());
            } catch (Exception e1) {
                System.err.println("Por favor ingrese una opcion valida.");
                eleccion2 = false;
            }
        }while (eleccion2==false);
        
            switch(eleccion){
                case 1:
                    tipoVehiculo = "Auto de Lujo";
                    admin.agregarVehiculo(tipoVehiculo);
                    break;
                case 2:
                    tipoVehiculo = "Auto Compacto";
                    admin.agregarVehiculo(tipoVehiculo);
                    break;
                case 3:
                    tipoVehiculo = "Vagoneta";
                    admin.agregarVehiculo(tipoVehiculo);
                    break;
                case 4:
                    tipoVehiculo = "Camioneta";
                    admin.agregarVehiculo(tipoVehiculo);
                    break;
                case 5:
                    admin.listarVehiculos();
                    break;
            }
            
        } while (eleccion!=0);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrarvehiculos;

import java.util.*;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author alejandrosebastian
 */
public class AdministrarVehiculos {
    private ArrayList <Vehiculo>vehiculos;
    
    public AdministrarVehiculos() {
        vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(String tipoVehiculo){
        Vehiculo v;
        
        Scanner leer = new Scanner(System.in);
        
        int numeroserie = 0, cantPasajeros = 0;
        String marca = "";
        int año = 0, cantEjes=0, cantRodadas=0;
        double precio = 0;
        double capacidadCarga=0;
        boolean continuar=true;
        
        do{
            try {
                System.out.println("Digite el numero de serie del vehiculo");
                numeroserie = Integer.parseInt(leer.next());
                continuar = false;
            } catch (NumberFormatException exception) {
                System.err.println("El numero de serie debe ser un numero entero.");
            }
        }while (continuar==true);
        
        System.out.println("Digite la marca del vehiculo");
        marca = leer.next();
        
        try {
            System.out.println("Digite el año del vehiculo");
            año = Integer.parseInt(leer.next());
        } catch (InputMismatchException exception) {
            System.err.println("El año del vehiculo debe ser un numero entero");
        }
        try {
            System.out.println("Digite el precio del vehiculo");
            precio = leer.nextDouble();
        } catch (InputMismatchException exception) {
            System.err.println("el precio del vehiculo debe ser un numero double.");
        }
        
        
        if (tipoVehiculo.equals("Auto de Lujo") || tipoVehiculo.equals("Auto Compacto") || tipoVehiculo.equals("Vagoneta")){
            System.out.println("Digite la cantidad de pasajeros");
            cantPasajeros = leer.nextInt();
            v = new Auto(tipoVehiculo, cantPasajeros, numeroserie, marca, año, precio);
            vehiculos.add(v);
        }
        
        else if (tipoVehiculo.equals("Camioneta")){
            try {
                System.out.println("Digite la capacidad de carga");
                capacidadCarga = leer.nextDouble();
                System.out.println("Digite la cantidad de ejes");
                cantEjes = leer.nextInt();
                System.out.println("Digite la cantidad de rodadas");
                cantRodadas = leer.nextInt();
            } catch (InputMismatchException exception) {
                System.err.println("asdfghjkñlpoiuytre lkjhgfds");
            }
            v = new Camioneta(capacidadCarga, cantEjes, cantRodadas, numeroserie, marca, año, precio);
            vehiculos.add(v);
        }
    }
    
    public void listarVehiculos(){
        System.err.println("");
        for (Vehiculo v: vehiculos){
            System.out.println(v);
        }
    }
}

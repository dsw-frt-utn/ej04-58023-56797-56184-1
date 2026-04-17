package data;

import domain.*;
import java.util.ArrayList;
import java.util.Optional;

public class Persistencia {
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    public static ArrayList<Responsable> responsables = new ArrayList<>();
    public static ArrayList<Sucursal> sucursales = new ArrayList<>();
    
    public static ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }
    
    public static Optional<Vehiculo> getVehiculo(String patente){
        return vehiculos.stream()
                .filter(v -> v.getPatente().equals(patente))
                .findFirst();
    }
    
}

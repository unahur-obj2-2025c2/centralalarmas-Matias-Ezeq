package ar.edu.unahur.obj2.observer;

import java.util.ArrayList;
import java.util.List;

public class Entidad implements IObservador{

    private final String nombre;
    private List<Alerta> alertasRecibidas;

    

    public Entidad(String nombre) {
        this.nombre = nombre;
        this.alertasRecibidas = new ArrayList<>();
    }



    @Override
    public void actualizar(Alerta alerta) {
        alertasRecibidas.add(alerta);
    }

}

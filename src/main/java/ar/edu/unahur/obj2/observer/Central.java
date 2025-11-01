package ar.edu.unahur.obj2.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Central implements IObservable{
    private Set<IObservador> observadores = new HashSet<>();
    private HashMap<Alerta,Integer> registro = new HashMap<>();


    public void emitirAlerta(String tipo, Integer nivel) {
        if (nivel < 1 || nivel > 10){
            throw new DominioException("Nivel de alerta incorrecto");
        }
        Alerta alerta = new Alerta(tipo, nivel);
        registro.put(alerta, observadores.size());
        notificar(alerta);
    }

    public Integer cantidadNotificacionesEnviadas(){
        return registro.values().stream().mapToInt(n -> n).sum();
    }

    @Override
    public void agregarObservador(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void quitarObservador(IObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar(Alerta alerta) {
        observadores.forEach(o -> o.actualizar(alerta));
    }
}

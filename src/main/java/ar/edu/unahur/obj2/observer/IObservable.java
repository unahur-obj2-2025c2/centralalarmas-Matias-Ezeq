package ar.edu.unahur.obj2.observer;

public interface IObservable {
    void agregarObservador(IObservador observador);

    void quitarObservador(IObservador observador);

    void notificar(Alerta alerta);
}

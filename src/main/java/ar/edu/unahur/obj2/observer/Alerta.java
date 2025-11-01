package ar.edu.unahur.obj2.observer;

public class Alerta {
    private final String tipo; //descripcion del evento
    private final Integer nivel;

    public Alerta(String tipo, Integer nivel) {
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public Boolean esCritica() {
        return this.nivel >= 8;
    }
    
}

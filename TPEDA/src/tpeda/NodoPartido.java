package tpeda;


public class NodoPartido {
    
    private String equipo1;
    private String equipo2;
    private String ganador;
    
    private NodoPartido izquierdo;
    private NodoPartido derecho;
    
    public NodoPartido(String equipo1, String equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.ganador = "";
        this.izquierdo = null;
        this.derecho = null;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public NodoPartido getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoPartido izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoPartido getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoPartido derecho) {
        this.derecho = derecho;
    }
    
    
}

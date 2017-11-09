/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;

/**
 *
 * @author Estudiante
 */
public abstract class Inmuebles {
    protected String nombreBarrio;
    protected int estrato;
    protected float valorArriendo;
    protected double areaConstruida;
    public abstract String darInformacion();

    public Inmuebles(String nombreBarrio, int estrato, float valorArriendo, double areaConstruida) {
        this.nombreBarrio = nombreBarrio;
        this.estrato = estrato;
        this.valorArriendo = valorArriendo;
        this.areaConstruida = areaConstruida;
    }

    public String getNombreBarrio() {
        return nombreBarrio;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public float getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(float valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public String toString() {
        return " " + "nombreBarrio=" + nombreBarrio + ", estrato=" + estrato + ", valorArriendo=" + valorArriendo + ", areaConstruida=" + areaConstruida + '}';
    }
}

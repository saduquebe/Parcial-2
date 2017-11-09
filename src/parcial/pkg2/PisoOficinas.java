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
public class PisoOficinas extends Inmuebles{

private int numeroOficinas;
private double area;

    public PisoOficinas(int numeroOficinas, double area, String nombreBarrio, int estrato, float valorArriendo, double areaConstruida) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.numeroOficinas = numeroOficinas;
        this.area = area;
    }

    @Override
    public String toString() {
        return "PisoOficinas{" + "numeroOficinas=" + numeroOficinas + ", area=" + area + ' ';
    }


    @Override
    public String darInformacion() {
        return this.toString()+super.toString();
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}

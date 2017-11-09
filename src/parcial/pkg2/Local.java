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
public class Local extends Inmuebles{
private String descripcion;
private Boolean esviaprincipal;

    public Local(String descripcion, Boolean tipovia, String nombreBarrio, int estrato, float valorArriendo, double areaConstruida) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.descripcion = descripcion;
        this.esviaprincipal = tipovia;
    }

    @Override
    public String toString() {
        return "Local{" + "descripcion=" + descripcion + ", esviaprincipal=" + esviaprincipal + ' ';
    }


    @Override
    public String darInformacion() {
        return this.toString()+ super.toString();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getTipovia() {
        return esviaprincipal;
    }

    public void setTipovia(Boolean tipovia) {
        this.esviaprincipal = tipovia;
    }
    
    
}

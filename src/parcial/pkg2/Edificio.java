/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Edificio extends Inmuebles{
    private String NombrePropietario;
    private int locales;
    private int pisosOficinas;

    public Edificio(String NombrePropietario, String nombreBarrio, int estrato, float valorArriendo, double areaConstruida) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.NombrePropietario = NombrePropietario;
        this.locales=0;
        this.pisosOficinas=0;
    }
    

    @Override
    public String darInformacion() {
        return this.toString()+super.toString();
    }
    public Boolean pisoLibre(){
        return false;
    }

    public String getNombrePropietario() {
        return NombrePropietario;
    }

    public void setNombrePropietario(String NombrePropietario) {
        this.NombrePropietario = NombrePropietario;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public int getPisosOficinas() {
        return pisosOficinas;
    }

    public void setPisosOficinas(int pisosOficinas) {
        this.pisosOficinas = pisosOficinas;
    }



    @Override
    public String toString() {
        return "Edificio{" + "NombrePropietario=" + NombrePropietario + ", locales=" + locales + ", pisosOficinas=" + pisosOficinas + ' ';
    }
    
    
}

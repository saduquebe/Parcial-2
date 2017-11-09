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
public class Empresa {
    private String nombre;
    private ArrayList<Inquilino>inquilinos;
    private ArrayList<Inmuebles> inmuebles;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.inquilinos= new ArrayList<>();
        this.inmuebles= new ArrayList<>();
    }
    public void addInmueble(Inmuebles inmueble){
        this.inmuebles.add(inmueble);
    }
    public String Listarinmuebles(){
        String informacion="";
        for (Inmuebles inmueble : this.inmuebles ) {
        informacion=informacion+inmueble.darInformacion();   
        }
        return informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Inquilino> getInquilinos() {
        return inquilinos;
    }

    public void setInquilinos(ArrayList<Inquilino> inquilinos) {
        this.inquilinos = inquilinos;
    }

    public ArrayList<Inmuebles> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmuebles> inmuebles) {
        this.inmuebles = inmuebles;
    }
    
}

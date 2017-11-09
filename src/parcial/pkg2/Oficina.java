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
public class Oficina extends Local{
    private String tipoOficina;

    public Oficina(String tipoOficina, String descripcion, Boolean tipovia, String nombreBarrio, int estrato, float valorArriendo, double areaConstruida) {
        super(descripcion, tipovia, nombreBarrio, estrato, valorArriendo, areaConstruida);
        this.tipoOficina = tipoOficina;
    }
    
    @Override
    public String darInformacion(){
       return this.tipoOficina+ super.darInformacion();
    }

    public String getTipoOficina() {
        return tipoOficina;
    }

    public void setTipoOficina(String tipoOficina) {
        this.tipoOficina = tipoOficina;
    }

}

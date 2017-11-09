package parcial.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class CargarArchivos {
    public Empresa empresa;

    public CargarArchivos() {
      this.empresa= new Empresa("FincaRaiz");
    }
    public void Cargar(String ruta){
        File file= new File(ruta);
    Scanner in= null;
        if(file.exists()){
            try {
                in= new Scanner(file);
                String tipo=null,subtipo=null,nombreBarrio=null,descripcion=null;
                Float valor=null;
                int estrato=0;
                Double area=0.0;
                Boolean tipovia=false;
                in.useDelimiter(":");
                while(in.hasNext()){
                tipo= in.next().trim();
                if(tipo.equals("Local")){
                subtipo=in.next().trim();
                nombreBarrio=in.next().trim();
                estrato=in.nextInt();
                valor=in.nextFloat();
                area=in.nextDouble();
                tipovia=in.nextBoolean();
                descripcion=in.next().trim();
                Local local= new Local(descripcion,tipovia,nombreBarrio,estrato, valor, area);
                
                empresa.addInmueble(local);
                }
                 if(tipo.equals("PisoOficinas")){
                int numeroOficinas=0;
                nombreBarrio=in.next().trim();
                estrato= in.nextInt();
                valor=in.nextFloat();
                area=in.nextDouble();
                numeroOficinas=in.nextInt();
                PisoOficinas piso=new PisoOficinas(numeroOficinas,area,nombreBarrio,estrato,valor,area);
                empresa.addInmueble(piso);
                }
                 if(tipo.equals("Edificio")){
                     subtipo=in.next().trim();
                     nombreBarrio=in.next().trim();
                     estrato=in.nextInt();
                     valor=in.nextFloat();
                     area=in.nextDouble();
                     String NombrePropietario=in.next().trim();
                     int numerolocales=in.nextInt();
                     int numeropisosoficinas=in.nextInt();
                     Edificio edificio= new Edificio(NombrePropietario, nombreBarrio, estrato, valor, area);
                     edificio.setLocales(numerolocales);
                     edificio.setPisosOficinas(numeropisosoficinas);
                    empresa.addInmueble(edificio);
                 }
                }
            } catch (FileNotFoundException ex) {

            }
            }
    
    
    }
}
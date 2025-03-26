
package modelo;
import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class cine {
    private String nombre;
    private silla[]Sillas;
    
    public cine(String nombre,int capacidad){
        this.nombre=nombre;
        this.Sillas=new silla[capacidad];
        for (int i = 0; i < capacidad; i++){
            Sillas[i]=new silla (i+1,false);
            
        }
    }
    public boolean reservarSilla(int numeroSilla){
        if(numeroSilla<=0|| numeroSilla>Sillas.length){
        return false;
        
    }
        silla silla=Sillas[numeroSilla-1];
        if(!silla.isReservada()){
            silla.setReservada(true);
            return true;
        }
        return false;
    }
    public boolean haySillasDisponibles(){
        for(silla silla: Sillas){
            if(!silla.isReservada()){
                return true;
            }
        }
        return true;
    }
    public String mostrarEstado(){
        StringBuilder estado = new StringBuilder();
        for (silla silla: Sillas){
            estado.append("silla").append(silla.getNumero()).append(":").append(silla.isReservada()?"Reservada":"Disponible").append("/n");
        }
            return estado.toString();
    }
    
}

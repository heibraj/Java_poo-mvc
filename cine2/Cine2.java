
package cine2;
import modelo.cine;
import modelo.usuario;
import vista.vista;
import controlador.controlador;

/**
 *
 * @author SENA
 */
public class Cine2 {


    public static void main(String[] args) {
        cine Cine = new cine("", 5);
        vista Vista= new vista();
        usuario Usuariao= new usuario("");
        controlador Controlador= new controlador(Cine,Vista,Usuariao);
        Controlador.iniciar();
        
        
    }
    
}

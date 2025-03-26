
package controlador;
import modelo.cine;
import modelo.usuario;
import vista.vista;
import java.util.Scanner;
/**
 *
 * @author SENA
 */
public class controlador {
    private cine Cine;
    private vista Vista;
    private usuario Usuario;
    private Scanner scanner;
    
    public controlador(cine Cine,vista Vista,usuario Usuario){
        this.Cine=Cine;
        this.Vista=Vista;
        this.Usuario=Usuario;
        this.scanner= new Scanner(System.in);
    }
    public void iniciar(){
        Vista.mostrarBienvenida();
        boolean continuar= true;
        while(continuar){
            Vista.mostrarOpciones();
            int opcion= scanner.nextInt();
            switch(opcion){
                case 1:
                    Vista.mostrarEstadoCine(Cine.mostrarEstado());
                    break;
                case 2:
                    if(Cine.haySillasDisponibles()){
                        System.out.println("ingrese la siila a reservar");
                        int numeroSilla=scanner.nextInt();
                        boolean exito= Cine.reservarSilla(numeroSilla);
                        if(exito){
                            System.out.println("reserva exitosa");
                        }else{System.out.println("la silla ya esta reservada");
                        }
                    }else{Vista.mostrarErrorReserva("no hay sillas disponibles bye");
                    }
                    break;
                case 3:
                    System.out.println("que dios lo bendiga");
                    continuar= false;
                    break;
                default:
                    System.out.println("opcion incorrcta error error ");
                    break;
            }
        }

}
}

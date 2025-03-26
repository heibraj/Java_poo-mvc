
package vista;

/**
 *
 * @author SENA
 */
public class vista {
    public void mostrarBienvenida(){
        System.out.println("bienvenido al sistema de reservas");
        System.out.println("vamos a ver los asientos disponibles");
    }
    public void mostrarEstadoCine(String estado){
        System.out.println("\nEstado actual de las sillas");
        System.out.println(estado);
    }
    public void mostrarErrorReserva(String mensaje){
        System.out.println(mensaje);
    }
    public void mostrarOpciones(){
        System.out.println("seleccione una opcion");
        System.out.println("1:ver el estado de la silla");
        System.out.println("2:hacer una reserva");
        System.out.println("3:salir");
    }
    public void mostrarMensajeSalida(){
        System.out.println("\nGracias buen dia");
    }
    public void mostrarMensajeCapacidadCompleta(){
        System.out.println("no hay asientos disponibles");
    }
    public void nostrarReservasUsuario(String reservas){
        System.out.println(reservas);
    }
    public void preguntarSiContinuar(){
        System.out.println("deseas hacer otra reserva");
    }
}

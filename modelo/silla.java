
package modelo;

/**
 *
 * @author SENA
 */
public class silla {
private int numero;
private boolean reservada;

public silla(int numero, boolean reservada){
    this.numero=  numero;
    this.reservada= reservada;
}
public int getNumero(){
    return numero;
}
public boolean isReservada(){
    return reservada;
}
public void setReservada(boolean reservada){
    this.reservada= reservada;
}

}

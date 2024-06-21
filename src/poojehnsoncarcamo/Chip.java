/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poojehnsoncarcamo;

/**
 *
 * @author jehns
 */
public class Chip {
   private Operador operador;
    public int numero;
    
    Chip( Operador operador, int numero){
        this.operador = operador;
        this.numero = numero;
    }
    
    String getoperador(){
        return this.operador.nombre;
    }
}

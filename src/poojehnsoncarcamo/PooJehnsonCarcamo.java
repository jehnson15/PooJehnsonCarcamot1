/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poojehnsoncarcamo;

/**
 *
 * @author jehns
 */
public class PooJehnsonCarcamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operador op1 = new Operador("Tigo", "Honduras");
        Operador op2 = new Operador("Claro", "Mexico");
        
        Chip chip1 = new Chip (op1, 95644900);
        Chip chip2 = new Chip (op2, 33076252);
        
        Fabricante fa1 = new Fabricante("Samsung", "Corea");
        
        Smartphone cel1 = new Smartphone( fa1,"S22+",128,12,4500, chip1, chip2 );
        
        cel1.mostrar();
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poojehnsoncarcamo;

/**
 *
 * @author jehns
 */
public class Smartphone {
   private Fabricante marca;
   private String modelo;
   private int almacenamiento;
   private int ram;
   private int tamanioBateria;
   private Chip chip1;
   private Chip chip2;
   


public Smartphone (Fabricante marca, String modelo, int almacenamiento, int ram, int tamanioBateria, Chip chip1, Chip chip2){
    this.marca = marca;
    this.modelo = modelo;
    this.almacenamiento = almacenamiento;
    this.ram = ram;
    this.tamanioBateria = tamanioBateria;
    this.chip1 = chip1;
    this.chip2 = chip2;

}

public void setmarca(Fabricante marca){
    this.marca = marca;
   
}

public void setmodelo( String modelo){
    this.modelo = modelo;
}

public void setalmacenamiento( int almacenamiento){
    this.almacenamiento = almacenamiento;
    
}

public void setram(int ram){
    this.ram = ram;
}

public void settamanioBateria(int tamanioBateria){
    this.tamanioBateria = tamanioBateria;
}

public void setchip1 (Chip chip1){
    this.chip1 = chip1;
    
}

public void setchip (Chip chip2){
    this.chip2 = chip2;
}

Fabricante getmarca(){
    return this.marca;
} 

String getmodelo(){
    return this.modelo;
}

int getalmacenamiento(){
    return this.almacenamiento;
}

public int getram(){
    return this.ram;
}

public int gettamanioBateria(){
    return this.tamanioBateria;
}

public Chip getchip1(){
    return this.chip1;
}

public Chip getchip2(){
    return this.chip2;
}

void mostrar(){
    System.out.println("La marca es: " + this.marca.nombre);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Almacenamiento: " + this.almacenamiento + "GB");
    System.out.println("Ram: " + this.ram +"GB");
    System.out.println("Bateria: " + this.tamanioBateria + "mAmp");
    System.out.println("#chip1: " + this.chip1.numero +" operador: "+this.chip1.getoperador());
    System.out.println("#Chip2: " + this.chip2.numero+" operador: "+this.chip2.getoperador());
}
}
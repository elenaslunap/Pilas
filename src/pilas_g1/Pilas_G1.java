/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas_g1;

/**
 *
 * @author elenalunapalacio
 */
public class Pilas_G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaArreglo<String> colores = new PilaArreglo();
        PilaArreglo<Integer> edades = new PilaArreglo();
        PilaArreglo<Double> precios = new PilaArreglo();
        PilaArreglo pila = new PilaArreglo();
        
        //Caso de Prueba 1: intenta quitar un elemento de la pila vacía
        try{
             System.out.println("\nElemento quitado: "+ colores.pop());
        } catch(Exception e){
            System.out.println("Error: "+e);
        }
        
        // CP2: inserción en la pila
        colores.push("blanco");
        colores.push("verde");
        colores.push("azul");
        colores.push("amarillo");
        colores.push("negro");
        System.out.println("\nPila de colores: \n"+colores);
        
        // CP3: probar el pop
        try{
             System.out.println("\nElement quitado: "+ colores.pop());
        } catch(Exception e){
            System.out.println("Error: "+e);
        }
        System.out.println("\nPila de colores: \n"+colores);
        
        pila.push("Jueves");
        pila.push(4.5);
        pila.push(18);
        pila.push(true);
        System.out.println("\nPila mezcla: \n" + pila);
        
        colores.multiPop(2);
        System.out.println("\nPila de colores: \n"+colores);
        
        colores.multiPop(5);
        System.out.println("\nPila de colores: \n"+colores);
        
        
        
       
    }
    
}

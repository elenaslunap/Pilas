/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_g1;

/**
 *
 * @author elenalunapalacio
 */
public class EjecutableInvierteCad {
    
    public static void main(String[] args) {
        PilaArreglo<String> pila = new PilaArreglo();
        
        InvierteCad invierte = new InvierteCad("hola");
        invierte.realizaInversion(pila);
        System.out.println(invierte.getCadenaInicial());
        System.out.println("\n CP1: "+invierte.getCadenaInvertida());
        
        InvierteCad invierte2 = new InvierteCad("bonjour");
        invierte2.realizaInversion(pila);
        System.out.println(invierte2.getCadenaInicial());
        System.out.println("\n CP2: "+invierte2.getCadenaInvertida());
        
    }
    
}

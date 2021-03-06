/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_g1;

/**
 *
 * @author elenalunapalacio
 */
import java.util.*;
public class MetodosEstaticosPilas <T>{
    
    public static <T> int indicaNumElem(PilaADT<T> pila){
        //dos pilas
        ArrayList<T> lista;
        int i, contador;
        
        contador = 0;
        lista = new ArrayList<T>();
        while(!pila.isEmpty()){
            lista.add(pila.pop());
            contador++;
        }
        for (i = lista.size()-1; i >= 0 ; i--){
            pila.push(lista.get(i));
            
        }
        return contador;
        
    }
    
    public static <T> void invierteOrden(PilaADT<T> pila){
        ArrayList<T> lista;
        int i;
        
        lista = new ArrayList<T>();
        while(!pila.isEmpty()){
            lista.add(pila.pop());
        }
        for (i = 0; i < lista.size() ; i++){
            pila.push(lista.get(i));
            
        }
    }
    
    public static <T> void eliminaRepetidos(PilaADT<T> pila){ //intentar hacer con una pila
        ArrayList<T> aux = new ArrayList<T>();
        int i;
        T elem;
        
        i = 0;
        while (!pila.isEmpty()){
            elem = pila.pop();
            if (!aux.contains(elem)){
                aux.add(elem);
            }
            
        }
        
        for ( i = aux.size()-1; i >= 0; i-- ){
            pila.push(aux.get(i));
        }
        
    }
    
    public static <T> void quitaElementos(PilaADT<T> pila, int n){
        int i, j, k;
        int tam;
      
        tam = indicaNumElem(pila);
        if ( n < tam)
            for (k = 0; k<n; k++)
                pila.pop(); 
        
        
//      i = 0; aux;
//      while (!pila.isEmpty() && i < n){   
//          aux.push(pila.pop());
//          i++;
//      }
//      if ( i < n ) // si no, regresa los elementos a la pila original
//          copiaPila(aux, p);
            
     
    }
    
    public static void main(String[] args) {
        PilaArreglo<String> pila;
        int resp;
        
        pila = new PilaArreglo<String>();
        pila.push("manzana");
        pila.push("pera");
        pila.push("pera");
        pila.push("fresa");
        pila.push("mandarina");
     
        
        System.out.println("\nPila de frutas:\n"+pila);
        invierteOrden(pila);
        System.out.println("\nPila de frutas:\n"+pila);
        
        resp = indicaNumElem(pila);
        System.out.println("\nN??mero de elementos: "+resp);
        System.out.println("\nPila de frutas:\n"+pila);
        
        eliminaRepetidos(pila);
        System.out.println("\nPila de frutas:\n"+pila);
        
        quitaElementos(pila, 8);
        System.out.println("\nPila de frutas:\n"+pila);
        
        quitaElementos(pila, 3);
        System.out.println("\nPila de frutas:\n"+pila);
    }
    
    
}

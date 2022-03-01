/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pilas_g1;
import java.util.*;
/**
 *
 * @author elenalunapalacio
 */
public class PilaArreglo <T> implements PilaADT<T> {
    
    private T[] pila;
    private int tope;
    private final int MAXIMO = 20;
   
    
    public PilaArreglo(){
        pila = (T[]) new Object[MAXIMO]; //arreglo genérico, casting T
        tope = -1;
    }
    
    @Override
    public boolean isEmpty(){
        return tope == -1;
        // si -1 no está vacío, la pila no está vacía
        // regresa false
        // si está vacío regresa true
    }

    @Override
    public T peek(){
        if (this.isEmpty())
            throw new ColeccionVaciaExcepcion("Pila vacía"); 
        //no es necesario un else
        return pila[tope];
        
    }
    
    public T pop(){
        if(this.isEmpty())
            throw new ColeccionVaciaExcepcion("Pila vacía"); 
        T resultado;
        resultado = pila[tope]; //tope siempre apunta al último
        pila[tope] = null;
        tope--;
        return resultado;
    } 
    
    // no queremos que desde afuera hagan arreglos
    private void expand(){
        T[] nuevo = (T[]) new Object[pila.length * 2]; // no necesariamente es duplicarlo;
        
        for (int i = 0; i <= tope; i++)
            nuevo[i] = pila[i];
        pila = nuevo;
    }
    
    @Override
    public void push(T dato){
        if ( tope == pila.length - 1)
            expand();
        tope++;
        pila[tope] = dato;    
    }
    
    @Override
    public String toString(){
        StringBuilder sB = new StringBuilder();
        for (int i = tope; i >= 0; i--)
            sB.append(pila[i]).append("\n");
        return sB.toString();
    }
    
    @Override
    public void multiPop(int n){
        int i;
        if ( n <= tope)
            for (i = 0; i<= n; i++)
                pop();    
    }
    
    
    
}

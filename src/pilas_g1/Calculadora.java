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
public class Calculadora {
    
    public Calculadora(){
        
    }
    
    public static boolean revisaSintaxis(String entrada){
        int i = 1;
        int pos1, pos2;
        boolean resp;
        ArrayList<Character> operadores;
        
        operadores = new ArrayList<Character>();
        operadores.add('+');
        operadores.add('-');
        operadores.add('*');
        operadores.add('/');
        operadores.add(')');
        
        
        if(entrada.charAt(0)=='/' || entrada.charAt(1)=='*')
            resp = false;
        else
            resp = true;
        while(i < entrada.length()-1 && resp){
            pos1 = entrada.charAt(i);
            pos2 = entrada.charAt(i+1);
            if(operadores.contains(pos1) && operadores.contains(pos2)){
                if (pos2 != '-')
                    resp = false;
            }
         
                    
               
            i++;   
        }
        return false;
    }
    
}

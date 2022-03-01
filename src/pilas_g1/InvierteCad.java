/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_g1;

/**
 *
 * @author elenalunapalacio
 */
public class InvierteCad {
    private String cadenaInicial; //la que se quiere invertir
    private String cadenaInvertida; //resultado de la inversión 
    
    
    public InvierteCad(String cadenaInicial){
        this.cadenaInicial = cadenaInicial;
    }

    public String getCadenaInicial() {
        return cadenaInicial;
    }

    public String getCadenaInvertida() {
        return cadenaInvertida;
    }
    
    
    
    public void realizaInversion(PilaArreglo pila){
        int i, j;
        StringBuilder sb;
        
        
        sb = new StringBuilder();
        
        for (i = 0; i < cadenaInicial.length(); i++){
            pila.push(cadenaInicial.charAt(i));
        }
        for (j = 0; j < cadenaInicial.length(); j++){
            sb.append(pila.pop());
        }
        cadenaInvertida = sb.toString();
    }
}

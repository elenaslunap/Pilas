/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_g1;

/**
 *
 * @author elenalunapalacio
 */
public class RevisorParentesis {
    private String cadena;
    
    public RevisorParentesis(String cadena){
        this.cadena = cadena;
    }
    
    public boolean evaluaParentesis(PilaArreglo pila){
        boolean resp;
        int i;
       
        i = 0;
        resp = true;
        while (i < cadena.length() && resp){
            if(cadena.charAt(i) == '(')
                pila.push('(');
            else
                if (cadena.charAt(i) == ')')
                    if (!pila.isEmpty())
                        pila.pop();
                    else
                        resp = false;
            i++;
        }
      
        if (resp && pila.isEmpty())
            resp = true;
        else
            resp = false;
        return resp;
        
    }
    
    private boolean evaluaLlave(PilaArreglo pila){
        boolean resp;
        int i;
       
        i = 0;
        resp = true;
        while (i < cadena.length() && resp){
            if(cadena.charAt(i) == '{')
                pila.push('{');
            else
                if (cadena.charAt(i) == '}')
                    if (!pila.isEmpty())
                        pila.pop();
                    else
                        resp = false;
            i++;
        }
      
        if (resp && pila.isEmpty())
            resp = true;
        else
            resp = false;
        return resp;
        
    }
    
    
    
    private boolean evaluaCorchete(PilaArreglo pila){
        boolean resp;
        int i;
       
        i = 0;
        resp = true;
        while (i < cadena.length() && resp){
            if(cadena.charAt(i) == '[')
                pila.push('[');
            else
                if (cadena.charAt(i) == ']')
                    if (!pila.isEmpty())
                        pila.pop();
                    else
                        resp = false;
            i++;
        }
      
        if (resp && pila.isEmpty())
            resp = true;
        else
            resp = false;
        return resp;
        
    }
    
    public boolean evaluaParentesis2(PilaArreglo pila1, PilaArreglo pila2, PilaArreglo pila3){
        boolean resp1, resp2, resp3, balance;
        
        resp1 = evaluaParentesis(pila1);
        resp2 = evaluaLlave(pila2);
        resp3 = evaluaCorchete(pila3);
        if ( resp1 && resp2 && resp3 )
            balance = true;
        else
            balance = false;
        return balance;
       
        
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_g1;

/**
 *
 * @author elenalunapalacio
 */
public class EjecuatbleRevisorParentesis {
    
    public static void main(String[] args) {
        PilaArreglo<String> parentesis = new PilaArreglo();
        boolean resp;
        
        String cadena = "(a+b)";
        RevisorParentesis miRevisor = new RevisorParentesis(cadena);
        resp = miRevisor.evaluaParentesis(parentesis);
        if(resp)
            System.out.println("Los paréntesis SI están balanceados");
        else
            System.out.println("Los paréntesis NO están balanceados");
        
        
        cadena = "(a+b";
        RevisorParentesis miRevisor2 = new RevisorParentesis(cadena);
        PilaArreglo<String> parentesis2 = new PilaArreglo();
        resp = miRevisor2.evaluaParentesis(parentesis2);
        if(resp)
            System.out.println("Los paréntesis SI están balanceados");
        else
            System.out.println("Los paréntesis NO están balanceados");
        
        cadena = "a+b)";
        RevisorParentesis miRevisor3 = new RevisorParentesis(cadena);
        PilaArreglo<String> parentesis3 = new PilaArreglo();
        resp = miRevisor3.evaluaParentesis(parentesis3);
        if(resp)
            System.out.println("Los paréntesis SI están balanceados");
        else
            System.out.println("Los paréntesis NO están balanceados");
        
       
        cadena = ")a+b(";
        RevisorParentesis miRevisor4 = new RevisorParentesis(cadena);
        PilaArreglo<String> parentesis4 = new PilaArreglo();
        resp = miRevisor4.evaluaParentesis(parentesis4);
        if(resp)
            System.out.println("Los paréntesis SI están balanceados");
        else
            System.out.println("Los paréntesis NO están balanceados");
        
        
        cadena = "a+b(";
        RevisorParentesis miRevisor5 = new RevisorParentesis(cadena);
        PilaArreglo<String> parentesis5 = new PilaArreglo();
        resp = miRevisor5.evaluaParentesis(parentesis5);
        if(resp)
            System.out.println("Los paréntesis SI están balanceados");
        else
            System.out.println("Los paréntesis NO están balanceados");
        
        
        cadena = ")a+b";
        RevisorParentesis miRevisor6 = new RevisorParentesis(cadena);
        PilaArreglo<String> parentesis6 = new PilaArreglo();
        resp = miRevisor6.evaluaParentesis(parentesis6);
        if(resp)
            System.out.println("Los paréntesis SI están balanceados");
        else
            System.out.println("Los paréntesis NO están balanceados");
        
        System.out.println("_________________________________________");
        
  
        
        
        
    }
}

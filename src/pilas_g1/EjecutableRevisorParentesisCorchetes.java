package pilas_g1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elenalunapalacio
 */
public class EjecutableRevisorParentesisCorchetes {
    
    public static void main(String[] args) {
        PilaArreglo<String> parentesis = new PilaArreglo();
        String cadena = "[{(3+3)}*2/5]+1";
        RevisorParentesis miRevisor = new RevisorParentesis(cadena);
        boolean resp;
        
    }
}

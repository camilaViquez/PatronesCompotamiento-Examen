/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1Memento;

import java.util.Scanner;

/**
 *
 * @author tanzanita
 */
public class Main {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        memento ultimo= new memento();
        careTaker vigilante= new careTaker();
        calculadora calcu = new calculadora(0,0,0,vigilante);
       
        calcu.setVar1(calcu.suma(78,98));
        calcu.ultimaOperacion();
        calcu.savePoint();
        
        calcu.setVar2(calcu.raiz(78));
        calcu.ultimaOperacion();
        calcu.savePoint();
        
        
        calcu.setVar1(calcu.suma(28,12));
        calcu.ultimaOperacion();
        
        
        calcu.setVar3(calcu.resta(calcu.getVar1(),8));
        calcu.deshacerPuntoEspecifico(1);
        
        
        
        
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3Mediator;

/**
 *
 * @author Leonardo Mata
 */
public class motor implements Ipartes {

    @Override
    public void encender() {
        System.out.println("Motor operando");
    }

    @Override
    public void apagar() {
        System.out.println("Motor terminó de operar");
    }

    @Override
    public void realizarOperacion() {
        System.out.println("Motor");
        encender();
        apagar();
        
    }

    public motor() {
    }

   
    
}

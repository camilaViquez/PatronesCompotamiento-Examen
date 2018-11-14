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
public class tambor implements Ipartes {

    @Override
    public void encender() {
        System.out.println("Tambor recibiendo agua");
    }

    @Override
    public void apagar() {
        System.out.println("Tambor ha recibido la cantidad de agua necesaria");
    }

    @Override
    public void realizarOperacion() {
        System.out.println("TAMBOR");
    }

    public tambor() {
    }

   
}

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
public class cicloLavadoJeans implements mediadorLavadora{
    private boton boton;
    private calentador calentador;
    private motor motor;
    private tambor tambor;
    private valvula valvula;
    private sensor sensor;

    public cicloLavadoJeans(boton boton, calentador calentador, motor motor, tambor tambor, valvula valvula, sensor sensor) {
        this.boton = boton;
        this.calentador = calentador;
        this.motor = motor;
        this.tambor = tambor;
        this.valvula = valvula;
        this.sensor = sensor;
    }
    
    
    
    @Override
    public void iniciarCiclo() {
        System.out.println("Iniciando ciclo de lavado ropa Jeans ");
        boton.realizarOperacion();
        valvula.realizarOperacion();
        sensor.realizarOperacion();
        calentador.realizarOperacion();
        motor.realizarOperacion();
        System.out.println("Ciclo de secado y planchado");
        System.out.println("******************ROPA LISTA****************");
      
    }
    
}

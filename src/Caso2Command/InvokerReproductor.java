/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2Command;

/**
 *
 * @author tanzanita
 */
public class InvokerReproductor implements CommandTareas {
    private Reproductor reproductor;
    
    public void serReproductor(Reproductor reproductor){
        this.reproductor = reproductor;
        
    }

    @Override
    public void run() {
        System.out.println("Tarea procesada = Reproductor de canciones" + ", hilo de ejecucion: " + Thread.currentThread().getName());
        if(reproductor != null){
            reproductor.reproducirCancion();
        }try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        } 
    } 

    
}

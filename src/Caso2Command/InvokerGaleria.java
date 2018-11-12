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
public class InvokerGaleria implements CommandTareas{
    private Galeria galeria;
    
    public void setGaleria(Galeria galeria){
        this.galeria = galeria;
    }
    
    @Override
    public void run() {
        System.out.println("Tarea procesada = Abrir galeria" + ", hilo de ejecucion: " + Thread.currentThread().getName());
        if(galeria != null){
            galeria.abrirGaleria();
        }try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        } 
    } 

    
    
}

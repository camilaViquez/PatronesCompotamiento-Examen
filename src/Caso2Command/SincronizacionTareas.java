/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2Command;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author tanzanita
 */
//Clase encargada del manejo y serialización de los hilos que dispara cada tarea
public class SincronizacionTareas {
    private Thread[] hiloTareas;
    private BlockingQueue<CommandTareas> tareas;
    private boolean shutdown;

    public SincronizacionTareas(int numero){
        tareas = new LinkedBlockingQueue<>();
        hiloTareas = new Thread[numero];
        
        for(int i=0; i<numero;i++){
            hiloTareas[i] = new Worker("Hilo creado " + i);
            hiloTareas[i].start();
        }
    }
     public void agregarTarea(CommandTareas tarea){
         try{
             tareas.put(tarea);
         }catch(InterruptedException e){
             Thread.currentThread().interrupt();
         }
     }
     
     public void detenerSerializacion(){
         while(!tareas.isEmpty()){
             try{
                 Thread.sleep(1000);
             }catch(InterruptedException e){
                 e.printStackTrace();
             }
         }
         shutdown = true;
         for(Thread hilo : hiloTareas){
             hilo.interrupt();
         }
     }

    private class Worker extends Thread
    {
        public Worker(String nombre)
        {
            super(nombre);
        }
        public void run()
        {
            while (!shutdown) {
            try {
                CommandTareas tarea = tareas.take();
                tarea.run();

                } catch (InterruptedException e) {
                }
            }
        }
    }  
}

             
    
    
    
    
    
    
    
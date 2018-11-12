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
public class Main {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
    }
    private static void init(){
        //Intancia de los objetos commandConcret y los invoker
        Correo correo = null;
        InvokerCorreo invokerCorreo = new InvokerCorreo();
        
        
        SMS sms = null;
        InvokerSMS invokerSMS = new InvokerSMS();
        
        Reproductor reproductor =  null;
        InvokerReproductor invokerReproductor = new InvokerReproductor();
        
        Galeria galeria = null;
        InvokerGaleria invokerGaleria = new InvokerGaleria();
        
        //Creación de 10 procesos
        SincronizacionTareas cola = new SincronizacionTareas(10);
        
        
        for(int i = 0; i<5; i++){
            correo = new Correo();
            invokerCorreo.setCorreo(correo);
            
            sms = new SMS();
            invokerSMS.setSMS(sms);
            
            reproductor = new Reproductor();
            invokerReproductor.serReproductor(reproductor);
            
            galeria = new Galeria();
            invokerGaleria.setGaleria(galeria);
            
            cola.agregarTarea(invokerCorreo);
            cola.agregarTarea(invokerSMS);
            cola.agregarTarea(invokerReproductor);
            cola.agregarTarea(invokerGaleria); 
        }
        cola.detenerSerializacion();
    }
}

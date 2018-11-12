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
public class InvokerSMS implements CommandTareas{
    private SMS sms;
    
    public void setSMS(SMS sms){
        this.sms = sms;
    }

    @Override
    public void run() {
        System.out.println("Tarea procesada = SMS" + ", hilo de ejecucion: " + Thread.currentThread().getName());
        if(sms != null){
            sms.enviarSMS();
        }try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        } 
    } 

    
}

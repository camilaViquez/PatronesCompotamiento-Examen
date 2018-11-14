/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3Mediator;

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
        boton btn = new boton();
        calentador calentador = new calentador();
        motor motor = new motor();
        sensor sensor = new sensor();
        tambor tambor = new tambor();
        valvula valvula = new valvula();
        
        cicloLavadoAlgodon algodon = new cicloLavadoAlgodon(btn,calentador,motor,tambor,valvula,sensor);
        algodon.iniciarCiclo();
        cicloLavadoSeda seda = new cicloLavadoSeda(btn,calentador,motor,tambor,valvula,sensor);
        seda.iniciarCiclo();
        cicloLavadoJeans jeans = new cicloLavadoJeans(btn,calentador,motor,tambor,valvula,sensor);
        jeans.iniciarCiclo();
    }
    
}

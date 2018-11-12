/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1Memento;

import java.util.Map;
import Caso1Memento.memento;
import java.util.ArrayList;
/**
 *
 * @author Leonardo Mata
 */
public class careTaker {
    private final  ArrayList<memento> savepoints = new ArrayList<memento>();
    
    public boolean guardarMemento(memento mementos)
    {
        savepoints.add(mementos);
        System.out.println("SavePoint registrado");
        
        return true;
    }
    
    public memento getMemento(int identificador)
    {
       return savepoints.get(identificador);
    }

    public careTaker() {
    }
    
}

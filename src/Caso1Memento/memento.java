/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1Memento;

/**
 *
 * @author Leonardo Mata
 */
public class memento {
    private float var1;
    private float var2;
    private float var3;

    public memento(float var1, float var2, float var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    memento() {
       
    }

    public float getVar1() {
        return var1;
    }

    public float getVar2() {
        return var2;
    }

    public float getVar3() {
        return var3;
    }
    
}

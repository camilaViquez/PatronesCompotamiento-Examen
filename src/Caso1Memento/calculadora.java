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
public class calculadora {
    private float var1;
    private float var2;
    private float var3;
    private memento ultimo=new memento();
    private careTaker savePoints;
    
    
    public void setVar1(float v1) {
        this.var1 = v1;
        System.out.println("Actualizando valor a var1, nuevo valor: "+ v1);
    }

    public void setVar2(float v2) {
        this.var2 = v2;
        System.out.println("Actualizando valor a var2, nuevo valor: "+v2);
    }

    public void setVar3(float v3) {
        this.var3 = v3;
        System.out.println("Actualizando valor a var3, nuevo valor: "+v3);
    }
    
    public void deshacerUltimaOperacion()
    {
        System.out.println("Regresando al estado anterior");
        setVar1(ultimo.getVar1());
        setVar2(ultimo.getVar2());
        setVar3(ultimo.getVar3());
  
    }
    public void ultimaOperacion()
    {
        ultimo=new memento(var1,var2,var3);
    }
    public void restablecerValoresInicio()
    {
        System.out.println("Restableciendo valores de inicio");
        var1=0;
        var2=0;
        var3=0;
    }

    public calculadora(float var1, float var2, float var3, careTaker savePoints) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.savePoints = savePoints;
    }
    
    
    public void deshacerPuntoEspecifico(int posicion)
    {
        System.out.println("Restaurando en el savePoint numero: "+posicion);
        memento aux=savePoints.getMemento(posicion-1);
        setVar1(aux.getVar1());
        setVar2(aux.getVar2());
        setVar3(aux.getVar3());
    }

  
    
    public void savePoint()
    {
        System.out.println("Registrando savepoints");
        savePoints.guardarMemento(ultimo);
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
    
    
    public float suma(float x1,float x2)
    {
        System.out.println("Realizando suma ");
        return x1+x2;
    }
    
     public float multiplicacion(float x1,float x2)
    {
        System.out.println("Realizando Multiplicación");
        return x1*x2;
    }
     
      public float resta(float x1,float x2)
    {
        System.out.println("Realizando Resta");
        return x1-x2;
    }
      
       public float division(float x1,float x2)
    {
        System.out.println("Realizando División");
        if(x2==0)
        {
            System.out.println("Error division entre cero");
            return 0;
        }else
        {
        return x1/x2;
        }
    }

       public float raiz(int x1)
       {
           System.out.println("Calculando Raíz ");
           return (float) Math.sqrt(x1);
           
       }

}

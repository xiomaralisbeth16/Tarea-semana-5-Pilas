/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;
import javax.swing.JOptionPane;
/**
 *
 * @author Lisbeth
 */
public class PilaArray {
    int[] PILA;
    int TOPE;
    int MAX;


    public PilaArray()
    {
        this.TOPE = 0;
        this.MAX = 100;
        this.PILA = new int[this.MAX+1];
    }
     
  
    public PilaArray(int MAX)
    {
        this.TOPE = 0;
        this.MAX = MAX;
        this.PILA = new int[this.MAX+1];        
    }
 
    public int GetTOPE() 
    {
        return TOPE;
    }
       
    public void VaciarPila()
    {
        this.TOPE = 0;         
    }
     
    public boolean IsPilaLlena()
    {
        if(this.MAX == this.TOPE)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    public boolean IsPilaVacia()
    {
        if(this.TOPE == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    public void InsertarPila()
    {
        if(this.IsPilaLlena())
        {
            JOptionPane.showMessageDialog(null,"LA PILA ESTA LLENA");
        }
        else
        {
            int ITEM;
 
            ITEM = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL ITEM A AGREGAR"));            
             
            this.TOPE++;
            this.PILA[this.TOPE] = ITEM;
             
            JOptionPane.showMessageDialog(null,"EL ITEM " + ITEM + " SE INSERTO A LA PILA");
        }        
    }
     
    public void EliminarPila()
    {
        if(this.IsPilaVacia())
        {
            JOptionPane.showMessageDialog(null,"LA PILA ESTA VACIA");
        }
        else
        {
            int ITEM = this.PILA[this.TOPE];
            this.TOPE--;
             
            JOptionPane.showMessageDialog(null,"EL ITEM " + ITEM + " SE ELIMINO DE LA PILA");
        }        
    }
     
    public void MostrarPila()
    {
        if(this.IsPilaVacia())
        {
            JOptionPane.showMessageDialog(null,"LA PILA ESTÁ VACIA\n NO HAY DATOS QUE MOSTRAR","MOSTRAR DATOS",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int i;
            String MOSTRAR = "";
             
            for(i=1;i<=this.TOPE;i++)
            {
                MOSTRAR = MOSTRAR + this.PILA[i]+"\n";
            }
            JOptionPane.showMessageDialog(null,"TOTAL ES : "+this.TOPE+"\n"+"LOS DATOS DE LA PILA SON : \n"+MOSTRAR,"MOSTRAR DATOS",JOptionPane.INFORMATION_MESSAGE);
        }
    }    
}


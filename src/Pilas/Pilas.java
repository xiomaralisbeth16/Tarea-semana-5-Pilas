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
public class Pilas {
    public static PilaArray Pila;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int MAX;
 
        MAX = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño de la Pila"));   
        Pila = new PilaArray(MAX);
         
        MenuPila();
    }
     
    public static void MenuPila()
    {
        int Opcion;
         
        do
        {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "**************************\n"+
                    "******Bienvenidos******* \n"+ 
                    "**************************\n"+
                    "**  1. Ingresar Datos   \n"+
                    "**  2. Eliminar Datos   \n"+
                    "**  3. Observar Datos   \n"+
                    "**  4. Vaciar Pila      \n"+
                    "**  5. Salir            \n"+
                    "**************************\n"+
                    "Ingrese la opción [1 - 5]","MENU PILA",JOptionPane.QUESTION_MESSAGE));
             
            switch(Opcion)
            {
                case 1: Pila.InsertarPila();break;
                case 2: Pila.EliminarPila();break;
                case 3: Pila.MostrarPila();break;
                case 4: Pila.VaciarPila();break;
                case 5: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"INGRESE UNA OPCION VALIDA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }
        while(true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 5
    }
}  
    
        
     
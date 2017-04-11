  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author edin
 */
public class Demo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        try{
        int n1, n2,suma;
    n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
    n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));
        
    suma=n1+n2;
   
        int resta = n1-n2;
        int multiplicación= n1*n2;          
        int division =n1/n2;
    JOptionPane.showMessageDialog(null,"La suma es:"+suma); 
    
    JOptionPane.showMessageDialog(null,"La RESTA ES: "+ resta); 
    JOptionPane.showMessageDialog(null,"La Multiplicación es:"+ multiplicación); 
    JOptionPane.showMessageDialog(null,"La Division es:"+division); 
    System.out.println("La suma es:"+suma);
    System.out.println("La RESTA ES:"+ resta);
    System.out.println("La Multiplicación es:"+ multiplicación);
    System.out.println("La Division es:"+division);
    
        }catch (Exception o){
        JOptionPane.showMessageDialog(null,"osito:"+o); 
         System.out.println("osito");
        }}}
    


        

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade002;

import javax.swing.JOptionPane;


public class ATV02 {
        public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        Integer valor1I = Integer.parseInt(valor1);
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
        Integer valor2I = Integer.parseInt(valor2);
        String valor3 = JOptionPane.showInputDialog("Digite o terceiro valor: ");
        Integer valor3I = Integer.parseInt(valor3);
        
         if (valor1I <= valor2I && valor2I <= valor3I)
        {
          JOptionPane.showMessageDialog(null, "A ordem crescente: " + valor1I + ", " + valor2I + ", " + valor3I);
        }
        else if (valor1I <= valor3I && valor3I <= valor2I)
          {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + valor1I + ", " + valor3I + ", " + valor2I);
          }
        else if (valor2I <= valor1I && valor1I <= valor3I)
          {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + valor2I + ", " + valor1I + ", " + valor3I);
          }
        else if (valor2I <= valor3I && valor3I <= valor1I) 
          {
            JOptionPane.showMessageDialog(null, "A ordem crescente: "+ valor2I + ", " + valor3I + ", " + valor1I);
          }
        else if (valor3I <= valor1I && valor1I <= valor2I) 
          {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + valor3I + ", " + valor1I + ", " + valor2I);
          }
        else /* valor3I <= valor2I && valor2I < valor1I */
          {
            JOptionPane.showMessageDialog(null, "A ordem crescente: " + valor3I + ", " + valor2I + ", " + valor1I);
          }
    }
    
}

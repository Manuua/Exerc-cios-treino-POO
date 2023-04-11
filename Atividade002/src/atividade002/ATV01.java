/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade002;

import javax.swing.JOptionPane;

public class ATV01 {

      public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite o valor: ");
        Integer valorI = Integer.parseInt(valor);
        if(valorI % 3 == 0) {
            JOptionPane.showMessageDialog(null, "O número multiplo de 3");
        } else {
            JOptionPane.showMessageDialog(null, "O número não é multiplo de 3");
        }
    }
    
}

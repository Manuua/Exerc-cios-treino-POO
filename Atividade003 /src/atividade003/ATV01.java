/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade003;

import javax.swing.JOptionPane;

public class ATV01 {
            
    public static void main(String[] args) {
        int numberOne = 0, numberTwo = 0;
        String inicio, fim;
        try {
            inicio = JOptionPane.showInputDialog(null, "Digite o 1° número: ");
            numberOne = Integer.parseInt(inicio);
            fim = JOptionPane.showInputDialog(null, "Digite o 2° número: ");
            numberTwo = Integer.parseInt(fim);
            
            System.out.println("O intervalo de números pares é:");
            for (int i = numberOne; i <= numberTwo; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Digite apenas números!");
            System.exit(0);
        }
        

    }

}


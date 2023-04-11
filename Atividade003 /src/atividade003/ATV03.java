/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade003;

import javax.swing.JOptionPane;

public class ATV03 {
       public static void main(String[] args) {
        int n1 = 0;
        String inicio;
        try {
            inicio = JOptionPane.showInputDialog(null, "Digite o 1° número: ", "Intervalo de Primos", 1);
            n1 = Integer.parseInt(inicio);

            System.out.println("O intervalo de números Primos é:");

            for (int i = 2; i <= n1; i++) {
                boolean primo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                    }
                }
                if (primo) {
                    System.out.println(i);
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
            System.exit(0);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade003;

import javax.swing.JOptionPane;

public class ATV02 {
    
    public static void main(String[] args) {
        try {
            int fn1 = 0 , fn2 = 1  , n;
            String msg;

            msg = JOptionPane.showInputDialog(null, "Digite um número: ", "Fibonaci", 1);
            n = Integer.parseInt(msg);
            
            for (int i = 0; i < n ; i++) {
                fn1 = fn1 + fn2;
                fn2 = fn1 - fn2;
                System.out.println(fn1);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
            System.exit(0);
        }

    }
}


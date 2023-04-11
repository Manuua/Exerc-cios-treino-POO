/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade004;

import javax.swing.JOptionPane;

/**
 *
 * @author manoelaandrade
 */
public class ATV08 {
        public static boolean primeNumber(int x) {
        boolean number = true;
        for (int j = 2; j < x; j++) {
            if (x % j == 0) {
                number = false;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        String text = "Esse número não é primo";
        String valor = JOptionPane.showInputDialog(null, "Digite um número:");
        int num = Integer.parseInt(valor);
        if (primeNumber(num)) {
            text = "é primo";
        }
        JOptionPane.showMessageDialog(null, "O número " + num + " " + text, "Número Primo", 1);
    }

}

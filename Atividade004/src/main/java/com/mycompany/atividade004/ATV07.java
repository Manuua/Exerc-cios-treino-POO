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
public class ATV07 {
     public static int fatorial(int x) {
        int resp = 1;
        for (int i = x; i > 0; i--) {
            resp *= i;
        }
        return resp;
    }

    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null, "Digite um número");
        int number, resp;
        number= Integer.parseInt(num);
        resp = fatorial(number);
        JOptionPane.showMessageDialog(null, "O fatorial de " + number + " é: " + resp, "Fatorial", 1);
    }
}

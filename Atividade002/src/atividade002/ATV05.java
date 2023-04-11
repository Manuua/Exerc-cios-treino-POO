/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade002;

import javax.swing.JOptionPane;

public class ATV05 {
        public static void main(String[] args) {
        String nome = "", aux, msg = "";
        int idade = 0;
        nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Plano de Saúde", 1);
        aux = JOptionPane.showInputDialog(null, "Digite sua idade", "Plano de Saúde", 1);
        idade = Integer.parseInt(aux);

        if (idade <= 10) {
            msg = " Você deve pagar 30 reais";
        }
        if (idade > 10 && idade <= 29) {
            msg = " Você deve pagar 60 reais";
        }
        if (idade > 29 && idade <= 45) {
            msg = " Você deve pagar 120 reais";
        }
        if (idade > 45 && idade <= 59) {
            msg = " Você deve pagar 150 reais";
        }
        if (idade > 59 && idade <= 65) {
            msg = " Você deve pagar 250 reais";
        }
        if (idade > 65) {
            msg = " Você deve pagar 400 reais";
        }
        JOptionPane.showMessageDialog(null, msg, "Valor a pagar", 1);
    }
}

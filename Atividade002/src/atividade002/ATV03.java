/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade002;

import javax.swing.JOptionPane;

public class ATV03 {
        public static void main(String[] args) {
        String produto = JOptionPane.showInputDialog("Digite o valor do produto: ");
        Double produtoI = Double.parseDouble(produto);
        

        if (produtoI >= 20) {
            produtoI = produtoI + (produtoI * 0.45);
        } else {
            produtoI = produtoI + (produtoI * 0.30);
        }
        JOptionPane.showMessageDialog(null, "O valor do produto ficou: R$" + produtoI);
    }
    
}

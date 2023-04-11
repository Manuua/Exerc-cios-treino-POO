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
public class ATV06 {
    
    public static void trimestre(int numero) {
        switch(numero){
            case 1:
                JOptionPane.showMessageDialog(null, "O mês é janeiro!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O mês é fevereiro!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O mês é março!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "O número é inválido!");
                break;
        }
    }
    public static void main(String[] args) {
        Integer mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês do primeiro trimestre: "));
        
        trimestre(mes);
        
    }
}

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
public class ATV03 {
    
    public static int calcProduto(int valor1, int valor2) {
        int produto;
        produto = valor1*valor2;
        return produto;
    }
   
    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        int resultado;
        
        resultado = calcProduto(valor1, valor2);
        
        
        JOptionPane.showMessageDialog(null, "O resultado do produto entre os valores é  " + resultado);
    }
}

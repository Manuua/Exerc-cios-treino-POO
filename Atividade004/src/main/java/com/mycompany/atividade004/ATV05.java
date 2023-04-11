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
public class ATV05 {
    
    public static void higherNumber(int numberOne, int numberTwo) {
        if(numberOne > numberTwo){
            JOptionPane.showMessageDialog(null, "O valor 1 é maior que o valor 2");
        } else {
            JOptionPane.showMessageDialog(null, "O valor 2 é maior que o valor 1");
        }
    }
    
    public static void main(String[] args) {
        
        int firstValue = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int secondValue = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        higherNumber(firstValue, secondValue);
        
    }
}

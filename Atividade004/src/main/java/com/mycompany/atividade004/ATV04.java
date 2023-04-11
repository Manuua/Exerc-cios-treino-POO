/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade004;

import static java.lang.Math.PI;
import javax.swing.JOptionPane;

/**
 *
 * @author manoelaandrade
 */
public class ATV04 {
    
    public static Double converteRadiano(double grau) {
        double radiano;
        radiano = grau * (PI/180);
        return radiano;
    }
    
  
    public static void main(String[] args) {
        Double grau = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do grau: "));
        Double resultado = converteRadiano(grau);
        
        JOptionPane.showMessageDialog(null, "O valor do radiano é: " + resultado);
        
    }
}

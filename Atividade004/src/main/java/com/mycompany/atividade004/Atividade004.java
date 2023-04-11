/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade004;

import javax.swing.JOptionPane;

/**
 *
 * @author manoelaandrade
 */
public class Atividade004 {

    public static int doubleCalc( int number){
            int result = number * 2;
            return result;
        }

    public static void main(String[] args) {
        
         String number;
         int numberConverted, finalResult;
         
          number = JOptionPane.showInputDialog("Digite um número: ");
          numberConverted = Integer.parseInt(number);
          
          finalResult= doubleCalc(numberConverted);
          
         JOptionPane.showMessageDialog(null,"O dobro do número digitado é : " + finalResult);  
        
    }
}


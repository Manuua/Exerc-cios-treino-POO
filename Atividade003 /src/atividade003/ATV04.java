/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade003;

import javax.swing.JOptionPane;


public class ATV04 {
        public static void main(String Args[]){
        try {
            Float p1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da P1:"));
            Float p2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da P2:"));
            Float trabalho = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do seu trabalho:"));
            if(p1 >= 11 || p2 >= 11 || trabalho >= 11){
                JOptionPane.showMessageDialog(null, "O número da note deve ser entre 0 e 10");        
                System.exit(0);
            }  
            Double notaFinal = (p1 * 0.35)+(p2 * 0.5)+(trabalho * 0.15);
            JOptionPane.showMessageDialog(null, "A média final do aluno foi de : " + Math.floor(notaFinal));
            
            
        } catch(NumberFormatException NFE){
            JOptionPane.showMessageDialog(null, "As notas devem ser numéricas!");
        }
        
        System.exit(0);
    }
}


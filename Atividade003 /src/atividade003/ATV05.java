/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade003;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ATV05 {
       public static void main(String Args[]){
        try{
            Integer limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior do intervalo: "));
            Integer incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento para ser usado no intervalo: "));
            List<Integer> resultados = new ArrayList<Integer>();
            
            for(int i = 0; i <= limite;){
            resultados.add(i);
                i+=incremento;
            }
            JOptionPane.showMessageDialog(null, resultados);
        } catch(NumberFormatException NFE){
            JOptionPane.showMessageDialog(null, "O dado tem que ser somente um número inteiro!");
        }
        System.exit(0);
    }
            
}

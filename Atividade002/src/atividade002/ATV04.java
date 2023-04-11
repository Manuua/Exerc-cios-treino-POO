/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade002;

import javax.swing.JOptionPane;

public class ATV04 {
        public static void main(String[] args) {
   
        int idade = 0;
        String msg = "", resp = "";

        resp = JOptionPane.showInputDialog(null,"Insira sua idade: ","Classe Eleitoral",1);
        idade =  Integer.parseInt(resp);
        
        if (idade < 16 ) {
            msg = "Não Eleitor!";
        }
        if (idade >= 18 && idade <= 65) {
            msg = "Eleitor Obrigatório!";
        }
        if (idade == 16 || idade == 17 || idade > 65) {
            msg = "Eleitor Facultativo!";
        }
        JOptionPane.showMessageDialog(null, msg,"Classe Eleitoral",1);

    }
}

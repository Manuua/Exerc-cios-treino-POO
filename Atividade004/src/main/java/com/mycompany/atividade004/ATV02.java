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
public class ATV02 {
    
        public static int calcMedia (int n1, int n2, int n3, int n4){
        int r = (n1 + n2 + n3 + n4) /4 ;
        return r;
    }

    public static void main (String[] args){
        int noteOne, noteTwo, noteThree, noteFour, media;
        String n1 = JOptionPane.showInputDialog (null,"Digite a nota 1: ");
        String n2 = JOptionPane.showInputDialog (null,"Digite a nota 2: ");
        String n3 = JOptionPane.showInputDialog (null,"Digite a nota 3: ");
        String n4 = JOptionPane.showInputDialog (null,"Digite a nota 4: ");
        
        noteOne= Integer.parseInt (n1);
        noteTwo= Integer.parseInt (n2);
        noteThree= Integer.parseInt (n3);
        noteFour= Integer.parseInt (n4);

        media = calcMedia(noteOne,noteTwo,noteThree,noteFour); 

        JOptionPane.showMessageDialog( null,"A média da suas notas é "+ media,"MÉDIA", JOptionPane.INFORMATION_MESSAGE); 

    }
}

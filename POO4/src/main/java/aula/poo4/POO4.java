/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.poo4;

import java.util.Scanner;

/**
 *
 * @author manoela.araujo
 */
public class POO4 {

    public static void main(String[] args) {
       double grausC , grausF;
       
       Scanner input = new Scanner (System.in);
        System.out.println("Conversor de Graus");
        System.out.println("Digita a temperatura atual em graus Centígrados: ");
        grausC = input.nextDouble();
        
        grausF = (9 * grausC + 160) /5; 
        
        System.out.print("A temperatura digitada em Fahrenheit é : " + grausF);
    }
}

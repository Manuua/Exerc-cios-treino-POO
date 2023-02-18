/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.poo3;

import java.util.Scanner;

/**
 *
 * @author manoela.araujo
 */
public class POO3 {

    public static void main(String[] args) {
       float numberOne, numberTwo , avarege ;
       
       Scanner input = new Scanner(System.in);
        System.out.println("Vamos calcular média de valores");
        System.out.println("-------------------------------");
        System.out.println("Digite um número :");
        numberOne= input.nextFloat();
        System.out.println("Digite outro número: ");
        numberTwo = input.nextFloat();
        
        avarege = (numberOne+numberTwo ) /2;
        
        System.out.printf("A médias dos valores digitados é %.2f: ", avarege);
        
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.poo2;

import java.util.Scanner;

/**
 *
 * @author manoela.araujo
 */
public class POO2 {

    public static void main(String[] args) {
        
     float salarioMinimo, salarioRecebido, totalDeSalario;
     
     Scanner input = new Scanner(System.in);
     
        System.out.println("Digite o valor de um salário minímo : ");
        salarioMinimo = input.nextFloat();
        System.out.println("Digite seu salário : ");
        salarioRecebido = input.nextFloat();
        
        totalDeSalario = (salarioRecebido/ salarioMinimo);
        
        System.out.println("*********Qt de salário minímo**********");
        System.out.printf("A quantidade de salários minímos que você recebe é"
                + " %.1f " , totalDeSalario );
        
     
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.poo;

import java.util.Scanner;

/**
 *
 * @author manoela.araujo
 */
public class POO {

    public static void main(String[] args) {
    
        float valor, total;
        String produto;
        
        Scanner input= new Scanner(System.in);
        System.out.println("Digite o nome do produto : ");
        produto= input.next();
        System.out.println("Digite o valor do produto : ");
        
        valor= input.nextFloat();
        total= valor -(valor* 9/100);
        
        System.out.printf("Produto " + produto);
        System.out.printf(" Total com desconot %.2f ", total);
        
    }
}

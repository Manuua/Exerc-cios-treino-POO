/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula.poo5;

import java.util.Scanner;

/**
 *
 * @author manoela.araujo
 */
public class POO5 {

    public static void main(String[] args) {
        
        float volume, altura;
        
        System.out.println("Vamos calcular volume da lata de óleo");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura da lata: ");
        altura= input.nextFloat();
        
        volume = (float) (3.14159 * Math. sqrt(2) * altura);
        
        System.out.printf("O volume da lata é : " + volume);
        
    }
}

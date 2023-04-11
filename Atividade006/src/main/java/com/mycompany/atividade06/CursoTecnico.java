/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade06;

import javax.swing.JOptionPane;

/**
 *
 * @author manoelaandrade
 */
public class CursoTecnico extends CursoSuperior{
    
     private double n1, n2, n3;

    public CursoTecnico(double n1, double n2, double n3) {
        super(0, 0, 0);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double calcularMedia() {
        return (n1 + n2 * 2 + n3 * 2) / 5;
    }
}
       


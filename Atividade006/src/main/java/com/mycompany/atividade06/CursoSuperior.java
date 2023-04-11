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
public class CursoSuperior {

    private double n1, n2, n3;

    public CursoSuperior(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double calcularMedia() {
        return (n1 * 0.35 + n2 * 0.5 + n3 * 0.15);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade06;

import javax.swing.JOptionPane;

/**
 *
 * @author manoelaandrade
 */
public class Atividade06 {

    public static void main(String[] args) {
        // solicita as notas do curso superior
        double notaP1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da P1:"));
        double notaP2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da P2:"));
        double notaTrabalhos = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota dos trabalhos:"));

        // cria objeto do curso superior e exibe a média
        CursoSuperior cursoSuperior = new CursoSuperior(notaP1, notaP2, notaTrabalhos);
        JOptionPane.showMessageDialog(null, "Média do curso superior: " + String.format("%.1f", cursoSuperior.calcularMedia()));

        // solicita as notas do curso técnico
        double notaTrimestre1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 1º trimestre:"));
        double notaTrimestre2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 2º trimestre:"));
        double notaTrimestre3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do 3º trimestre:"));

        // cria objeto do curso técnico e exibe a média
        CursoTecnico cursoTecnico = new CursoTecnico(notaTrimestre1, notaTrimestre2, notaTrimestre3);
        JOptionPane.showMessageDialog(null, "Média do curso técnico: " + String.format("%.1f", cursoTecnico.calcularMedia()));
    }
  
}

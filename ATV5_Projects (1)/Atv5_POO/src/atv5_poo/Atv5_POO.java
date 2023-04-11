package atv5_poo;

import javax.swing.JOptionPane;

public class Atv5_POO {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        int base = Integer.parseInt(JOptionPane.showInputDialog("Coloque a base do trinângulo: "));
        triangulo.setBase(base);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Coloque a altura do trinângulo: "));
        triangulo.setAltura(altura);
        
        triangulo.calculaArea(); 
    }
    
}

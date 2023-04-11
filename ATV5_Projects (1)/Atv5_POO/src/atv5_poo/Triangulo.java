package atv5_poo;

import javax.swing.JOptionPane;

public class Triangulo {
    public int base;
    public int altura;
    public int area;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public void calculaArea() {
        this.area = (this.base * this.altura )/2;
        JOptionPane.showMessageDialog(null, "A área do triangulo é: " + this.area + " cm².");
    }
}

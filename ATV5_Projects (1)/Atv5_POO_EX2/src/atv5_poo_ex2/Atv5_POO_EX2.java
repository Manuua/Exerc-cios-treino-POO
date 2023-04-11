package atv5_poo_ex2;

import javax.swing.JOptionPane;

public class Atv5_POO_EX2 {

    public static void main(String[] args) {
        int a, b, c;
        Equacao eq = new Equacao();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c:"));
        eq.lerValores(a, b, c);
        JOptionPane.showMessageDialog(null, eq.calcRaiz(), "Equação", 1);
    }
    
}

package atv5_poo_ex2;

import javax.swing.JOptionPane;

public class Equacao {
    int a, b, c;

    public void lerValores(int A, int B, int C) {
        a = A;
        b = B;
        c = C;
    }

    public String calcRaiz() {
        double delta = 0, r1 = 0, r2 = 0;
        String msg = "";
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta == 0) {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            msg = "Os valores de R1 e R2 são iguais: " + r1 + "," + r2;
        } else if (delta < 0) {
            msg = "Não há raizes reais";
        } else if (delta > 0) {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            msg = "Os valores de R1 e R2 são: " + r1 + "," + r2;
        }
        return msg;
    }

    Equacao() {
        a = 0;
        b = 0;
        c = 0;
    }
}

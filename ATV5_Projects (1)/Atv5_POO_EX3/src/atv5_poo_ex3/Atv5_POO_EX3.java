package atv5_poo_ex3;

public class Atv5_POO_EX3 {

    public static void main(String[] args) {
        Pessoa isaac = new Pessoa();
        Pessoa einsten = new Pessoa();
        
        isaac.nome = "Isaac Newton";
        isaac.ajustaDataNasc(14, 03, 1879);
        
        einsten.nome = "Albert Einsten";
        einsten.ajustaDataNasc(04, 01, 1643);
        
        isaac.calculaIdade(2023);
        einsten.calculaIdade(2023);
        
        System.out.println("A idade de " + isaac.informaNome() + " atualmente seria " + isaac.informaIdade() + " anos.");
        System.out.println("A idade de " + einsten.informaNome() + " atualmente seria " + einsten.informaIdade() + " anos.");
    }
    
}

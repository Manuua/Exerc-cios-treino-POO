package atv5_poo_ex3;

public class Pessoa {
    int idade, dia, mes, anoNasc, anoAtual;
    String nome;
    
    public void calculaIdade(int anoNasc) {
        this.anoAtual = anoNasc;
        this.idade = this.anoAtual - this.anoNasc;
    }
    
    public int informaIdade(){
        return this.idade;
    }
    
    public String informaNome() {
        return nome;
    }
    
    public void ajustaDataNasc(int dia, int mes, int anoNasc) {
        this.dia = dia;
        this.mes = mes;
        this.anoNasc = anoNasc;
        
    }
   
}

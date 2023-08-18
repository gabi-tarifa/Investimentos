import java.util.ArrayList;
import java.util.Random;

public class Investidor {
    private String nome, cpf;
    private double salarioLiquido;
    private ArrayList<ItemInvestimento> investimentos = new ArrayList<>();
    private int valorAcumulado;

    public Investidor(String nome, String cpf, double valorInvestido, double salarioLiquido) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioLiquido = salarioLiquido;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public double getSalarioLiquido() {
        return salarioLiquido;
    }
    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
    public void arquivoAA(){
        Random numeroAleatorio = new Random();
        System.out.println(investimentos.get(numeroAleatorio.nextInt(investimentos.size())));
    }
    
}

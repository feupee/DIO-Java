import java.util.Date;

public class Funcionario extends Pessoa {
    private double salarioFixo;
    private String enderecoCompleto;
    private String numeroCarteiraTrabalho;

    // Construtor
    public Funcionario(String nome, String cpf, String enderecoCompleto, String numeroCarteiraTrabalho, Date dataNascimento, double salarioFixo) {
        super(nome, cpf, enderecoCompleto, dataNascimento);
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
        this.salarioFixo = salarioFixo;
        this.enderecoCompleto = enderecoCompleto;
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
    }

    // Getters and Setters
    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public String getNumeroCarteiraTrabalho() {
        return numeroCarteiraTrabalho;
    }

    public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
    }
    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

}
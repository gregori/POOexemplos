// Conta.java
// Classe Conta que contém uma variável de instância nome
// e métodos para configurar e obter seu valor

public class Conta
{
    private String nome; // variável de instância
    private double saldo; // variável de instância

    // o construtor recebe dois parâmetros
    public Conta(String nome, double saldo) // nome do construtor é o nome da classe
    {
        this.nome = nome;

        // valida que saldo é maior que 0.0; se não for
        // a variável de instância mantém seu valor inicial padrão
        // que é 0.0
        if (saldo > 0.0) { // se o saldo for válido
            this.saldo = saldo; // atribui o valor da variável
        }
    }

    // método que deposita apenas uma quantia válida no saldo
    public void deposita(double quantiaDeposito)
    {
        if (quantiaDeposito > 0.0) { // se quantiaDeposito válido
            saldo = saldo + quantiaDeposito; // adiciona ao saldo
        }
    }

    public void saca(double quantiaSaque)
    {
        if (quantiaSaque > saldo) {
            System.out.println("Valor do débito excedeu o saldo da conta.");
        } else {
            saldo = saldo - quantiaSaque;
        }
    }

    // método para retornar o saldo da conta
    public double getSaldo()
    {
        return saldo;
    }

    // método para definir o nome do objeto
    public void setNome(String nome)
    {
        this.nome = nome; // armazena o nome
    }

    // método para reculerar o nome do objeto
    public String getNome()
    {
        return nome;
    }
} // fim da Conta
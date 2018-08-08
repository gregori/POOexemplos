// Conta.java
// Classe Conta que contém uma variável de instância nome
// e métodos para configurar e obter seu valor

public class Conta
{
    private String nome; // variável de instância

    // o construtor inicializa nome com o nome do parâmetro
    public Conta(String nome) // nome do construtor é o nome da classe
    {
        this.nome = nome;
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
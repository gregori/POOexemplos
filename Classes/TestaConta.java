// TestaConta.java
// Cria e manipula um objeto de Conta
import java.util.Scanner;

public class TestaConta 
{
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para obter dados do usuário
        Scanner entrada = new Scanner(System.in);
        
        // cria um objeto Conta e atribui a minhaConta
        Conta minhaConta = new Conta();

        // exibe o valor inicial do nome (null)
        System.out.printf("Nome inicial é: %s%n%n", minhaConta.getNome());

        // Solicita e lê o nome
        System.out.print("Entre o nome: ");
        String nome = entrada.nextLine(); // lê uma linha de texto
        minhaConta.setNome(nome); // insere nome em minhaConta
        System.out.println(); // imprime uma linha em branco

        // exibe o nome armazenado em minhaConta
        System.out.printf("O nome no objeto minhaConta é: %s%n", minhaConta.getNome());
    }
}
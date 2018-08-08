// TestaConta.java
// Cria e manipula um objeto de Conta
import java.util.Scanner;

public class TestaConta 
{
    public static void main(String[] args) 
    {
        // Cria um objeto Scanner para obter dados do usuário
        Scanner entrada = new Scanner(System.in);
        
        // cria dois objetos de Conta
        Conta conta1 = new Conta("João da Silva");
        Conta conta2 = new Conta("Maria de Souza");

        // exibe o valor inicial do nome para cada conta
        System.out.printf("O nome da conta1 é: %s%n%n", conta1.getNome());
        System.out.printf("O nome da conta2 é: %s%n%n", cont21.getNome());

        
    }
}
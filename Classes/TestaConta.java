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
        Conta conta1 = new Conta("João da Silva", 50.0);
        Conta conta2 = new Conta("Maria de Souza", -7.53);

        // exibe o saldo inicial de cada objeto
        System.out.printf("O saldo de %s é: $%.2f %n", 
            conta1.getNome(), conta1.getSaldo());
        System.out.printf("O saldo de %s é: $%.2f %n", 
            conta2.getNome(), conta2.getSaldo());
        
        // prompt
        System.out.print("Entre quantia de depósito para conta1: "); 
        double quantiaDeposito = entrada.nextDouble(); // obtém entrada do usuário
        System.out.printf("%nadicionando %.2f ao saldo da conta1%n%n",
            quantiaDeposito);
        conta1.deposita(quantiaDeposito); // adiciona o saldo à conta1

        // exibe os saldos
        System.out.printf("O saldo de %s é: $%.2f %n", 
            conta1.getNome(), conta1.getSaldo());
        System.out.printf("O saldo de %s é: $%.2f %n", 
            conta2.getNome(), conta2.getSaldo());

        System.out.print("Entre quantia de depósito para conta2: "); 
        quantiaDeposito = entrada.nextDouble(); // obtém entrada do usuário
        System.out.printf("%nadicionando %.2f ao saldo da conta2%n%n",
            quantiaDeposito);
        conta2.deposita(quantiaDeposito); // adiciona o saldo à conta2

        // exibe os saldos
        System.out.printf("O saldo de %s é: $%.2f %n", 
            conta1.getNome(), conta1.getSaldo());
        System.out.printf("O saldo de %s é: $%.2f %n", 
            conta2.getNome(), conta2.getSaldo());

        System.out.print("Entre quantia de saque para conta1: "); 
        double quantiaSaque = entrada.nextDouble(); // obtém entrada do usuário
        System.out.printf("%nsacando %.2f da conta1%n%n",
            quantiaSaque);
        conta1.saca(quantiaSaque); // saca da conta1

        // exibe os saldos
        System.out.printf("O saldo de %s é: $%.2f %n", 
            conta1.getNome(), conta1.getSaldo());
        System.out.printf("O saldo de %s é: $%.2f %n", 
            conta2.getNome(), conta2.getSaldo());
    }
}

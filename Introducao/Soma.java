// Soma.java
// Programa de adição que exibe a soma de dois números
import java.util.Scanner; // classe para leitura da entrada padrão

public class Soma
{
    public static void main(String[] args)
    {
        // cria um objeto de Scanner para obter a entrada da linha de comando
        Scanner entrada = new Scanner(System.in);

        int numero1; // primeiro número a adicionar
        int numero2; // segundo número a adicionar
        int soma; // para armazenar a soma dos dois números
        
        System.out.print("Entre o primeiro número: ");
        numero1 = entrada.nextInt(); // lê o número fornecido pelo usuário

        System.out.print("Entre o segundo número: ");
        numero2 = entrada.nextInt(); // lê o número fornecido pelo usuário

        soma = numero1 + numero2;
        
        System.out.printf("A soma %d + %d é %d\n", numero1, numero2, soma);
    } // fim do main
} // fim da classe soma
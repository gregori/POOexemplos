// Compara.java
// Compara inteiros utilizando instruções if, operadores
// relacionais e operadores de igualdade
import java.util.Scanner; // classe para leitura da entrada padrão

public class Compara
{
    public static void main(String[] args)
    {
        // cria um objeto de Scanner para obter a entrada da linha de comando
        Scanner entrada = new Scanner(System.in);

        int numero1; // primeiro número a comparar
        int numero2; // segundo número a comparar

        System.out.print("Entre o primeiro número: ");
        numero1 = entrada.nextInt(); // lê o número fornecido pelo usuário

        System.out.print("Entre o segundo número: ");
        numero2 = entrada.nextInt(); // lê o número fornecido pelo usuário

        if (numero1 == numero2) {
            System.out.printf("%d == %d\n", numero1, numero2);
        }

        if (numero1 != numero2) {
            System.out.printf("%d != %d\n", numero1, numero2);
        }
            
        if (numero1 < numero2) {
            System.out.printf("%d < %d\n", numero1, numero2);
        }
            
        if (numero1 > numero2) {
            System.out.printf("%d > %d\n", numero1, numero2);
        }
            
        if (numero1 <= numero2) {
            System.out.printf("%d <= %d\n", numero1, numero2);
        }
            
        if (numero1 >= numero2) {
            System.out.printf("%d >= %d\n", numero1, numero2);
        }
    } // fim do método main
} // fim da classe Compara
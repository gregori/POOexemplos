import java.util.Scanner;

public class TestaFrequenciaCardiaca
{
    private static void main(String[] args) {
        // Cria um objeto Scanner para obter dados do usuário
        Scanner entrada = new Scanner(System.in);

        FrequenciaCardiaca fc;

        String nome;
        String sobrenome;
        int diaNasc;
        int mesNasc;
        int anoNasc;
        int diaHoje = 15;
        int mesHoje = 8;
        int anoHoje = 2018;

        System.out.print("Entre o nome: ");
        nome = entrada.nextLine();
        System.out.print("Entre o sobrenome: ");
        sobrenome = entrada.nextLine();
        System.out.print("Entre o dia do nascimento: ");
        diaNasc = entrada.nextInt();
        System.out.print("Entre o mes do nascimento: ");
        mesNasc = entrada.nextInt();
        System.out.print("Entre o ano do nascimento: ");
        anoNasc = entrada.nextInt();

        fc = new FrequenciaCardiaca(nome, sobrenome, 
                diaNasc, mesNasc, anoNasc, 
                diaHoje, mesHoje, anoHoje);

        
    }
}
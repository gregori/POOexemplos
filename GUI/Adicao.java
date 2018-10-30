import javax.swing.JOptionPane;

/**
 * Adicao
 */
public class Adicao {

    public static void main(String[] args) {

        // Obtem valores através de diálogos JOptionPane
        String primeiroNumero = 
            JOptionPane.showInputDialog("Entre o primeiro inteiro");
        String segundoNumero = 
            JOptionPane.showInputDialog("Entre o segundo inteiro");

        // Converte string em int
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int soma = numero1 + numero2;

        // Exibe o resultado em uma mensagem JOptionPane
        JOptionPane.showMessageDialog(null, "A soma é " + soma, "Soma de dois inteiros",
            JOptionPane.PLAIN_MESSAGE);
    }
}
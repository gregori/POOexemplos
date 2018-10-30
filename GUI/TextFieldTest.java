import javax.swing.JFrame;

/**
 * TextFieldTest
 */
public class TextFieldTest {

    public static void main(String[] args) {
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        // configura a janela para sair do programa ao ser fechada
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350, 120);
        textFieldFrame.setVisible(true);

    }
}
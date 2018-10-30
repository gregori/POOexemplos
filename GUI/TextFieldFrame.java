import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * TextFieldFrame
 */
public class TextFieldFrame extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public TextFieldFrame() {
        super("Teste do JTextField e JPasswordField");
        setLayout(new FlowLayout());

        // cria campo texto com 10 colunas
        textField1 = new JTextField(10);
        add(textField1); // adiciona o campo ao JFrame

        // cria campo texto com texto padrão
        textField2 = new JTextField("Entre texto aqui");
        add(textField2); // adiciona o campo ao JFrame

        // cria campo com texto padrão e 21 colunas
        textField3 = new JTextField("Texto não editável", 21);
        textField3.setEditable(false); // desativa edição
        add(textField3); // adiciona o campo ao JFrame

        // cria campo de senha com texto padrão
        passwordField = new JPasswordField("Texto escondido");
        add(passwordField);

        // registro das rotinas de tratamento de evento
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);

    }

    // classe interna para tratamento de eventos
    private class TextFieldHandler implements ActionListener {
        // processa eventos dos campos texto
        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";

            // usuário pressionou enter no textField1
            if (event.getSource() == textField1) {
                string = String.format("textField1: %s", event.getActionCommand());
            }
            // usuário pressionou enter no textField2
            else if (event.getSource() == textField2) {
                string = String.format("textField2: %s", event.getActionCommand());
            }
            // usuário pressionou enter no textField3
            else if (event.getSource() == textField3) {
                string = String.format("textField4: %s", event.getActionCommand());
            }
            // usuário pressionou enter no passwordField
            else if (event.getSource() == passwordField) {
                string = String.format("passwordField: %s", event.getActionCommand());
            }

            // exibe o conteúdo do campo texto
            JOptionPane.showMessageDialog(null, string);

        }
    }
    
}
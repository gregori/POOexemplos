import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * ButtonFrame
 */
public class ButtonFrame extends JFrame {
    private final JButton botaoComum;
    private final JButton botaoComIcones;

    public ButtonFrame() {
        super("Testando botões");
        setLayout(new FlowLayout());

        botaoComum = new JButton("Botão Simples"); // botão com texto
        add(botaoComum);

        // cria objetos para os ícones
        Icon bug1 = new ImageIcon(getClass().getResource("bug1.GIF"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.GIF"));
        // configura botão com ícone
        botaoComIcones = new JButton("Botão com ícone", bug1);
        botaoComIcones.setRolloverIcon(bug2); // configura imagem de rollover 
        add(botaoComIcones);

        // cria novo ButtonHandler de tratamento para tratamento de evento de botão
        ButtonHandler handler = new ButtonHandler();
        botaoComIcones.addActionListener(handler);
        botaoComum.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
        // trata o evento do botão
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, 
                String.format("Você apertou: %s", event.getActionCommand()));
        }
    }
    
}
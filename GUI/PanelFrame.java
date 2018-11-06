import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * PanelFrame
 */
public class PanelFrame extends JFrame {
    private final JPanel painelDeBotoes;  // painel para armazenar botões
    private final JButton[] botoes;

    public PanelFrame() {
        super("Painel Demo");
        botoes = new JButton[5];
        painelDeBotoes = new JPanel();
        painelDeBotoes.setLayout(new GridLayout(1, botoes.length));

        // cria e adiciona botões
        for (int i = 0; i < botoes.length; i++) {
            botoes[i] = new JButton("Botao " + (i + 1));
            painelDeBotoes.add(botoes[i]); // adiciona botao ao painel
        }
        add(painelDeBotoes, BorderLayout.SOUTH);
    }

    
}
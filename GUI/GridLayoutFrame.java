import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GridLayoutFrame
 */
public class GridLayoutFrame extends JFrame implements ActionListener {
    private final JButton[] botoes; // array de botoes
    private static final String[] nomes = 
        {"um", "dois", "tres", "quatro", "cinco", "seis" };
    private boolean inverte = true;
    private final Container conteiner; // conteiner do frame
    private final GridLayout gridLayout1; // primeiro gridlayout
    private final GridLayout gridLayout2; // segundo gridlayout

    public GridLayoutFrame() {
        super("Demo do GridLayout");

        gridLayout1 = new GridLayout(2, 3, 5, 5); // 2 linhas por 3 colunas , lacunas de 5
        gridLayout2 = new GridLayout(3, 2); // 3 linhas por 2 colunas, nenhuma lacuna
        conteiner = getContentPane();
        setLayout(gridLayout1);
        botoes = new JButton[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            botoes[i] = new JButton(nomes[i]);
            botoes[i].addActionListener(this); // registra o ouvinte
            add(botoes[i]);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (inverte) // define leioute com base nos botões de alternação
            conteiner.setLayout(gridLayout2);
        else
            conteiner.setLayout(gridLayout1);

        inverte = !inverte;
        conteiner.validate(); // refaz o leiaute do conteiner
    }
    
}
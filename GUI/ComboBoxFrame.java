import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ComboBoxFrame
 */
public class ComboBoxFrame extends JFrame {
    private final JComboBox<String> comboBox;
    private final JLabel label;

    private static final String[] nomes = 
        {"bug1.GIF", "bug2.GIF", "travelbug.gif", "buganim.gif"};
    
    private final Icon[] icones = {
        new ImageIcon(getClass().getResource(nomes[0])),
        new ImageIcon(getClass().getResource(nomes[1])),
        new ImageIcon(getClass().getResource(nomes[2])),
        new ImageIcon(getClass().getResource(nomes[3]))
    };

    public ComboBoxFrame() {
        super("Testando JComboBox");
        setLayout(new FlowLayout());

        comboBox = new JComboBox<>(nomes); // configura o combobox
        comboBox.setMaximumRowCount(3); // exibe no máximo 3 linhas

        comboBox.addItemListener(
            new ItemListener(){ // classe interna anônima
                // trata eventos JComboBox
                @Override
                public void itemStateChanged(ItemEvent e) {
                    // determina se o item está selecionado
                    if (e.getStateChange() == ItemEvent.SELECTED)
                        label.setIcon(icones[
                            comboBox.getSelectedIndex() // adiciona o ícone selecionado ao label
                        ]);
                }
            }
        );
        add(comboBox);
        label = new JLabel(icones[0]);
        add(label);

    }
    
}
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * CheckBoxFrame
 */
public class CheckBoxFrame extends JFrame {

    private final JTextField textField;
    private final JCheckBox checkBoxNegrito;
    private final JCheckBox checkBoxItalico;

    public CheckBoxFrame() {
        super("Teste de Checkbox");
        setLayout(new FlowLayout());

        // Configura o campo texto e a fonte dele
        textField = new JTextField("Perceba como o estilo da fonte muda", 23);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);

        checkBoxNegrito = new JCheckBox("Negrito"); // checkbox para negrito
        checkBoxItalico = new JCheckBox("Itálico"); // checkbox para itálico
        add(checkBoxNegrito);
        add(checkBoxItalico);

        // registro dos listeners
        CheckBoxHandler handler = new CheckBoxHandler();
        checkBoxNegrito.addItemListener(handler);
        checkBoxItalico.addItemListener(handler);

    }

    private class CheckBoxHandler implements ItemListener {
        // responde aos eventos de caixa de seleção
        @Override
        public void itemStateChanged(ItemEvent event) {
            Font fonte = null;

            // determina quais chexkboxes estão marcadas e cria fonte
            if (checkBoxNegrito.isSelected() && checkBoxItalico.isSelected())
                fonte = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (checkBoxNegrito.isSelected())
                fonte = new Font("Serif", Font.BOLD, 14);
            else if (checkBoxItalico.isSelected())
                fonte = new Font("Serif", Font.ITALIC, 14);
            else
                fonte = new Font("Serif", Font.PLAIN, 14);

            textField.setFont(fonte);
        }


    }
}
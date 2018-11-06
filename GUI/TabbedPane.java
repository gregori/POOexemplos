import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

/**
 * TabbedPanel
 */
public class TabbedPane extends JFrame {
    public TabbedPane() {
        super("Demo JTabbedPane");

        JTabbedPane tabbedPane = new JTabbedPane();

        // configura um painel e adiciona ao painel com abas
        JLabel label1 = new JLabel("painel um", SwingConstants.CENTER);
        JPanel painel1 = new JPanel();
        painel1.add(label1);
        tabbedPane.addTab("Aba um", null, painel1, "Primeirp Painel");

        // configura o painel2 e adiciona ao painel com abas
        JLabel label2 = new JLabel("painel dois", SwingConstants.CENTER);
        JPanel painel2 = new JPanel();
        painel2.setBackground(Color.YELLOW);
        painel2.add(label2);
        tabbedPane.addTab("Aba dois", null, painel2, "Segundo Painel");

        // configura o painel3 e adiciona ao painel com abas
        JLabel label3 = new JLabel("painel três");
        JPanel painel3 = new JPanel();
        painel3.setLayout(new BorderLayout());
        painel3.add(new JButton("Norte"), BorderLayout.NORTH);
        painel3.add(new JButton("Oeste"), BorderLayout.WEST);
        painel3.add(new JButton("Leste"), BorderLayout.EAST);
        painel3.add(new JButton("Sul"), BorderLayout.SOUTH);
        painel3.add(label3, BorderLayout.CENTER);
        tabbedPane.addTab("Aba três", null, painel3, "Terceiro Painel");

        add(tabbedPane);
    }
    
}
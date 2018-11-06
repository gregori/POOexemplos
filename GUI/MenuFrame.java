import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.lang.model.util.ElementScanner6;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;


/**
 * MenuFrame
 */
public class MenuFrame extends JFrame {
    private final Color[] cores =
        {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};
    private final JRadioButtonMenuItem[] itensCores; // itens do menu cores
    private final JRadioButtonMenuItem[] fontes; // itens do menu fontes
    private final JCheckBoxMenuItem[] estilos; // itens do menu estilo de fonte
    private final JLabel label; // exibe o texto de exemplo
    private final ButtonGroup grupoFontes; // itens do menu fonte
    private final ButtonGroup grupoCores; // itens do menu cores
    private int estilo; // criar estilos de fontes

    public MenuFrame() {
        super("Usando Menus");

        JMenu menuArquivo = new JMenu("Arquivo"); // cria o menu de arquivo
        menuArquivo.setMnemonic('A'); // configura o mnemônico como A

        // Cria item de menu Sobre...
        JMenuItem itemSobre = new JMenuItem("Sobre...");
        itemSobre.setMnemonic('S'); // configura o mnemônico com S
        menuArquivo.add(itemSobre); // adiciona "sobre" ao menu arquivo
        itemSobre.addActionListener(
            new ActionListener(){ // classe interna anônima
                // exibe uma mensagem quando o usuário seleciona Sobre..
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(MenuFrame.this, 
                    "Este é um exemplo\ndo uso de menus",
                    "Sobre", JOptionPane.PLAIN_MESSAGE);
                }
            }
        );

        JMenuItem itemSair = new JMenuItem("Sair"); // cria o item sair
        itemSair.setMnemonic('r');
        menuArquivo.addActionListener(
            new ActionListener(){ // classe interna anônima
                // termina o programa quando o usuário clica em sair
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0); // encerra o programa
                }
            }
        );

        JMenuBar menu = new JMenuBar(); // cria a barra de menus
        setJMenuBar(menu); // adiciona o menu ao programa
        menu.add(menuArquivo); // adiciona o menu Arquivo à barra de menus

        JMenu menuFormato = new JMenu("Formato"); // cria o menu formato
        menuFormato.setMnemonic('F'); // configura o mnemonico como F

        // cores de string
        String[] nomesDeCores = { "Preto", "Azul", "Vermelho", "Verde"};

        JMenu menuCor = new JMenu("Cor"); // cria o menu cor
        menuCor.setMnemonic('C');

        // cria itens de menu de botão de rádio para cores
        itensCores = new JRadioButtonMenuItem[nomesDeCores.length];
        grupoCores = new ButtonGroup(); // gerencia cores
        TrataItens trataItens = new TrataItens(); // gerenciamento de cores

        // cria itens do menu cor
        for (int i = 0; i < nomesDeCores.length; i++) {
            itensCores[i] = new JRadioButtonMenuItem(nomesDeCores[i]); // cria item
            menuCor.add(itensCores[i]); // adiciona item ao menu
            grupoCores.add(itensCores[i]); // adiciona ao grupo
            itensCores[i].addActionListener(trataItens);
        }

        itensCores[0].setSelected(true); // seleciona o primeiro item 
        menuFormato.add(menuCor); // adiciona um menu cores
        menuFormato.addSeparator();; // adiciona um separador

        // array com nomes de fonte
        String[] nomesDeFonte = { "Serif", "Monospaced", "SansSerif" };
        JMenu menuFonte = new JMenu("Fonte"); // cria o menu font
        menuFonte.setMnemonic('t');

        // cria itens para nomes de fonte
        fontes = new JRadioButtonMenuItem[nomesDeFonte.length];
        grupoFontes = new ButtonGroup(); // gerencia nomes das fontes

        // criar itens de fonte com botôes de opção
        for (int i = 0; i < fontes.length; i++) {
            fontes[i] = new JRadioButtonMenuItem(nomesDeFonte[i]);
            menuFonte.add(fontes[i]);
            grupoFontes.add(fontes[i]);
            fontes[i].addActionListener(trataItens); // adiciona rotina de tratamento
        }

        fontes[0].setSelected(true); // seleciona o primeiro item do menu fonte
        menuFonte.addSeparator();

        String[] nomesDeEstilo = { "Bold", "Italic" }; // nomes dos estilos
        estilos = new JCheckBoxMenuItem[nomesDeEstilo.length];
        TrataEstilos trataEstilos = new TrataEstilos(); // rotina de tratamento de estilo

        // cria itens do menu estilo com caixas de seleção
        for (int i = 0; i < nomesDeEstilo.length; i++) {
            estilos[i] = new JCheckBoxMenuItem(nomesDeEstilo[i]); 
            menuFonte.add(estilos[i]);
            estilos[i].addItemListener(trataEstilos);
        }

        menuFormato.add(menuFonte); // adiciona menu fonte ao menu formato
        menu.add(menuFormato); // adiciona menu formato à barra de menus

        // configura label para exibir texto
        label = new JLabel("Texto exemplo", SwingConstants.CENTER);
        label.setForeground(cores[0]);
        label.setFont(new Font("Serif", Font.PLAIN, 72));

        getContentPane().setBackground(Color.CYAN); // configura o fundo
        add(label, BorderLayout.CENTER);

    } // fim do construtor

    // classe interna para tratar eventos os itens de menu
    private class TrataItens implements ActionListener {
        // processa seleções de cor e fonte
        @Override
        public void actionPerformed(ActionEvent evento) {
            // processa seleção de cor
            for (int i = 0; i < itensCores.length; i++) {
                if (itensCores[i].isSelected()) {
                    label.setForeground(cores[i]);
                    break;
                }
            }

            // processa selação de fonte
            for (int i = 0; i < fontes.length; i++) {
                if (evento.getSource() == fontes[i]) {
                    label.setFont(
                        new Font(fontes[i].getText(), estilo, 72)
                    );
                }
            }

            repaint(); // redesenha o aplicativo
        }
    } // fim de TrataItens

    private class TrataEstilos implements ItemListener {
        // processa seleções de estilo
        @Override
        public void itemStateChanged(ItemEvent e) {
            String nome = label.getFont().getName(); // fonte atual
            Font fonte; // nova fonte com base nas seleções do usuário
            int novoEstilo;
            // determina os itens marcados e cria a fonte
            if (estilos[0].isSelected() && estilos[1].isSelected())
                novoEstilo = Font.BOLD + Font.ITALIC;
            else if (estilos[0].isSelected())
                novoEstilo = Font.BOLD;
            else if (estilos[1].isSelected())
                novoEstilo = Font.ITALIC;
            else
                novoEstilo = Font.PLAIN;

            fonte = new Font(nome, novoEstilo, 72);
            label.setFont(fonte);
            repaint(); // redesenha o aplicativo
        }
    }
    
}
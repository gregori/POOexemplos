import javax.swing.JFrame;

/**
 * TabbedPaneDemo
 */
public class TabbedPaneDemo {

    public static void main(String[] args) {
        TabbedPane tabbedPane = new TabbedPane();
        tabbedPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tabbedPane.setSize(250, 200);
        tabbedPane.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LojaDeDoces {
    private JFrame frame;
    private JLabel labelTotal;
    private JTextField textFieldTotal;
    private JButton buttonPedir;
    private JCheckBox checkBoxDoce1;
    private JCheckBox checkBoxDoce2;
    private JCheckBox checkBoxDoce3;

    public LojaDeDoces() {
        frame = new JFrame("Loja de Doces");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar painel de topo com label e textField
        JPanel panelTop = new JPanel();
        labelTotal = new JLabel("Total: R$ ");
        textFieldTotal = new JTextField(10);
        textFieldTotal.setEditable(false);
        panelTop.add(labelTotal);
        panelTop.add(textFieldTotal);

        // Criar painel de centro com checkboxes
        JPanel panelCenter = new JPanel(new GridLayout(3, 1));
        checkBoxDoce1 = new JCheckBox("Doce 1 - R$ 5,00");
        checkBoxDoce2 = new JCheckBox("Doce 2 - R$ 3,00");
        checkBoxDoce3 = new JCheckBox("Doce 3 - R$ 2,00");
        panelCenter.add(checkBoxDoce1);
        panelCenter.add(checkBoxDoce2);
        panelCenter.add(checkBoxDoce3);

        // Criar painel de rodapé com botão
        JPanel panelBottom = new JPanel();
        buttonPedir = new JButton("Pedir");
        buttonPedir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                if (checkBoxDoce1.isSelected()) {
                    total += 5.00;
                }
                if (checkBoxDoce2.isSelected()) {
                    total += 3.00;
                }
                if (checkBoxDoce3.isSelected()) {
                    total += 2.00;
                }
                textFieldTotal.setText(String.format("R$ %.2f", total));
            }
        });
        panelBottom.add(buttonPedir);

        // Criar painel com grid layout
        JPanel panelGridLayout = new JPanel(new GridLayout(4, 2));

        // Adicionar componentes ao painel
        panelGridLayout.add(new JLabel("Doce 1 - R$ 5,00"));
        JCheckBox checkBoxDoce1GridLayout = new JCheckBox();
        panelGridLayout.add(checkBoxDoce1GridLayout);

        panelGridLayout.add(new JLabel("Doce 2 - R$ 3,00"));
        JCheckBox checkBoxDoce2GridLayout = new JCheckBox();
        panelGridLayout.add(checkBoxDoce2GridLayout);

        panelGridLayout.add(new JLabel("Doce 3 - R$ 2,00"));
        JCheckBox checkBoxDoce3GridLayout = new JCheckBox();
        panelGridLayout.add(checkBoxDoce3GridLayout);

        panelGridLayout.add(new JLabel("Total: R$ "));
        JTextField textFieldTotalGridLayout = new JTextField(10);
        textFieldTotalGridLayout.setEditable(false);
        panelGridLayout.add(textFieldTotalGridLayout);

        JButton buttonPedirGridLayout = new JButton("Pedir");
        buttonPedirGridLayout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                if (checkBoxDoce1GridLayout.isSelected()) {
                    total += 5.00;
                }
                if (checkBoxDoce2GridLayout.isSelected()) {
                    total += 3.00;
                }
                if (checkBoxDoce3GridLayout.isSelected()) {
                    total += 2.00;
                }
                textFieldTotalGridLayout.setText(String.format("R$ %.2f", total));
            }
        });
        panelGridLayout.add(buttonPedirGridLayout);

        // Adicionar painéis ao frame
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("BorderLayout", new JPanel(new BorderLayout()));
        tabbedPane.addTab("GridLayout", panelGridLayout);

        ((JPanel) tabbedPane.getComponentAt(0)).add(panelTop, BorderLayout.NORTH);
        ((JPanel) tabbedPane.getComponentAt(0)).add(panelCenter, BorderLayout.CENTER);
        ((JPanel) tabbedPane.getComponentAt(0)).add(panelBottom, BorderLayout.SOUTH);

        frame.getContentPane().add(tabbedPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LojaDeDoces();
    }
}
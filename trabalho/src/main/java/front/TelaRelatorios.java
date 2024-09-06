package front;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

public class TelaRelatorios extends JFrame {
    private static final long serialVersionUID = 1L;

    public TelaRelatorios() {
        setTitle("RELATÓRIOS");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panelTexto = new JPanel();
        panelTexto.setLayout(new BorderLayout());

        JLabel labelTitulo = new JLabel("Relatórios de Progresso", JLabel.CENTER);
        labelTitulo.setFont(new Font("Verdana", Font.BOLD, 18));
        panelTexto.add(labelTitulo, BorderLayout.NORTH);

        JTextArea textAreaRelatorios = new JTextArea();
        textAreaRelatorios.setText("Aqui você pode visualizar relatórios de progresso.\n\n"
                + "1. Relatório de Tarefas\n"
                + "2. Relatório de Projetos\n"
                + "3. Estatísticas Gerais");
        textAreaRelatorios.setFont(new Font("Verdana", Font.PLAIN, 14));
        textAreaRelatorios.setEditable(false);
        textAreaRelatorios.setPreferredSize(new Dimension(580, 300));

        panelTexto.add(textAreaRelatorios, BorderLayout.CENTER);

        add(panelTexto, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new TelaRelatorios().setVisible(true);
    }
}


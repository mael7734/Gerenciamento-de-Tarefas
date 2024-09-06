package front;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

public class TelaDetalhes extends JFrame {
    private static final long serialVersionUID = 1L;

    public TelaDetalhes() {
        setTitle("DETALHES");
        setSize(600, 400); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1, 10, 10));

        JPanel panelTarefas = new JPanel(new BorderLayout());
        JLabel labelTarefas = new JLabel("Detalhes das Tarefas", JLabel.CENTER);
        labelTarefas.setFont(new Font("Verdana", Font.BOLD, 16));
        panelTarefas.add(labelTarefas, BorderLayout.NORTH);

        JTextArea textAreaTarefas = new JTextArea();
        textAreaTarefas.setText("Aqui você pode visualizar detalhes das tarefas.\n\n"
                + "Tarefa 1: Descrição, Prazo, Status\n"
                + "Tarefa 2: Descrição, Prazo, Status\n"
                + "Tarefa 3: Descrição, Prazo, Status");
        textAreaTarefas.setFont(new Font("Verdana", Font.PLAIN, 14));
        textAreaTarefas.setEditable(false);
        textAreaTarefas.setPreferredSize(new Dimension(580, 150));

        JScrollPane scrollTarefas = new JScrollPane(textAreaTarefas);
        panelTarefas.add(scrollTarefas, BorderLayout.CENTER);

        JPanel panelProjetos = new JPanel(new BorderLayout());
        JLabel labelProjetos = new JLabel("Detalhes dos Projetos", JLabel.CENTER);
        labelProjetos.setFont(new Font("Verdana", Font.BOLD, 16));
        panelProjetos.add(labelProjetos, BorderLayout.NORTH);

        JTextArea textAreaProjetos = new JTextArea();
        textAreaProjetos.setText("Aqui você pode visualizar detalhes dos projetos.\n\n"
                + "Projeto A: Descrição, Prazo, Status\n"
                + "Projeto B: Descrição, Prazo, Status\n"
                + "Projeto C: Descrição, Prazo, Status");
        textAreaProjetos.setFont(new Font("Verdana", Font.PLAIN, 14));
        textAreaProjetos.setEditable(false);
        textAreaProjetos.setPreferredSize(new Dimension(580, 150));

        JScrollPane scrollProjetos = new JScrollPane(textAreaProjetos);
        panelProjetos.add(scrollProjetos, BorderLayout.CENTER);

        add(panelTarefas);
        add(panelProjetos);
    }

    public static void main(String[] args) {
        new TelaDetalhes().setVisible(true);
    }
}

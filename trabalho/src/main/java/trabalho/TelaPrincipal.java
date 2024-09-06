package trabalho;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import front.TelaDetalhes;
import front.TelaProjetos;
import front.TelaRelatorios;
import front.TelaTarefas;

public class TelaPrincipal extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton btnAddTask, btnAddProject, btnViewReports, btnViewDetalhes;
    private JButton btnAddTaskItem, btnEditTaskItem, btnRemoveTaskItem;
    private JButton btnAddProjectItem, btnEditProjectItem, btnRemoveProjectItem;
    private JList<String> listProjetos, listTarefas;

    public TelaPrincipal() {
        setTitle("TELA PRINCIPAL");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1, 10, 10));
        getContentPane().setBackground(new Color(230, 230, 250)); 

        JPanel panelBotoes = new JPanel(new GridLayout(1, 4, 10, 10));
        panelBotoes.setBackground(new Color(230, 230, 250));
        
        btnAddTask = new JButton("Tarefas");
        btnAddTask.setPreferredSize(new Dimension(150, 50));
        btnAddTask.setFont(new Font("Verdana", Font.BOLD, 14));
        btnAddTask.setBackground(new Color(70, 130, 180));
        btnAddTask.setForeground(Color.WHITE);

        btnAddProject = new JButton("Projetos");
        btnAddProject.setPreferredSize(new Dimension(150, 50));
        btnAddProject.setFont(new Font("Verdana", Font.BOLD, 14));
        btnAddProject.setBackground(new Color(34, 139, 34)); 
        btnAddProject.setForeground(Color.WHITE);

        btnViewReports = new JButton("Relatórios");
        btnViewReports.setPreferredSize(new Dimension(150, 50));
        btnViewReports.setFont(new Font("Verdana", Font.BOLD, 14));
        btnViewReports.setBackground(new Color(255, 165, 0)); 
        btnViewReports.setForeground(Color.WHITE);
        
        btnViewDetalhes = new JButton("Detalhes");
        btnViewDetalhes.setPreferredSize(new Dimension(150, 50));
        btnViewDetalhes.setFont(new Font("Verdana", Font.BOLD, 14));
        btnViewDetalhes.setBackground(new Color(25, 15, 10)); 
        btnViewDetalhes.setForeground(Color.WHITE);

        panelBotoes.add(btnAddTask);
        panelBotoes.add(btnAddProject);
        panelBotoes.add(btnViewReports);
        panelBotoes.add(btnViewDetalhes);

        String[] projetos = {"Projeto A", "Projeto B", "Projeto C"};
        String[] tarefas = {"Tarefa 1", "Tarefa 2", "Tarefa 3"};

        listProjetos = new JList<>(projetos);
        listTarefas = new JList<>(tarefas);

        JScrollPane scrollProjetos = new JScrollPane(listProjetos);
        JScrollPane scrollTarefas = new JScrollPane(listTarefas);

        JPanel panelProjetosButtons = new JPanel(new GridLayout(3, 1, 5, 5));
        btnAddProjectItem = new JButton("Adicionar");
        btnAddProjectItem.setBackground(new Color(200, 69, 69));
        btnEditProjectItem = new JButton("Editar");
        btnEditProjectItem.setBackground(new Color(200, 89, 89));
        btnRemoveProjectItem = new JButton("Remover");
        btnRemoveProjectItem.setBackground(new Color(255, 69, 69));
        panelProjetosButtons.add(btnAddProjectItem);
        panelProjetosButtons.add(btnEditProjectItem);
        panelProjetosButtons.add(btnRemoveProjectItem);

        JPanel panelTarefasButtons = new JPanel(new GridLayout(3, 1, 5, 5));
        btnAddTaskItem = new JButton("Adicionar");
        btnAddTaskItem.setBackground(new Color(200, 69, 69));
        btnEditTaskItem = new JButton("Editar");
        btnEditTaskItem.setBackground(new Color(200, 89, 89));
        btnRemoveTaskItem = new JButton("Remover");
        btnRemoveTaskItem.setBackground(new Color(255, 69, 69));
        panelTarefasButtons.add(btnAddTaskItem);
        panelTarefasButtons.add(btnEditTaskItem);
        panelTarefasButtons.add(btnRemoveTaskItem);

        JPanel panelProjetosList = new JPanel(new GridLayout(2, 1, 10, 10));
        JLabel labelProjetos = new JLabel("Lista de Projetos", JLabel.CENTER);
        labelProjetos.setFont(new Font("Verdana", Font.BOLD, 14)); 
        panelProjetosList.add(labelProjetos);
        panelProjetosList.add(scrollProjetos);
        panelProjetosList.add(panelProjetosButtons);

        JPanel panelTarefasList = new JPanel(new GridLayout(2, 1, 10, 10));
        JLabel labelTarefas = new JLabel("Lista de Tarefas", JLabel.CENTER);
        labelTarefas.setFont(new Font("Verdana", Font.BOLD, 14));
        panelTarefasList.add(labelTarefas);
        panelTarefasList.add(scrollTarefas);
        panelTarefasList.add(panelTarefasButtons);

        JPanel panelListas = new JPanel(new GridLayout(1, 2, 10, 10));
        panelListas.add(panelProjetosList);
        panelListas.add(panelTarefasList);

        add(panelBotoes);
        add(panelListas);

        btnAddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaTarefas().setVisible(true);
            }
        });

        btnAddProject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaProjetos().setVisible(true);
            }
        });

        btnViewReports.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaRelatorios().setVisible(true);
            }
        });
        
        btnViewDetalhes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaDetalhes().setVisible(true);
            }
        });

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new TelaPrincipal().setVisible(true);
    }
}

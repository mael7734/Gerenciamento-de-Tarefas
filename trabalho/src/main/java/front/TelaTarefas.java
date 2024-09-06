package front;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import trabalho.model.Tarefa;

public class TelaTarefas extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTitulo, txtDescricao, txtData, txtStatus;
    private JButton btnSalvar;

    public TelaTarefas() {
        setTitle("TAREFAS");
        setSize(300, 300);
        setLayout(new GridLayout(5, 2));

        txtTitulo = new JTextField();
        txtDescricao = new JTextField();
        txtData = new JTextField();
        txtStatus = new JTextField();
        btnSalvar = new JButton("Salvar");

        add(new JLabel("Título:"));
        add(txtTitulo);
        add(new JLabel("Descrição:"));
        add(txtDescricao);
        add(new JLabel("Data:"));
        add(txtData);
        add(new JLabel("Status:"));
        add(txtStatus);
        add(new JLabel(""));
        add(btnSalvar);

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tarefa tarefa = new Tarefa();
                tarefa.setTitulo(txtTitulo.getText());
                tarefa.setDescricao(txtDescricao.getText());
            }
        });
    }
}

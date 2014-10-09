package view;
import control.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;

public class InterfaceGrafic extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafic frame = new InterfaceGrafic();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceGrafic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarAtleta = new JButton("Cadastrar Atleta");
		btnCadastrarAtleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnCadastrarAtleta.setBounds(12, 0, 211, 25);
		contentPane.add(btnCadastrarAtleta);
		
		JButton btnConsultarTorneios = new JButton("Consultar Atletas");
		btnConsultarTorneios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultarTorneios.setBounds(12, 26, 211, 25);
		contentPane.add(btnConsultarTorneios);
		
		JButton btnCadastrarTorneios = new JButton("Cadastrar Torneios");
		btnCadastrarTorneios.setBounds(12, 53, 211, 25);
		contentPane.add(btnCadastrarTorneios);
		
		
	}
}

package view;
import view.Cadastro_Funcionario;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FARMÁCIA extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FARMÁCIA frame = new FARMÁCIA();
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
	public FARMÁCIA() {
		setResizable(false);
		setTitle("Drogasil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botãocadastrouser = new JButton("");
		botãocadastrouser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro_Funcionario mine = new Cadastro_Funcionario();
			    mine.setVisible(true);
				
			}
		});
		botãocadastrouser.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design cadas. funcionario.png"));
		botãocadastrouser.setBounds(10, 20, 89, 72);
		contentPane.add(botãocadastrouser);
		
		JButton botãocadastrocliente = new JButton("");
		botãocadastrocliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCliente mine = new CadastroCliente();
			    mine.setVisible(true);
			}
		});
		botãocadastrocliente.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design cadas. cliente.png"));
		botãocadastrocliente.setBounds(10, 103, 89, 68);
		contentPane.add(botãocadastrocliente);
		
		JButton butaoremedios = new JButton("");
		butaoremedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Remédios mine = new Remédios();
			    mine.setVisible(true);
			}
		});
		butaoremedios.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Desing remedios.png"));
		butaoremedios.setBounds(10, 182, 89, 68);
		contentPane.add(butaoremedios);
		
		JLabel lblNewLabel = new JLabel("Cadastro Usuário");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(109, 47, 126, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro Cliente");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(109, 127, 126, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Remédios");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setBounds(109, 221, 71, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design Drogasil.png"));
		lblNewLabel_3.setBounds(268, 20, 120, 110);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design Drog.2.png"));
		lblNewLabel_4.setBounds(245, 165, 170, 70);
		contentPane.add(lblNewLabel_4);
	}
}

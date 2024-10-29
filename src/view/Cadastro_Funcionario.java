package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cadastro_Funcionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNom;
	private JTextField textemail;
	private JTextField textTelefone1;
	private JTextField textTelefone2;
	private JTextField textDescri;
	private JTextField textcpf;
	private JTextField textrg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Funcionario frame = new Cadastro_Funcionario();
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
	public Cadastro_Funcionario() {
		setResizable(false);
		setTitle("Cadastro de Funcionario - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textNome = new JLabel("Nome:");
		textNome.setFont(new Font("Arial", Font.PLAIN, 10));
		textNome.setBounds(10, 11, 31, 14);
		contentPane.add(textNome);
		
		textNom = new JTextField();
		textNom.setBounds(51, 8, 165, 20);
		contentPane.add(textNom);
		textNom.setColumns(10);
		
		JLabel textEmail = new JLabel("E-mail:");
		textEmail.setFont(new Font("Arial", Font.PLAIN, 10));
		textEmail.setBounds(229, 11, 34, 14);
		contentPane.add(textEmail);
		
		textemail = new JTextField();
		textemail.setBounds(268, 8, 156, 20);
		contentPane.add(textemail);
		textemail.setColumns(10);
		
		JLabel textCelular1 = new JLabel("Celular (DDD)");
		textCelular1.setFont(new Font("Arial", Font.PLAIN, 10));
		textCelular1.setBounds(10, 45, 69, 14);
		contentPane.add(textCelular1);
		
		textTelefone1 = new JTextField();
		textTelefone1.setBounds(76, 42, 140, 20);
		contentPane.add(textTelefone1);
		textTelefone1.setColumns(10);
		
		JLabel textCelular2 = new JLabel("Celular2 (DDD)");
		textCelular2.setFont(new Font("Arial", Font.PLAIN, 10));
		textCelular2.setBounds(226, 45, 78, 14);
		contentPane.add(textCelular2);
		
		textTelefone2 = new JTextField();
		textTelefone2.setBounds(306, 42, 118, 20);
		contentPane.add(textTelefone2);
		textTelefone2.setColumns(10);
		
		JLabel textDescriUser = new JLabel("Descrição do Usuário:");
		textDescriUser.setFont(new Font("Arial", Font.PLAIN, 10));
		textDescriUser.setBounds(10, 75, 103, 14);
		contentPane.add(textDescriUser);
		
		textDescri = new JTextField();
		textDescri.setBounds(116, 72, 308, 20);
		contentPane.add(textDescri);
		textDescri.setColumns(10);
		
		textcpf = new JTextField();
		textcpf.setBounds(44, 103, 172, 20);
		contentPane.add(textcpf);
		textcpf.setColumns(10);
		
		JLabel textCPF = new JLabel("CPF:");
		textCPF.setFont(new Font("Arial", Font.PLAIN, 10));
		textCPF.setBounds(10, 106, 24, 14);
		contentPane.add(textCPF);
		
		textrg = new JTextField();
		textrg.setBounds(252, 103, 172, 20);
		contentPane.add(textrg);
		textrg.setColumns(10);
		
		JButton BtnCadastro = new JButton("Cadastrar");
		BtnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BtnCadastro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Nome:" + textNom.getText());
				System.out.println("Email:" + textemail.getText());
				System.out.println("Celular1:" + textTelefone1.getText());
				System.out.println("Celular2:" + textTelefone2.getText());
				System.out.println("Descrição:" + textDescri.getText());
				System.out.println("CPF:" + textcpf.getText());
				System.out.println("RG:" + textrg.getText());
				
				
				JOptionPane.showMessageDialog(BtnCadastro,"Cadastrado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		BtnCadastro.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		BtnCadastro.setBounds(127, 153, 89, 23);
		contentPane.add(BtnCadastro);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNom.setText("");
				textemail.setText("");
				textTelefone1.setText("");
				textTelefone2.setText("");
				textDescri.setText("");
				textcpf.setText("");
				textrg.setText("");
			    
				JOptionPane.showMessageDialog(btnNewButton_1,"Limpado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
			
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnNewButton_1.setBounds(229, 153, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel textRG = new JLabel("RG:");
		textRG.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textRG.setBounds(226, 106, 18, 14);
		contentPane.add(textRG);
		
		JButton btnNewButton_2 = new JButton("Sair");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    dispose();
			}
		});
		btnNewButton_2.setBounds(370, 235, 58, 23);
		contentPane.add(btnNewButton_2);
		
	}
}

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnome2;
	private JTextField textEmail2;
	private JTextField textCelular3;
	private JTextField textCelular4;
	private JTextField textEndereço2;
	private JTextField textNº2;
	private JTextField textComplemento2;
	private JTextField textBairro2;
	private JTextField textCEP2;
	private JTextField textCPF2;
	private JTextField textDataNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setResizable(false);
		setTitle("Cadastro de Cliente - Login");
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
		
		textnome2 = new JTextField();
		textnome2.setBounds(51, 8, 165, 20);
		contentPane.add(textnome2);
		textnome2.setColumns(10);
		
		JLabel textEmail = new JLabel("E-mail:");
		textEmail.setFont(new Font("Arial", Font.PLAIN, 10));
		textEmail.setBounds(229, 11, 34, 14);
		contentPane.add(textEmail);
		
		textEmail2 = new JTextField();
		textEmail2.setBounds(268, 8, 156, 20);
		contentPane.add(textEmail2);
		textEmail2.setColumns(10);
		
		JLabel textCelular = new JLabel("Celular (DDD)");
		textCelular.setFont(new Font("Arial", Font.PLAIN, 10));
		textCelular.setBounds(10, 45, 69, 14);
		contentPane.add(textCelular);
		
		textCelular3 = new JTextField();
		textCelular3.setBounds(76, 42, 140, 20);
		contentPane.add(textCelular3);
		textCelular3.setColumns(10);
		
		JLabel textCelular2 = new JLabel("Celular2 (DDD)");
		textCelular2.setFont(new Font("Arial", Font.PLAIN, 10));
		textCelular2.setBounds(227, 45, 75, 14);
		contentPane.add(textCelular2);
		
		textCelular4 = new JTextField();
		textCelular4.setBounds(312, 42, 112, 20);
		contentPane.add(textCelular4);
		textCelular4.setColumns(10);
		
		JLabel textEndereço = new JLabel("Endereço:");
		textEndereço.setFont(new Font("Arial", Font.PLAIN, 10));
		textEndereço.setBounds(10, 75, 49, 14);
		contentPane.add(textEndereço);
		
		JLabel textNº = new JLabel("Nº");
		textNº.setFont(new Font("Arial", Font.PLAIN, 10));
		textNº.setBounds(362, 73, 11, 14);
		contentPane.add(textNº);
		
		textEndereço2 = new JTextField();
		textEndereço2.setBounds(60, 72, 292, 20);
		contentPane.add(textEndereço2);
		textEndereço2.setColumns(10);
		
		textNº2 = new JTextField();
		textNº2.setBounds(377, 72, 31, 20);
		contentPane.add(textNº2);
		textNº2.setColumns(10);
		
		JLabel textcomplemento = new JLabel("Complemento:");
		textcomplemento.setFont(new Font("Arial", Font.PLAIN, 10));
		textcomplemento.setBounds(10, 111, 70, 14);
		contentPane.add(textcomplemento);
		
		textComplemento2 = new JTextField();
		textComplemento2.setBounds(84, 108, 165, 20);
		contentPane.add(textComplemento2);
		textComplemento2.setColumns(10);
		
		JLabel textBairro = new JLabel("Bairro:");
		textBairro.setFont(new Font("Arial", Font.PLAIN, 10));
		textBairro.setBounds(10, 146, 34, 14);
		contentPane.add(textBairro);
		
		textBairro2 = new JTextField();
		textBairro2.setBounds(51, 143, 165, 20);
		contentPane.add(textBairro2);
		textBairro2.setColumns(10);
		
		JLabel textCEP = new JLabel("CEP:");
		textCEP.setFont(new Font("Arial", Font.PLAIN, 10));
		textCEP.setBounds(229, 146, 24, 14);
		contentPane.add(textCEP);
		
		textCEP2 = new JTextField();
		textCEP2.setBounds(255, 143, 153, 20);
		contentPane.add(textCEP2);
		textCEP2.setColumns(10);
		
		JLabel textCPF = new JLabel("CPF:");
		textCPF.setFont(new Font("Arial", Font.PLAIN, 10));
		textCPF.setBounds(10, 184, 24, 14);
		contentPane.add(textCPF);
		
		textCPF2 = new JTextField();
		textCPF2.setBounds(35, 181, 181, 20);
		contentPane.add(textCPF2);
		textCPF2.setColumns(10);
		
		JComboBox Genero = new JComboBox();
		Genero.setModel (new DefaultComboBoxModel(new String[] {"Homem", "Mulher", "Bi", "Gay", "Sapatão", "Boyceta", "Outro"}));
		Genero.setBounds(312, 107, 77, 22);
		contentPane.add(Genero);
		
		JLabel textGenero =new JLabel("Gênero:");
		textGenero.setBounds(268, 111, 46, 14);
		contentPane.add(textGenero);
		
		JLabel textdatanascimento = new JLabel("Data de Nascimento:");
		textdatanascimento.setFont(new Font("Arial", Font.PLAIN, 10));
		textdatanascimento.setBounds(229, 184, 103, 14);
		contentPane.add(textdatanascimento);
		
		textDataNascimento = new JTextField();
		textDataNascimento.setBounds(338, 181, 86, 20);
		contentPane.add(textDataNascimento);
		textDataNascimento.setColumns(10);
		
		JButton ButtonCasdastrar = new JButton("Cadastrar");
		ButtonCasdastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Nome:" + textnome2.getText());
				System.out.println("Email:" + textEmail2.getText());
				System.out.println("Celular1:" + textCelular3.getText());
				System.out.println("Celular2" + textCelular4.getText());
				System.out.println("Endereço:" + textEndereço2.getText());
				System.out.println("Número da casa:" + textNº2.getText());
				System.out.println("Complemento:" + textComplemento2.getText());
				System.out.println("Genero:" + Genero.getSelectedItem());
				System.out.println("Bairro:" + textBairro2.getText());
				System.out.println("Cep:" + textCEP2.getText());
				System.out.println("Cpf:" + textCPF2.getText());
				System.out.println("Data de nascimento:" + textDataNascimento.getText());
				
				JOptionPane.showMessageDialog(ButtonCasdastrar,"Cadastrado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		ButtonCasdastrar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		ButtonCasdastrar.setBounds(127, 228, 89, 23);
		contentPane.add(ButtonCasdastrar);
		
		JButton ButtonCancelar = new JButton("Limpar");
		ButtonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textnome2.setText("");
				textEmail2.setText("");
				textCelular3.setText("");
				textCelular4.setText("");
				textEndereço2.setText("");
				textNº2.setText("");
				textComplemento2.setText("");
				textBairro2.setText("");
				textCEP2.setText("");
				textCPF2.setText("");
				textDataNascimento.setText("");;
				
				JOptionPane.showMessageDialog(ButtonCasdastrar,"Limpado com sucesso!","Aviso",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		ButtonCancelar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		ButtonCancelar.setBounds(229, 228, 89, 23);
		contentPane.add(ButtonCancelar);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(370, 235, 58, 23);
		contentPane.add(btnNewButton);
		

		
	}
}

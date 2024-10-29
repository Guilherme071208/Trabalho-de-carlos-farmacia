package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Remédios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remédios frame = new Remédios();
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
	public Remédios() {
		setTitle("Remédios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design Buscopan.png"));
		btnNewButton.setBounds(13, 3, 105, 75);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design Dorflex.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(166, 3, 105, 75);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design neosoro.png"));
		btnNewButton_2.setBounds(13, 181, 105, 75);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design Rivotril.png"));
		btnNewButton_3.setBounds(13, 93, 105, 75);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design Microvlar.png"));
		btnNewButton_5.setBounds(166, 181, 105, 75);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design Salonpas.png"));
		btnNewButton_6.setBounds(319, 3, 105, 75);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design Cliclo 21.png"));
		btnNewButton_7.setBounds(319, 93, 105, 75);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design Hipoglós.png"));
		btnNewButton_8.setBounds(166, 89, 105, 75);
		contentPane.add(btnNewButton_8);
		
		JLabel lblNewLabel = new JLabel("N° - 81995559562");
		lblNewLabel.setBounds(319, 236, 105, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número da Farmácia");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(308, 218, 126, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fale conosco:");
		lblNewLabel_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(319, 193, 105, 14);
		contentPane.add(lblNewLabel_2);
	}
}

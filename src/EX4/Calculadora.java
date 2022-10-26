package EX4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//TextFields--------------------------------------
		textField = new JTextField();
		textField.setBounds(38, 54, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 54, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(273, 54, 86, 20);
		contentPane.add(textField_2);

		
		//JLabels-------------------------------------
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setBounds(28, 57, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblB = new JLabel("B");
		lblB.setBounds(148, 57, 46, 14);
		contentPane.add(lblB);

		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(273, 37, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Label 1");
		lblNewLabel_2.setBounds(62, 160, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Label 2");
		lblNewLabel_2_1.setBounds(118, 160, 46, 14);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Label 3");
		lblNewLabel_2_2.setBounds(174, 160, 46, 14);
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("Label 4");
		lblNewLabel_2_3.setBounds(236, 160, 46, 14);
		contentPane.add(lblNewLabel_2_3);
		
		
		//Buttons-------------------------------
		JButton btnNewButton = new JButton("Sumar");
		btnNewButton.setBounds(35, 120, 73, 23);
		contentPane.add(btnNewButton);

		JButton btnRestar = new JButton("Restar");
		btnRestar.setBounds(121, 120, 73, 23);
		contentPane.add(btnRestar);

		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.setBounds(206, 120, 86, 23);
		contentPane.add(btnMultiplicar);

		JButton btnDividir = new JButton("Dividir");
		btnDividir.setBounds(302, 120, 73, 23);
		contentPane.add(btnDividir);

		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("About");
		btnNewButton_2.setBounds(335, 193, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
		//Button Events --------------------------------------------------
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int resultado = a + b;
				textField_2.setText(Integer.toString(resultado));
			}
		});
		
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int resultado = a - b;
				textField_2.setText(Integer.toString(resultado));
			}
		});
		
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int resultado = a * b;
				textField_2.setText(Integer.toString(resultado));
			}
		});
		
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int resultado = a / b;
				textField_2.setText(Integer.toString(resultado));
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane,
						"El creador de la minicalculadora es Juan Manuel De Senzi Yegro, estudiante del bootcamp de Java impartido por Jose");
			}
		});
	
		setVisible(true);
	}

}

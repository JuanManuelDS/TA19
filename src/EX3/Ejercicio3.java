package EX3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;

	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		//-----------------Radio Buttons-----------------------------
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(162, 34, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(162, 60, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(162, 86, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		bgroup.add(rdbtnNewRadioButton_2);

		
		//-----------------JLabels----------------------------------------
		JLabel lblNewLabel = new JLabel("Elija un sistema operativo");
		lblNewLabel.setBounds(143, 13, 148, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Elija su especialidad");
		lblNewLabel_1.setBounds(134, 132, 116, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horas diarias dedicadas al ordenador");
		lblNewLabel_2.setBounds(117, 262, 200, 14);
		contentPane.add(lblNewLabel_2);
		
		
		//--------------------Checkbox buttons----------------------------
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(143, 153, 128, 23);
		contentPane.add(chckbxNewCheckBox);

		JCheckBox chckbxDiseoGrfico = new JCheckBox("Diseño gráfico");
		chckbxDiseoGrfico.setBounds(143, 179, 128, 23);
		contentPane.add(chckbxDiseoGrfico);

		JCheckBox chckbxAdministracin = new JCheckBox("Administración");
		chckbxAdministracin.setBounds(143, 205, 148, 23);
		contentPane.add(chckbxAdministracin);

		
		//----------------------------Slider------------------------------
		JSlider slider = new JSlider();
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(10);
		slider.setBounds(117, 287, 200, 45);
		contentPane.add(slider);
		
		
		//---------- Button & Button event -----------------------------
		JButton btnNewButton = new JButton("Enviar datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sistemaOperativo = "";
				if (rdbtnNewRadioButton.isSelected()) {
					sistemaOperativo = "Windows";
				} else if (rdbtnNewRadioButton_1.isSelected()) {
					sistemaOperativo = "Linux";
				} else if (rdbtnNewRadioButton_2.isSelected()) {
					sistemaOperativo = "Mac";
				}

				String especialidad = "";
				if (chckbxNewCheckBox.isSelected()) {
					especialidad += "Programacion\n";
				} 
				if (chckbxDiseoGrfico.isSelected()) {
					especialidad += "Diseño gráfico\n";
				}
				if (chckbxAdministracin.isSelected()) {
					especialidad += "Administración";
				}

				int horas = slider.getValue();

				JOptionPane.showMessageDialog(contentPane, "Sistema operativo:\n" + sistemaOperativo
						+ "\n\nEspecialidad/es:\n" + especialidad + "\n\nHoras: " + horas);
			}
		});
		btnNewButton.setBounds(108, 353, 217, 23);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}
}

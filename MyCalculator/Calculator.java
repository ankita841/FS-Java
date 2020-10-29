package MyCalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 13, 387, 68);
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("/");
		btnNewButton.setBounds(12, 94, 79, 76);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("-/+");
		button.setBounds(114, 94, 79, 76);
		contentPane.add(button);
		
		JButton btnBs = new JButton("BS");
		btnBs.setBounds(216, 94, 79, 76);
		contentPane.add(btnBs);
		
		JButton btnAc = new JButton("AC");
		btnAc.setBounds(320, 94, 79, 76);
		contentPane.add(btnAc);
		
		JButton button_3 = new JButton("*");
		button_3.setBounds(12, 183, 79, 76);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("1");
		button_4.setBounds(114, 183, 79, 76);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("2");
		button_5.setBounds(216, 183, 79, 76);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.setBounds(320, 183, 79, 76);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("-");
		button_7.setBounds(12, 272, 79, 76);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.setBounds(114, 272, 79, 76);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.setBounds(216, 272, 79, 76);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("6");
		button_10.setBounds(320, 272, 79, 76);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("+");
		button_11.setBounds(12, 364, 79, 76);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("7");
		button_12.setBounds(114, 364, 79, 76);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("8");
		button_13.setBounds(216, 364, 79, 76);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("9");
		button_14.setBounds(320, 364, 79, 76);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.setBounds(12, 453, 79, 76);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.setBounds(114, 453, 79, 76);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("0");
		button_17.setBounds(216, 453, 79, 76);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("%");
		button_18.setBounds(320, 453, 79, 76);
		contentPane.add(button_18);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

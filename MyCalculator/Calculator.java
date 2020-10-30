package MyCalculator;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener{

	private JPanel contentPane;
	static JTextField textField;
	static JButton btnNewButton, button, btnBs, btnAc, button_3, button_4, button_5, button_6, button_7, button_8, button_9, 
			button_10, button_11, button_12, button_13, button_14, button_15, button_16, button_17, button_18;
	static StringBuffer str = new StringBuffer();
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
		textField.setVisible(true);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("/");
		btnNewButton.setBounds(12, 94, 79, 76);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		button = new JButton("-/+");
		button.setBounds(114, 94, 79, 76);
		contentPane.add(button);
		button.addActionListener(this);
		
		btnBs = new JButton("BS");
		btnBs.setBounds(216, 94, 79, 76);
		contentPane.add(btnBs);
		btnBs.addActionListener(this);
		
		btnAc = new JButton("AC");
		btnAc.setBounds(320, 94, 79, 76);
		contentPane.add(btnAc);
		btnAc.addActionListener(this);
		
		button_3 = new JButton("*");
		button_3.setBounds(12, 183, 79, 76);
		contentPane.add(button_3);
		button_3.addActionListener(this);
		
		button_4 = new JButton("1");
		button_4.setBounds(114, 183, 79, 76);
		contentPane.add(button_4);
		button_4.addActionListener(this);
		
		button_5 = new JButton("2");
		button_5.setBounds(216, 183, 79, 76);
		contentPane.add(button_5);
		button_5.addActionListener(this);
		
		button_6 = new JButton("3");
		button_6.setBounds(320, 183, 79, 76);
		contentPane.add(button_6);
		button_6.addActionListener(this);
		
		button_7 = new JButton("-");
		button_7.setBounds(12, 272, 79, 76);
		contentPane.add(button_7);
		button_7.addActionListener(this);
		
		button_8 = new JButton("4");
		button_8.setBounds(114, 272, 79, 76);
		contentPane.add(button_8);
		button_8.addActionListener(this);
		
		button_9 = new JButton("5");
		button_9.setBounds(216, 272, 79, 76);
		contentPane.add(button_9);
		button_9.addActionListener(this);
		
		button_10 = new JButton("6");
		button_10.setBounds(320, 272, 79, 76);
		contentPane.add(button_10);
		button_10.addActionListener(this);
		
		button_11 = new JButton("+");
		button_11.setBounds(12, 364, 79, 76);
		contentPane.add(button_11);
		button_11.addActionListener(this);
		
		button_12 = new JButton("7");
		button_12.setBounds(114, 364, 79, 76);
		contentPane.add(button_12);
		button_12.addActionListener(this);
		
		button_13 = new JButton("8");
		button_13.setBounds(216, 364, 79, 76);
		contentPane.add(button_13);
		button_13.addActionListener(this);
		
		button_14 = new JButton("9");
		button_14.setBounds(320, 364, 79, 76);
		contentPane.add(button_14);
		button_14.addActionListener(this);
		
		button_15 = new JButton("=");
		button_15.setBounds(12, 453, 79, 76);
		contentPane.add(button_15);
		button_15.addActionListener(this);
		
		button_16 = new JButton(".");
		button_16.setBounds(114, 453, 79, 76);
		contentPane.add(button_16);
		button_16.addActionListener(this);
		
		button_17 = new JButton("0");
		button_17.setBounds(216, 453, 79, 76);
		contentPane.add(button_17);
		button_17.addActionListener(this);
		
		button_18 = new JButton("%");
		button_18.setBounds(320, 453, 79, 76);
		contentPane.add(button_18);
		button_18.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controller.calc(e);
		
	}
}

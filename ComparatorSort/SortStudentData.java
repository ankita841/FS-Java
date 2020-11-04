package FFFiless;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

class StudentDetails{
	String name;
	int age;
	float marks;
	StudentDetails(String n, int a, float m)
	{
		name = n;
		age = a;
		marks = m;
	}
	
	public String toString()
	{
		return name + " " + age + " " + marks;
	}
	
}

public class SortStudentData extends JFrame {

	private JPanel contentPane;
	private JTextField textField, textField_1, textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortStudentData frame = new SortStudentData();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	 public SortStudentData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblNewLabel.setBounds(39, 50, 88, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblAge.setBounds(39, 98, 88, 32);
		contentPane.add(lblAge);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblMarks.setBounds(39, 168, 88, 22);
		contentPane.add(lblMarks);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label.setBounds(134, 50, 88, 22);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel(":");
		label_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_1.setBounds(134, 103, 88, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel(":");
		label_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		label_2.setBounds(134, 168, 88, 22);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(195, 46, 169, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 104, 169, 32);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 158, 169, 32);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(420, 46, 97, 32);
		contentPane.add(btnNewButton);
		
		JButton btnSort = new JButton("Sort");
		btnSort.setBounds(420, 164, 97, 32);
		contentPane.add(btnSort);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Name ", "Age", "Marks"}));
		comboBox.setBounds(420, 99, 97, 32);
		contentPane.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(32, 246, 485, 153);
		contentPane.add(textArea);
	}
}

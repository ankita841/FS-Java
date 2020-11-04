package FFFiless;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
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
		return name + "\t" + age + "\t" + marks;
	}
}
class SortByName implements Comparator<StudentDetails>
{
	public int compare(StudentDetails d1, StudentDetails d2)
	{
		return d1.name.compareTo(d2.name);
	}
}

class SortByAge  implements Comparator<StudentDetails>
{
	public int compare(StudentDetails arg0, StudentDetails arg1) 
	{
		return arg0.age - arg1.age;
	}	
	
}

class SortByMarks implements Comparator<StudentDetails>
{
	public int compare(StudentDetails arg0, StudentDetails arg1)
	{
		return (int)(arg0.marks - arg1.marks);
	}
}

public class SortStudentData extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField, textField_1, textField_2;
	JButton addButton, btnSort;
	JComboBox comboBox;
	JTextArea textArea;
	
	static ArrayList<StudentDetails> al = new ArrayList<>();

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
		setBounds(100, 100, 548, 485);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblNewLabel.setBounds(39, 50, 88, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblAge.setBounds(39, 103, 88, 32);
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
		label_1.setBounds(134, 108, 88, 22);
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
		
		addButton = new JButton("Add");
		addButton.setVerticalAlignment(SwingConstants.BOTTOM);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		addButton.setHorizontalAlignment(SwingConstants.LEFT);
		addButton.setBounds(406, 46, 111, 32);
		addButton.addActionListener(this);
		contentPane.add(addButton);
		
		btnSort = new JButton("Sort");
		btnSort.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSort.setHorizontalAlignment(SwingConstants.LEFT);
		btnSort.setBounds(406, 164, 111, 32);
		btnSort.addActionListener(this);
		contentPane.add(btnSort);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"  Select", "Name ", "Age", "Marks"}));
		comboBox.setBounds(406, 99, 111, 32);
		contentPane.add(comboBox);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 272, 505, 153);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Sorted Data : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(12, 225, 185, 39);
		contentPane.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton)
		{
			String n = textField.getText();
			textField.setText("");
			int a = Integer.parseInt(textField_1.getText());
			textField_1.setText("");
			float m = Float.parseFloat(textField_2.getText());
			textField_2.setText("");
			al.add(new StudentDetails(n, a, m));
			//System.out.println(al);
		}
		if (e.getSource() == btnSort)
		{
			String str= String.valueOf(comboBox.getItemAt(comboBox.getSelectedIndex()));
			if (str.equals("Name"))
				Collections.sort(al, new SortByName());
			else if (str.equals("Age"))
				Collections.sort(al, new SortByAge());
			else if (str.equals("Marks"))
				Collections.sort(al, new SortByMarks());
			String stuData=" ";
			for(StudentDetails x : al)
				stuData += (String.valueOf(x) + "\n");
			textArea.setText("Name\tAge\tMarks\n" + stuData);			
		}
		
	}
}

package MyCalculator;

import java.awt.event.ActionEvent;
import java.util.*;

public class controller extends Calculator{
	static float result = 0, num1 = 0;
	static Queue<Character> q = new LinkedList<>();
	static void calculateAns(char op)
	{
		switch (op)
		{
		case '/':
			try
			{
				result /= num1;
				str.replace(0, str.length(), Float.toString(result));
			}
			catch (Exception e)
			{
				str.replace(0, str.length(), "Exception divide by zero");
			}
			break;
		case '*':
			result *= num1;
			str.replace(0, str.length(), Float.toString(result));
			break;
		case '+':
			result += num1;
			str.replace(0, str.length(), Float.toString(result));
			break;
		case '-':
			result -= num1;
			str.replace(0, str.length(), Float.toString(result));
			break;
		}
	}
	static void calc(ActionEvent e)
	{
		if (e.getSource() == btnAc)
			str.delete(0, str.length());
		if (e.getSource() == btnBs && str.length() > 0)
			str.delete(str.length() - 1, str.length());
		if (e.getSource() == btnNewButton)
		{
			str.append('/');
			q.add('/');
		}
		if (e.getSource() == button_3)
		{
			str.append('*');
			q.add('*');
		}
		if (e.getSource() == button_4)
			str.append("1");
		if (e.getSource() == button_5)
			str.append("2");
		if (e.getSource() == button_6)
			str.append("3");
		if (e.getSource() == button_7)
		{
			str.append('-');
			q.add('-');
		}
		if (e.getSource() == button_8)
			str.append("4");
		if (e.getSource() == button_9)
			str.append("5");
		if (e.getSource() == button_10)
			str.append("6");
		if (e.getSource() == button_11)
		{
			str.append('+');
			q.add('+');
		}
		if (e.getSource() == button_12)
			str.append("7");
		if (e.getSource() == button_13)
			str.append("8");
		if (e.getSource() == button_14)
			str.append("9");
		if (e.getSource() == button_16)
			str.append(".");
		if (e.getSource() == button_17)
			str.append("0");
		if (e.getSource() == button)
		{
			float k = Float.parseFloat(str.toString());
			k = -k;
			str.replace(0, str.length(), Float.toString(k));
		}
		if (e.getSource() == button_15)
		{
			if (str.charAt(str.length() - 1) < '0' || str.charAt(str.length() - 1) > '9')
				str.replace(0, str.length(), "Invalid Syntax"); 
			else
			{
				String num = "";
				for (int i = 0; i < str.length(); i++)
				{
					if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.')
						num += str.charAt(i);
					else
					{
						num1 = Float.parseFloat(num);
						System.out.println(num1);
						num = "";
						if (result == 0)
							result = num1;
						else
							calculateAns(q.poll());						
					}
				}
				num1 = Float.parseFloat(num);
				System.out.println(num1);
				if (result == 0)
					result = num1;
				else
					if (!q.isEmpty())
					calculateAns(q.poll());
				
				num1 = 0;
				q.clear();
				result = 0;
			}
		}
		textField.setText(str.toString());
			
	}

}

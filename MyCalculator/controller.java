package MyCalculator;

import java.awt.TextField;
import java.awt.event.ActionEvent;

public class controller extends Calculator{
	static void calc(ActionEvent e)
	{
		if (e.getSource() == btnAc)
			str.delete(0, str.length());
		if (e.getSource() == btnBs && str.length() > 0)
			str.delete(str.length() - 1, str.length());
		if (e.getSource() == btnNewButton)
			str.append("/");
		if (e.getSource() == button_3)
			str.append("*");
		if (e.getSource() == button_4)
			str.append("1");
		if (e.getSource() == button_5)
			str.append("2");
		if (e.getSource() == button_6)
			str.append("3");
		if (e.getSource() == button_7)
			str.append("-");
		if (e.getSource() == button_8)
			str.append("4");
		if (e.getSource() == button_9)
			str.append("5");
		if (e.getSource() == button_10)
			str.append("6");
		if (e.getSource() == button_11)
			str.append("+");
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
		textField.setText(str.toString());
			
	}

}

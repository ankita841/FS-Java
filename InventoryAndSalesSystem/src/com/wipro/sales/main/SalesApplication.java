package com.wipro.sales.main;

import java.util.*;

public class SalesApplication {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		char choice = 'y';
		
		System.out.println("Which operation do you wish to perform?");
		
		do
		{
			System.out.println("1. Insert Stock \n2. Delete Stock \n3. Insert Sales\n4. View Sales Report \n");
			System.out.print("Enter the operation you want to perform : ");
			int op = obj.nextInt();
			switch (op)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default :
				System.out.println("\nSelect from choices listed below.\n");
				continue;
			}
			System.out.print("\nDo you wish to perform any other operation? ");
			choice = obj.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		
		System.out.println("\nOK, Bye!");
		
		obj.close();

	}

}

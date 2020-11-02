package com.wipro.sales.dao;

import java.util.*;

public class SalesDao {
	
	static int insertSales(Sales sales)
	{
		int t=0;
		try
		{
			ps=con.prepareStatement("insert into TBL_SALES values ?,?,?,?,?");
			ps.setString(1, sale.getsalesID());
			ps.setDate(2, (Date) sale.getsalesDate());
			ps.setString(3, sale.getproductID());
			ps.setInt(4, sale.getquantitySold());
			ps.setDouble(5, sale.getsalesPrice());
			t = ps.executeUpdate();
		}
		catch(Exception e)
		{
		   System.out.print(e);
		}
		return t;
	}
	
	static String generateSalesID(Date salesDate)
	{
		
	}
	
	static ArrayList<SalesReport> getSalesReport()
	{
		
	}
	

}

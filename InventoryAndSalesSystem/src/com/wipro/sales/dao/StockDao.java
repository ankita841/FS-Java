package com.wipro.sales.dao;

import com.wipro.sales.bean.*;
import com.wipro.sales.util.DBUtil;

import java.sql.*;

public class StockDao {
	PreparedStatement ps;
	Connection con;
	
	public int insertStock(Product sales)
	{
		con = DBUtil.getDBConnection();
		try
		  {
			  ps = con.prepareStatement("INSERT into TBL_SALES values (?, ?, ?, ?, ?)");
			  ps.setString(1, sales.getProductID());
			  ps.setString(2,  sales.getProductName());
			  ps.setInt(3,  sales.getQuantityOnHand());
			  ps.setDouble(4,  sales.getProductUnitPrice());
			  ps.setInt(5, sales.getReorderLevel());
			  ps.executeUpdate();
			  return 1;
		  }
		  catch (Exception e)
		  {
			  e.printStackTrace();
		  }
		return 0;
	}
	
	public String generateProductID(String productName)
	{
		try
		{
			 ps = con.prepareStatement("select SEQ_PRODUCT_ID.nextval from dual");
			  ResultSet rs = ps.executeQuery();
			  if (rs.next())
				  return productName.substring(0, 2) + rs.getInt(1);			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public int updateStock(String productID, int soldQty) throws Exception
	{
		con = DBUtil.getDBConnection();
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery("SELECT * from TBL_STOCK where productID='" + productID + "'");
	    int value = rs.getInt("quantityOnHand") - soldQty;
	    String record = "UPDATE TBL_STOCK SET quantityOnHand='" + value + "'WHERE productID='" + productID + "'";
	    if(st.executeUpdate(record) == 1) {
	      return 1;
	    }
	    return 0;
	}
	
	Product getStock(String productID) throws Exception
	{
		Product stock = new Product();
		con = DBUtil.getDBConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM TBL_STOCK WHERE productID='" + productID + "'");
	    stock.setProductID(rs.getString("productID"));
	    stock.setProductName(rs.getNString("productName"));
	    stock.setQuantityOnHand(rs.getInt("quantityOnHand"));
	    stock.setProductUnitPrice(rs.getDouble("productUnitPrice"));
	    stock.setReorderLevel(rs.getInt("reorderLevel"));
		return stock;
	}
	
	public int deleteStock(String productID)
	{
		try
		{
			ps = con.prepareStatement("DELETE from TBL_STOCK where product_id=?");
			ps.setString(1, productID);
			ps.executeQuery();
			return 1;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

}

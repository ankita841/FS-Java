package test;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		String uname=req.getParameter("username");
		PrintWriter out=res.getWriter();
		out.println("Welcome, "+uname + "!");
		
		
	}
}
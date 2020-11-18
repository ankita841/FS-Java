package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
		{
			// TODO Auto-generated method stub	
		
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		
		if(uname.equalsIgnoreCase("ankita") && pwd.equals("12345"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("harshit");
			rd.forward(req,res);
		}
		else
		{
			PrintWriter out=res.getWriter();
			out.println("User name or password is incorrect");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req,res);
			
		}
		
		}
		
	

}
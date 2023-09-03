package com.jsp.fApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.mysql.cj.xdevapi.Statement;

@WebServlet("/pro")
public class ProductDetails extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	 int pno = Integer.parseInt(req.getParameter("pn"));
	 String pname = req.getParameter("pnm");
	 String pqty = req.getParameter("pt");
	 String PPrice = req.getParameter("prs");
	 
	 PrintWriter out = res.getWriter();
	 out.println("<html>"+"<body bgcolor='blue'>"+"<h1>user details:->"+pname+ "from"+pqty+
			 "</h1></body></html>"
			 );
	 
	 try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("load & register driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		System.out.println("connection established");
		
	PreparedStatement pstmt	=   con.prepareStatement("insert into product.info values(?,?,?,?)");
	pstmt.setInt(1, pno);	
	pstmt.setString(2, pname);
	pstmt.setString(3, pqty);
	pstmt.setString(4, PPrice);
	pstmt.executeUpdate();
	} catch (Exception e) {
		// TODO Auto-generated catch block 
		System.out.println("hey");
	}
		
	}
	


	

}

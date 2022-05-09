package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcOper
 */
@WebServlet("/CalcOper")
public class CalcOper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcOper() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out=response.getWriter();
	double num1=Double.parseDouble(request.getParameter("n1"));
	double num2=Double.parseDouble(request.getParameter("n2"));
	String bu=request.getParameter("op");
	/**if(bu.equals("add"))
	{
		double sum=num1+num2;
		out.println("sum of two number is:"+sum);
	}
	else if(bu.equals("sub"))
	{
		double sub=num1-num2;
		out.println("sub of two number:"+sub);
	}
	else if(bu.equals("mul"))
	{
		double mul=num1*num2;
		out.println("mul number is:"+mul);
	}
	else if(bu.equals("div"))
	{
		double div=num1/num2;
		out.println("div number is:"+div);
	}
	else
	{
		out.println("clear the calcultor operation");
	}
	**/
     switch(bu)
     {
     case ("add"):double sum=num1+num2;
		out.println("sum of two number is:"+sum);
		break;
     case("sub"):double sub=num1-num2;
		out.println("sub of two number:"+sub);
		break;
     case("mul"):double mul=num1*num2;
		out.println("mul number is:"+mul);
		break;
     case("div"):double div=num1/num2;
		out.println("div number is:"+div);
		break;
		default:out.println("clear");
     }
	
	}

}

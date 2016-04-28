package org.asmod.earproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.ejb.SessionBean;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.asmod.earproject.SomeSessionBean;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/servlet") //http://localhost:8080/Webprj/servlet
public class SomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SomeServlet() {
    }

	
    @EJB
    SomeSessionBean someSessionBean;
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering Servlet doGet method");
		
		PrintWriter out = response.getWriter();
		out.println(someSessionBean.someSessionBeanMethod());
		
		out.append("Served at: ").append(request.getContextPath());		
		System.out.println("Exiting Servlet doGet method");
	}

}

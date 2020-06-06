package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Employee;

import com.ahmed.factory.EmployeeServiceFactory;
import com.ahmed.service.EmployeeService;

/**
 * Servlet implementation class addEmployeeServlet
 */
@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LogManager.getLogger(AddEmployeeServlet.class);
	
	EmployeeService empService;
	public AddEmployeeServlet() {
		empService = EmployeeServiceFactory.create();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher v =  request.getRequestDispatcher("addEmployeeForm.jsp");
		v.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		String mail = request.getParameter("email");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		Employee e = new Employee();
		e.setName(name);
		e.setPassword(pass);
		e.setEmail(mail);
		e.setGender(gender);
		e.setCountry(country); 
		
		int num=0;
		try{
			  num = empService.save(e);
				if (num > 0) {
					logger.info("Employee Added Successfully",e);
					response.sendRedirect("EmployeeAdded.jsp");
				} else {
					logger.error("Error Adding",e);
					response.sendRedirect("EmployeeFailed.jsp");
				}
		} catch(Exception ee) {
//			System.out.println(ee.getMessage());
			logger.error("Error Adding",e,ee);
			request.setAttribute("message",ee.getMessage());
			RequestDispatcher v =  request.getRequestDispatcher("addEmployeeForm.jsp");
			v.forward(request, response);
			
			ee.printStackTrace();
		}
		


	
	}

}

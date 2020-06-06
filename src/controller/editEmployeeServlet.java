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

import com.ahmed.dao.impl.EmployeeDaoImpl;
import com.ahmed.factory.EmployeeServiceFactory;
import com.ahmed.service.EmployeeService;
import com.ahmed.service.impl.EmployeeServiceImpl;

import model.Employee;


/**
 * Servlet implementation class editEmployeeServlet
 */
@WebServlet("/editEmployee")
public class editEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LogManager.getLogger(AddEmployeeServlet.class);
	EmployeeService empService;
 
    public editEmployeeServlet() {
        super();
        empService= EmployeeServiceFactory.create();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idd = request.getParameter("id");
		int id = Integer.parseInt(idd);
		
		Employee e = new Employee();
		
		try {
			
			e = empService.getRecordsById(id);
			
		} catch (Exception e1) {
			logger.error("Employee Edit Failed",e,e1);
			response.sendRedirect("errorPage.jsp");
			e1.printStackTrace();
		}
		request.setAttribute("edit", e);
		 
		 RequestDispatcher v  = request.getRequestDispatcher("editEmployee.jsp");
		 v.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idd = request.getParameter("id");
		int id = Integer.parseInt(idd);
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		String mail = request.getParameter("email");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setPassword(pass);
		e.setEmail(mail);
		e.setGender(gender);
		e.setCountry(country);
		 try {
			empService.update(e);
			logger.info("Employee Edit Successfully",e);
		} catch (Exception e1) {
			logger.error("Employee Edit Failed",e,e1);
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		response.sendRedirect("viewEmployee");
	}

}

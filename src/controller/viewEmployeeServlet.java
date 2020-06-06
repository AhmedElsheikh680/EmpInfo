package controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class viewEmployeeServlet
 */
@WebServlet("/viewEmployee")
public class viewEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LogManager.getLogger(AddEmployeeServlet.class);
	EmployeeService empService;
	
    public viewEmployeeServlet() {
        super();
        empService = EmployeeServiceFactory.create();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> list;
		try {
			list = empService.getAllRecords();
			
			request.setAttribute("employeeList", list);
			RequestDispatcher v =  request.getRequestDispatcher("viewEmployee.jsp");
			v.forward(request, response);
		} catch (Exception e) {
			logger.error("Employee  Viewing",e);
			response.sendRedirect("errorPage.jsp");
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

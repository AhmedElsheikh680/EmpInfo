package controller;

import java.io.IOException;

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
 * Servlet implementation class deleteEmployeeServlet
 */
@WebServlet("/deleteEmployee")
public class deleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LogManager.getLogger(AddEmployeeServlet.class);
	EmployeeService empService;
	
  
    public deleteEmployeeServlet() {
        super();
        empService= EmployeeServiceFactory.create();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idd = request.getParameter("id");
		int id = Integer.parseInt(idd);
		Employee e = new Employee();
		e.setId(id);
		try {
			empService.delete(e);
			logger.info("Employee Deleted Successfully",e);
		} catch (Exception e1) {
			logger.info("Employee Deleted Failed",e,e1);
			response.sendRedirect("errorPage.jsp");
			e1.printStackTrace();
		}
		response.sendRedirect("viewEmployee");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

SecondServlet:
--------------
package text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/second")
public class SecondServlet extends GenericServlet {

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		//res.setContentType("text/html");
		res.setContentType("text/html");
		String fName=req.getParameter("fn");
		String lName=req.getParameter("lname");
		pw.println("FirstName:"+fName);
		pw.println("LastName:"+lName);
		

	}

}
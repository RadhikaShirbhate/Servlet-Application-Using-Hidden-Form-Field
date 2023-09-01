FirstServlet
------------
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
@WebServlet("/first")
public class FirstServlet extends GenericServlet{

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String fName=req.getParameter("fname");
		PrintWriter pw=res.getWriter();
		//res.setContentType("text/html");
		pw.println("<html><body><form action=second method=post>");
		pw.println("LastName:<input type=text name=lname>");
		pw.println("<input type=hidden name=fn value="+fName+">");
		pw.println("<input type=submit value=submit>");
		pw.println("</form></body></html>");
		
	}

}
package hu.ak_akademia.webgreeding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		out.print("Hello there " + (lastName == null ? "" : lastName) + " " + (firstName == null ? "" : firstName) + "!");
		out.print("<br />");
		out.print("<a href=\"" + request.getContextPath() + "\">Vissza</a>");
	}

}

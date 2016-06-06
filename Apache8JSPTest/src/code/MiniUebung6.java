package code;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class MiniUebung6
 */
public class MiniUebung6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MiniUebung6() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		HttpSession session = request.getSession();
//		
//		String action = request.getParameter("action");
//		
//		if (action == null) {
//			generateHTML(response, "", "", "", "");
//		} else 		
//			if (action.equals("Absenden")) {
//				Person p = new Person(
//						request.getParameter("name"),
//						request.getParameter("vorname"),
//						request.getParameter("adresse")
//						);
//				session.setAttribute("person", p);
//				generateHTML(response, "", "", "", "Person wurde gespeichert.");
//		} else
//			if (action.equals("Wiederherstellen")) {
//				Person p = (Person) session.getAttribute("person");
//				if (p == null) 
//					generateHTML(response, "", "", "", "Keine Person gespeichert.");
//				else
//					generateHTML(response, p.name, p.vorname, p.adresse, "Person wiederhergestellt.");
//		}
//	}

//	private void generateHTML(HttpServletResponse response, String name,
//			String vorname, String adresse, String message) {
//		PrintWriter pw;
//		try {
//			pw = response.getWriter();
//
//			pw.println("<!DOCTYPE html>");
//			pw.println("<html>");
//			pw.println("<head>");
//			pw.println("<meta charset='ISO-8859-1'>");
//			pw.println("<title>Insert title here</title>");
//			pw.println("</head>");
//			pw.println("<body>");
//
//			pw.println("<form action='http://localhost:8080/Apache8JSPTest/MiniUebung6' method='post'>");
//			pw.println("<table>");
//			pw.println("<tr>");
//			pw.println("<td>Name:</td>");
//			pw.println("<td><input type='text' name='name' size='30' value='"
//					+ name + "'/></td>");
//			pw.println("</tr>");
//			pw.println("<tr>");
//			pw.println("<td>Vorname:</td>");
//			pw.println("<td><input type='text' name='vorname' size='30' value='"
//					+ vorname + "'/></td>");
//			pw.println("</tr>");
//			pw.println("<tr>");
//			pw.println("<td>Adresse:</td>");
//			pw.println("<td><input type='text' name='adresse' size='30' value='"
//					+ adresse + "'/></td>");
//			pw.println("</tr>");
//			pw.println("<tr>");
//			pw.println("<td><input type='submit' name='action' value='Absenden'/></td>");
//			pw.println("<td><input type='submit' name='action' value='Wiederherstellen'/></td>");
//			pw.println("</tr>");
//			pw.println("</table>");
//			pw.println("</form>");
//			pw.println(message);
//
//			pw.println("</body>");
//			pw.println("</html>");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}


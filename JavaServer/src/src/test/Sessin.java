package src.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sessin
 */
@WebServlet("/Sessin")
public class Sessin extends HttpServlet {
	private static final long serialVersionUID = 3L;
	
	HttpSession session;
	sessionPerson person;

	public class sessionPerson{

		public sessionPerson(String name, String firstName, String address) {
			super();
			this.name = name;
			this.firstName = firstName;
			this.address = address;
		}
		
		public String name;
		public 	String firstName;
		public String address;
		
	}
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sessin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		session = request.getSession();
		session.setMaxInactiveInterval(600);
		
		String action = request.getParameter("action");
		
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		
		
		String firstNameResponse="";
		String nameResponse="";
		String addressResponse="";
		
		
		switch(action){
		
		
		case "send":
		firstNameResponse = request.getParameter("firstname");
		nameResponse = request.getParameter("name");
		addressResponse = request.getParameter("address");
		person = new sessionPerson(firstNameResponse,nameResponse,addressResponse);
		session.setAttribute("person", person);

		break;	
		
		case "restore":
		
		this.person = (sessionPerson) session.getAttribute("person");	
		firstNameResponse = person.firstName;
		nameResponse = person.name;
		addressResponse = person.address;
		break;
			
			
		case "reset":
		
		this.person = null;
		
		firstNameResponse = "";
		nameResponse = "";
		addressResponse = "";
		
		session.setAttribute("person",new sessionPerson(firstNameResponse,nameResponse,addressResponse));
		break;

		}
		
		
		
		

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		
		PrintWriter out = response.getWriter();
		
		
		out.println(
				
				"<!DOCTYPE html>"+
				"<html>"+
				"<head>"+
				"<meta charset=\"utf-8\">"+
				"<title>Rekt M8</title>"+
				"</head>"+
				"<body>"+
				"<h1>"+
				"session servlet"+
				"</h1>"+
				"<form action=\"http:\\\\localhost:8080/JavaServer/Sessin\" method=\"post\">"+


				"Name"+
				"<input name=\"name\" type=\"text\" value=\""+  nameResponse +"\"/>"+
				"<br>"+
				"Vorname"+
				"<input name=\"firstname\" type=\"text\" value=\""+  firstNameResponse +"\"/>"+
				"<br>"+
				"Adresse"+
				"<input name=\"address\" type=\"text\" value=\""+  addressResponse +"\"/>"+

				"<br>"+
				"<input type=\"submit\" name=\"action\" value=\"reset\"/>"+
				"<input type=\"submit\" name=\"action\" value=\"send\"/>"+
				"<input type=\"submit\" name=\"action\" value=\"restore\"/>"+
				"</form>"+"</body>"+"</html>"		

		);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

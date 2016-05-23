package src.test;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadInitParams
 */
@WebServlet("/ReadInitParams")
public class ReadInitParams extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private static String name;
	private static String date;
	
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadInitParams() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getInitParameter(String name) {
		// TODO Auto-generated method stub
		return super.getInitParameter(name);
	}

	@Override
	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return super.getInitParameterNames();
	}




	@Override
	public void init() throws ServletException {
		System.out.println("init");
		this.name = this.getServletConfig().getInitParameter("devName");
		this.date = this.getServletConfig().getInitParameter("todayDate");
		super.init();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		init();
		
		System.out.println(this.name);
		System.out.println(this.date);
		

		
		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();
		
		
		out.println(
		"<HTML>\n" +
		"<HEAD><TITLE>ReadInitParams</TITLE>\n" +
		"</HEAD>\n" +
		"<BODY>\n" +
		"<H1>ReadInitParams</H1>\n" +
		"DeveloperName is"+name+
		"Today is"+date+
		"</BODY>\n" + 
		"</HTML>"
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

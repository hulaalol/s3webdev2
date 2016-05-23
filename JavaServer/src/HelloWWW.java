
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HelloWWW")
public class HelloWWW extends HttpServlet {
public void
doGet(HttpServletRequest request,
HttpServletResponse response)
throws
ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println(
"<HTML>\n" +
"<HEAD><TITLE>Hello WWW</TITLE>\n" +
"</HEAD>\n" +
"<BODY>\n" +
"<H1>Hallo Welt!!</H1>\n" +
"</BODY>\n" + 
"</HTML>"
);
}
}

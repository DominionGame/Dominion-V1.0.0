import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8080/Dominion/DominionServlet

public class DominionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println(""
				+ "	<html>"
				+ "		<body>"
				+ "			<h1>"
				+ "				WELCOME TO DOMINION"
				+ "			</h1>"
				+ "			<h2>"
				+ "				~~~~~~~~ Press start to puree ~~~~~~~~"
				+ "			</h2>"
				+ "		</body>"
				+ "	</html>");
		System.out.println("ik heb gewerkt...");
	}
}
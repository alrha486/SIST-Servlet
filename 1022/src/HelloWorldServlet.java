import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		
				out.println("<!DOCTYPE html>");
				out.println("<html lang='en'>");
				out.println("<head>");
				out.println("<meta charset='UTF-8'>");
				out.println("<meta name='viewport' content='' width='' ");
				out.println(", initial-scale=1.0'>");
				out.println("<meta http-equiv='X-UA-Compatible' content='ie=edge'>");
				out.println("<title>Document</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h2>Welcome!!! 접속시간 : " + new Date() + "</h2>");
				out.println("		</body>");
				out.println("</html>");
				
		out.close();
	}
}

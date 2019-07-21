package url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParameterTest")
public class ParameterTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		req.setCharacterEncoding("utf-8");
		System.out.println(req.getParameter("name"));
		out.println("刚才获取到的值是："+req.getParameter("name")+"<br>");
		out.println("刚才获取到的值是："+req.getParameter("name2")+"<br>");
		out.println("刚才获取到的值是："+req.getParameter("name3")+"<br>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

	
}

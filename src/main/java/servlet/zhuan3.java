package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/zhuan3")
public class zhuan3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String passwd=req.getParameter("passwd");
		System.out.println("name="+name+"  passwd="+passwd);
		String name2=(String) req.getAttribute("name");
		String passwd2=(String) req.getAttribute("passwd");
		System.out.println("name2="+name2+"  passwd2="+passwd2);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	
}

package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//get post head put del options
//restful请求、接口
//contextpath  rootpath

//webwork--struts2  spring hibernate    springmvc
@WebServlet("/demohello")
public class DemoHelloWorldServlet extends HttpServlet {

	public String username;
	public String password;
	static int count=0; //线程不安全，会造成该计数器出现未知结果
	
	public void init() throws ServletException {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		System.out.println("doget---name" + req.getParameter("name"));
//		System.out.println("doget---age" + req.getParameter("age"));
		System.out.println("1count"+count++);
		  String username = req.getParameter("userName");
		  System.out.println("username"+username);
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("---dopost");
		  String username = req.getParameter("userName");
		  System.out.println("username"+username);
	}
}

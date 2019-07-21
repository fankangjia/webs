

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

/**
 * Servlet implementation class MyServlet
 * servlet生命周期，服务器启动（配置了load_on_startip为1）或者第一次有servlet请求的时候初始化，在服务器关闭时销毁
 * servlet由servlet容器来启动 init（）初始化方法 destory（）方法均只执行一次
 * !!另外注意，servlet需要在web.xml中定义！！每写一个都需要
 * !!另外注意，在servlet3.0也就是tomcat7以后还支持注解的形式，也就是不需要写web.xml了！！！感觉方便了不少
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	public void destroy() {
		System.out.println("destory");
	}


	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.getWriter().append("接收到的数据        ")
			.append("姓名："+request.getParameter("name")).append("   年龄："+request.getParameter("age"));
//		HttpSession session=new HttpSession();
//		response.sendRedirect("/MyWebStudy/login.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}

package method;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Session是存储用户信息的一种机制，存储在服务器端
 * .默认情况下一个浏览器独占一个session
 * @author da_fa
 *
 */
@WebServlet("/sessiontest")
public class SessionTest extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		 resp.setCharacterEncoding("UTF=8");
	     resp.setContentType("text/html;charset=UTF-8");
	     //使用request对象的getSession()获取session，如果session不存在则创建一个
	     HttpSession session = req.getSession();
	     //将数据存储到session中
	     session.setAttribute("data", "孤傲苍狼");
	     //获取session的Id
	     String sessionId = session.getId();
	     //判断session是不是新创建的
	     if (session.isNew()) {
	         resp.getWriter().print("session创建成功，session的id是："+sessionId);
	     }else {
	         resp.getWriter().print("服务器已经存在该session了，session的id是："+sessionId);
	     }
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

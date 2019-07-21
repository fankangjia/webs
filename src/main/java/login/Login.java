package login;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conn.conn;
import myenum.UserEnum;

@WebServlet("/login")
public class Login extends HttpServlet {
//1.统计当前页面有多少个用户登录了系统,在页面显示用户活跃数
//2.统计今天一共有多少用户登录，在页面上显示昨天登陆的人数
	
	private static final long serialVersionUID = 1L;
	AtomicInteger in=new AtomicInteger(0);

	protected boolean isDenlu() {
		return false;
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		System.out.println("时间："+new Date());
		//单例模式可能线程不安全，所以要添加synchronized
		if (new conn().Login(req.getParameter("name"), req.getParameter("passwd"))) {
			//登录成功返回登录成功
			UserEnum.NN.addNumber();
			UserEnum.TN.addNumber();
//			if(idDenlu)
			req.setAttribute("islogin", true);
			resp.getWriter().append("登录成功欢迎!    ").append("当前登录本页面人数:")
			.append(Long.toString(UserEnum.NN.getNumber())).append("  今日登陆总人数： ")
			.append(Long.toString(UserEnum.TN.getNumber()));
			//resp.sendRedirect("/MyWebStudy/index.jsp");
		}else {
			//登录失败再跳转到登录界面
			resp.sendRedirect("/MyWebStudy/login.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
}

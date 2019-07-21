import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/toJsp")
public class toJsp extends HttpServlet {

	/**
	 * servlet跳转到jsp的方法找到两个
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//servlet跳转到jsp的方式有很多
		
		/**
		 * .只能在url中带parameter或者放在session中，无法使用request.setAttribute来传递
		 */
		resp.sendRedirect("/MyWebStudy/index.jsp");
		
		/**
		 * .页面的路径是相对路径。forward方式只能跳转到本web应用中的页面上。
		 * .跳转后浏览器地址栏不会变化。
		 * .使用这种方式跳转，传值可以使用三种方法：url中带parameter，session，request.setAttribute
		 */
//		RequestDispatcher dispatcher = req.getRequestDispatcher("/MyWebStudy/index.jsp");
//		dispatcher .forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}

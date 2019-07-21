package zhujie;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name="helloUser", urlPatterns={"/getUser","/userInfo"},loadOnStartup=1)
public class HelloUser extends HttpServlet{
    /**
	 * servlet使用注解的方式，感觉确实更方便一点，至少不用来回的翻文件了
	 */
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_USER="rzm";
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user=request.getParameter("user");
         
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer=response.getWriter();
        writer.append("<!DOCTYPE html>")
        .append("<html><head></head><body>")
        .append("用户是"+user)
        .append("</body></html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
}
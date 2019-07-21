package method;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieget")
public class CookiesGet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //1 通过Request对象获取请求中的Cookies
        Cookie[] cookies = req.getCookies();
        //2 判断请求中的Cookies是否存在
        if(cookies != null){
            //3 遍历所有Cookies
            for (Cookie cookie : cookies) {
                //4 获取每一个Cookies的名称
                String name = cookie.getName();
                //5 判断是否存在一个名为"lastvisit"的Cookie
                if(name.equals("lastvisit")){
                    // 如果存在,说明不是第一次访问,显示上次访问的时间.
                    out.println("<h1>你上次访问的时间是"+cookie.getValue()+"</h1>");
                }
            }
        }else{
            // 如果不存在,说明是第一次访问,显示欢迎信息.
            out.println("<h1>欢迎访问网站.</h1>");
        }
        
        // 创建用于显示最后一次访问时间的Cookie实例对象
        Cookie cookie = new Cookie("lastvisit", new Date().toString());
        // 将Cookie实例对象添加到Response对象中
        resp.addCookie(cookie);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
	

}

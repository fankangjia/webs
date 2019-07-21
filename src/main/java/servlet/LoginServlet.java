package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

/* String  username;//单例的成员变量，如果发生写操作，一定会造成线程不安全
*/
	//redirect 重定向   客户端转发 
	//forward 转发      服务端转发
	public void doGet (HttpServletRequest req,HttpServletResponse resp)
	throws ServletException, IOException
	{
		
			doPost( req,  resp);
	
			
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {

	    /*  InputStreamReader isr = new InputStreamReader (req.getInputStream(),"UTF-8");
	      BufferedReader br = new BufferedReader(isr);
	      String str;
	      while((str=br.readLine())!=null){
	    	  System.out.println(str);
	      }*/
	     req.setCharacterEncoding("UTF-8");
	     String username = req.getParameter("userName");
	     String premium = req.getParameter("premium");
	     String type = req.getParameter("type");
	      System.out.println(username+"时间："+new Date());
	      
	      HttpSession mySession = req.getSession(true);
/*	      mySession.setAttribute("orderno", UUID.randomUUID());
	      mySession.setAttribute("userName", username);
	      mySession.setAttribute("premium", premium);*/	  
	      PrintWriter prin = resp.getWriter();
	     
	        prin.print(UUID.randomUUID());
	           //forward 地址栏显示当前的url LoginServlet
	         /*  RequestDispatcher rd = null;
	           rd = req.getRequestDispatcher("/DemoHelloWorld");
	           rd.forward(req, resp);*/
	        
	        
	        //redirect  地址栏显示跳转后的url /DemoHelloWorld
	        
	        resp.sendRedirect(resp.encodeRedirectURL(req.getContextPath() + "/DemoHelloWorld"));
	    }
	
	
	   public void doPost1(HttpServletRequest req, HttpServletResponse resp)
		        throws ServletException, IOException
		    {

		    /*  InputStreamReader isr = new InputStreamReader (req.getInputStream(),"UTF-8");
		      BufferedReader br = new BufferedReader(isr);
		      String str;
		      while((str=br.readLine())!=null){
		    	  System.out.println(str);
		      }*/
		   req.setCharacterEncoding("UTF-8");
		     String username = req.getParameter("userName");
		      System.out.println(username+"时间："+new Date());
		      HttpSession mySession = req.getSession(true);
		   

		    }
	
	
	private static final long serialVersionUID = 1L;

}

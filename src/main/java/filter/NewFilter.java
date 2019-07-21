package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/*")
public class NewFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("哈哈哈，被我拦截到了");
		Object flag=request.getAttribute("islogin");
		if(flag!=null && (boolean)flag) {
			chain.doFilter(request, response);
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}

package myenum;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class OnLineCount implements HttpSessionListener{
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		UserEnum.NN.outNumber();
		System.out.println("登陆用户减少了一个！");
		
	}
}

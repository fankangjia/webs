package danli;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
    private static final long serialVersionUID = 1L;//单例模式就是所有对象共享变量的模式
    /**
     * servlet是单例模式 其内部定义的变量是所有用户共享的（多线程共享） 当一个用户改变了这个变量的值，其他用户访问得到的是改变之后的值
     * servlet中的变量最好放在map中 线程安全的map ConcurrentHashMap(),以sessionid为主键存放，这样每个用户(线程)都会有单独属于自己的一个值 
     *  a不会受到其他用户的影响
     */
    /**
     * a普通单例模式的定义：
     * 1.单例类只能有一个实例
     * 2.单例类必须自己创建自己的唯一实例
     * 3.单例类必须给所有其他对象提供这一实例
     * a这与上一篇博客的内容似乎有点冲突，分析servlet的特性，只初始化一次，服务器重启后才销毁，应该是暗含了只有一个实例的要求
     * a唯一的区别就是servlet本身是由servlet容器来创建的，我想这应该不是单例的重点。servlet根据定义似乎本来就是单例模式。。这点有点不太清楚
     */
    private long abc = 123;
    ThreadLocal<String> local = new ThreadLocal<String>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println(abc);
        abc = 134;
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}

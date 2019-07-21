
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.util.*;

//Session追踪

public class ShowSession extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Session Tracking Example";
		HttpSession session = request.getSession(true);
		String heading,heading2;
		// Use getAttribute instead of getValue in version 2.2.
		Integer accessCount = (Integer) session.getAttribute("accessCount");
		
		Integer accessCount2 = (Integer) request.getAttribute("accessCount2");
		if (accessCount == null) {
			accessCount = new Integer(0);
			heading = "Welcome, Newcomer";
		} else {
			heading = "Welcome Back";
			accessCount = new Integer(accessCount.intValue() + 1);
		}
		
		if (accessCount2 == null) {
			accessCount2 = new Integer(0);
			heading2 = "Welcome, Newcomer";
		} else {
			heading2 = "Welcome Back";
			accessCount2 = new Integer(accessCount2.intValue() + 1);
		}
		
		
		// Use setAttribute instead of putValue in version 2.2.
		session.setAttribute("accessCount", accessCount);
		
		request.setAttribute("accessCount2", accessCount2);

		out.println("<html><head><title>Session追踪</title></head>"
				+ "<BODY BGCOLOR=\"#FDF5E6\">\n" + "<H1 ALIGN=\"CENTER\">"
				+ heading + "</H1>\n"
				+ "<H2>Information on Your Session:</H2>\n"
				+ "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
				+ "<TR BGCOLOR=\"#FFAD00\">\n" + "  <TH>Info Type<TH>Value\n"
				+ "<TR>\n" + "  <TD>ID\n" + "  <TD>" + session.getId() + "\n"
				+ "<TR>\n" + "  <TD>Creation Time\n" + "  <TD>"
				+ new Date(session.getCreationTime()) + "\n" + "<TR>\n"
				+ "  <TD>Time of Last Access\n" + "  <TD>"
				+ new Date(session.getLastAccessedTime()) + "\n" + "<TR>\n"
				+ "  <TD>Number of Previous Accesses\n" + "  <TD>"
				+ accessCount + "\n" 
				
				+ "<TR>\n"
				+ "  <TD>Number of Previous Accesses(request)\n" + "  <TD>"
				+ accessCount2 + "\n" 
				
				+ "</TABLE>\n" + "</BODY></HTML>");

	}

	/** Handle GET and POST requests identically. */

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}

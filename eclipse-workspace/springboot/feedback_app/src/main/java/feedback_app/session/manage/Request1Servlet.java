package feedback_app.session.manage;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/servlet1")
public class Request1Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = "Rohit";
		String userId = "123";
		Cookie cookie = new Cookie("username", username);
		Cookie cookie1 = new Cookie("userId", userId);
		cookie.setMaxAge(10*60);
		cookie1.setMaxAge(10*60);
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		
		HttpSession session = req.getSession();
		session.setAttribute("userSecret", UUID.randomUUID().toString());
		
		session.setMaxInactiveInterval(10*60);
		
		
		ServletConfig servletConfig = getServletConfig();
		
		ServletContext servletContext = servletConfig.getServletContext();
		
		String appName = servletContext.getInitParameter("app_name");
		
		String userName = servletConfig.getInitParameter("userName");
		
		
		
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>Cookie Set Successfully</h1>");
		
		resp.getWriter().println("""
				
				<h1>Context Params : %s </h1>
				<h1>Init Params : %s </h1>
				
				""".formatted(appName, userName));
	}

	
}

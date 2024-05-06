package servlet_demo1;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import  jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet
{
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
     {
    	 String myemail = req.getParameter("email");
    	 String mypass = req.getParameter("pass1");
    	 
    	 PrintWriter out = resp.getWriter();
    	 
    	 if(myemail.equals("vaishnavibhatkar433@gmail.com")&& mypass.equals("vaishnavi1234"))
    	 {
    		 // req.setAttribute("name_key", "Vaishnavi Bhatkar");
    		 
    		 HttpSession session = req.getSession();
    		 session.setAttribute("name_key ","Vaishnavi Bhtakar");
    		 		
    		 		
    		  RequestDispatcher rd = req.getRequestDispatcher ("/profile.jsp");
			   rd.forward(req ,resp);
    	 }
    	 else
    	 {
    		 resp.setContentType("text/html");
    		 out.print("<h3 style='color:red'>Email id and password didnt matched<h3>");
    		 RequestDispatcher rd = req.getRequestDispatcher("/index.html");
    		 rd.include(req, resp);
    	 }
    }
}

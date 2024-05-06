package jsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/aaa")

public class My_Servlet extends HttpServlet
{
        @Override
        protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
        {
        	   PrintWriter out = resp.getWriter();
        	    out.println("Vaishnavi");
        	    
        	    HttpSession session = req.getSession();
                session.setAttribute("session_name" , "Smart Programming");

        }
}

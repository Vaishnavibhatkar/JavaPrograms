package sample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/aaa")
public class MyServlet extends HttpServlet {
	protected void service (HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException{
		System.out.println("Hello i am in side the service() method");
		PrintWriter out=resp.getWriter();
		out.print("Welcome");
	}

}

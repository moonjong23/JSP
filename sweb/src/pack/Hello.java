package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {// xml에 /korea.do mapping 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("success");  요청 리퀘스트 준다 리스폰스
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); //싱글톤
		out.println("<html><body>");
		out.println("<h1>가자 밥먹으러!!</h1>");
		out.println("</body></html>");
		out.close(); //자원 반납
	}
}




















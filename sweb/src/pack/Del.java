package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Del")
public class Del extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		ArrayList<Student> glist = (ArrayList<Student>)session.getAttribute("list");
		
		if(glist == null) glist = new ArrayList<Student>();   //상품정보를 담을 컬렉션 생성
		
		session.setAttribute("list", glist);  //세션에 상품이 컬렉션에 담겨 저장됨
		
		session.removeAttribute("list");
		response.sendRedirect("main.html");
	}

}

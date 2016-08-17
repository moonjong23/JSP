package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//각 클라이언트의 정보를 서버의 메모리에 저장
		HttpSession session = request.getSession(true);  //세션이 있으면 읽고, 없으면 생성
		//HttpSession session = request.getSession(false); //세션이 있으면 읽고, 없으면 생성안함
		session.setMaxInactiveInterval(10);   //10초간 유효. 없으면 기본 30분간 세션 유지.
		
		if(session != null) session.setAttribute("name", "홍길동");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("session id:" + session.getId());
		out.println("<br>사용자명:" + session.getAttribute("name"));
		out.println("</body></html>");
		out.close();
	}
	
}

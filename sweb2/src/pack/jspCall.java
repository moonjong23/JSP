package pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/irum.go")
public class jspCall extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String data = request.getParameter("data");
		
		//넘어온 자료로 이런저런일을 하다가
		
		//파일을 호출 방법1 : redirect - client를 통해 server에 있는 파일 호출
		response.sendRedirect("jspcall.jsp?data="+data);
		
		//파일을 호출 방법2 : forward - server에서 server에 있는 파일 호출
		//.setAttribute 키 밸류 값으로 저장할 수 있다. 밸류에는 객체까지도 저장가능
		//request.setAttribute("mydata", data +"안녕");
		//RequestDispatcher dispatcher = request.getRequestDispatcher("jspcall.jsp");
		//dispatcher.forward(request, response);
		//인자를 jspCall 서블릿의 서비스 메소드 request를 바로 전달하기 때문에 위에 처럼 query 스트링을 붙여줄 필요가 없다.
		
	}

}

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

@WebServlet("/View")
public class View extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String no = request.getParameter("no");
		String irum = request.getParameter("irum");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int cou = 0;
		
		//System.out.println(name + " " + price);
	
		HttpSession session = request.getSession(true);
		ArrayList<Student> glist = (ArrayList<Student>)session.getAttribute("list");
		
		if(glist == null) glist = new ArrayList<Student>();   //상품정보를 담을 컬렉션 생성
		
		glist.add(new Student(no, irum, kor, eng));
		session.setAttribute("list", glist);  //세션에 상품이 컬렉션에 담겨 저장됨
	
		response.setContentType("text/html;charset=utf-8");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<p><table width='80%' border='1'>");
		out.println("<tr><th>번호</th><th>이름</th><th>국어</th><th>영어</th><th>총점</th></tr>");
		for (int i = 0; i < glist.size(); i++) {
			Student student = glist.get(i);
			out.println("<tr><td>" + student.getNo() + "</td>");
			out.println("<td>" + student.getIrum() + "</td>");
			out.println("<td>" + student.getKor() + "</td>");
			out.println("<td>" + student.getEng() + "</td>");
			out.println("<td>" + (student.getKor() + student.getEng()) + "</td></tr>");
			cou++;
		}
		out.println("</table");
		
		out.println("<br>인원 수 :" + cou);
		out.println("<br><a href='shop/main.html'>새로입력</a>");
		out.println("<form action='Del' name='frm2' method='post'>");
		out.println("<input type='submit' value='세션삭제'>");
		out.println("</form>");
		out.println("</body></html>");
		out.close();
	}


}

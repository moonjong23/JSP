package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostData")
public class PostData extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>결과 확인(post)</h2>");
		
		
		
		String irum = request.getParameter("name");
		//System.out.println(irum);
		//String juso = request.getParameter("addr");
		//System.out.println(juso);
		String[] juso = request.getParameterValues("addr");
		//System.out.println(juso[0] + " " + juso[1]);
		out.println("이름은 " + irum + "<br>");
		out.println("주소는 " + juso[0] + "&nbsp;" + juso[1] + "<br>");
		
		
		//checkbox
		try {
			String[] lan = request.getParameterValues("lan");
			out.println("선택한 언어는 ");
			for(String la:lan){
				out.println(la + " ");
			}
		} catch (Exception e) {
			out.println("<b>하나 이상의 언어를 선택하시오</b>");
			return;
		}
		
		//radio
		
		String os = request.getParameter("os");
		out.println("<br>사용중인 운영체제는 " + os + "<br");
		
		//select
		String tr = request.getParameter("tr");
		out.println("<br>이용 중인 교통수단은 " + tr + "<br><br>");
		
		//hidden
		String edu = request.getParameter("edu");
		out.println("<br>교육센터 " + edu + "<br>");
		
		//textarea
		String suda = request.getParameter("suda");
		out.println("<br>잡담 " + suda + "<br>");
		
		
		out.println("<br><a href='postdata.html'>새로운 자료입력</a>");
		out.println("</body></html>");
		out.close();
		
	}
		
}

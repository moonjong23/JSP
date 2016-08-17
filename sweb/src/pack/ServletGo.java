package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kbs.mbc") //어노테이션
public class ServletGo extends HttpServlet {
	int num; 
	MyClass class1;
	
	public void init(ServletConfig config) throws ServletException {
		num = 0;
		class1 = new MyClass();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		num++;
		System.out.println("num : " + num);
		
		Thread th = Thread.currentThread();
		System.out.println("현재 스레드 명 : " + th.getName() + " /" + th);
		*/
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>ServletGo 수행됨</h1>");
		int a = 10, b = 20;
		out.println("a=" + a + ", b=" + b);
		int c = a + b;
		out.println("합은 " + c);
		out.println("메소드 수행 후 합은 " + calc(a, b));
		Calendar calendar = Calendar.getInstance();
		out.println("<br>" + calendar.get(calendar.YEAR) + "년");
		
		//MyClass class1 = new MyClass(); //싱글톤이나 전역변수로 객체를 만들자.
		
		String result = class1.msg("띠로링");
		
		out.println("MyClass" + MyClass.getInstance());
		MyClass myclass = MyClass.getInstance();
		
		out.println("<br>메시지는 " + result);
		class1.display(10, out);
		
		out.println("</body></html>");
		out.close();
	}
	
	private int calc(int m, int n){
		return m + n;
	}
}




















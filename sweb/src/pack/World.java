package pack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class World extends HttpServlet{
	@Override
	public void init() throws ServletException { //최초로 한번만 호출 된다. 해당 서블릿의 초기화담당
		System.out.println("초기화 1회 수행");
	}
	
	@Override
	public void destroy() { //종료시 한번만 호출된다.
		System.out.println("서비스 종료 시 1회 수행");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("안녕은 호출 시 매번 수행");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post 방식으로 호출 시 매번 수행");
	}
	/*
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException { 
		System.out.println("get post 방식을 모두 처리"); //jsp는 하나의 방식으로 겟 포스트를 처리 jsp자체가 메소드 서비스 메소드
	}
	*/
}






























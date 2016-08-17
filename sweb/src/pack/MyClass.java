package pack;

import java.io.PrintWriter;

public class MyClass {
	
	private static MyClass instance = new MyClass();
	
	public static MyClass getInstance(){
		return instance;
	}
	
	public String msg(String message){
		return message + " 반가워";
	}
	
	public void display(int n, PrintWriter out){
		int imsi = n + 10;
		out.println("imsi : " + imsi);
	}
}

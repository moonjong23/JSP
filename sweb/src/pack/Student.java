package pack;

public class Student {  //1개의 상품자료 저장용 Dto
	private String no, irum;
	private int kor, eng;
	
	public Student(String no, String irum, int kor, int eng) {
		this.no = no;
		this.irum = irum;
		this.kor = kor;
		this.eng = eng;
	
	}
	
	public String getNo() {
		return no;
	}
	
	public String getIrum() {
		return irum;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	

}

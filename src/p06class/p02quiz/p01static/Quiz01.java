package p06class.p02quiz.p01static;

public class Quiz01 {
	public static void main(String[] args) {
		
		double a1 = area(10);
		System.out.println(a1);
	}
	
	public static double area(double r) {
		// 원의 넓이를 구해서 리턴하는 메소드 완성
		// 반지름 * 반지름 * PI
		// java api 에서 Math 클래스를 검색해서
		// PI라는 static field를 사용하세요.
		
		return r * r * Math.PI;
	}
}

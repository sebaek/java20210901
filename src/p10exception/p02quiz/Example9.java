package p10exception.p02quiz;

import java.io.InputStreamReader;

public class Example9 {
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		method2();
	}

	private static void method2() {
		method3();
	}

	private static void method3() {
		InputStreamReader is = new InputStreamReader(System.in);
		
		is.close();
	}
	
}
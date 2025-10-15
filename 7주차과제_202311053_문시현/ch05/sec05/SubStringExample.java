package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);//0~6사이의 문자열출력
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);//7부터의 문자열 출력
		System.out.println(secondNum);

	}

}

package ch05.sec05;

public class IndexOfContaintsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);//위치
		String substring = subject.substring(location);//그 위치에 있는 문자열
		System.out.println(substring);
		
		location = subject.indexOf("자바");//-1이 아니면 자바라는 단어가 있다는 것
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
		boolean result = subject.contains("자바");//문자열이 포함되어 있는지만 조사
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}

	}

}

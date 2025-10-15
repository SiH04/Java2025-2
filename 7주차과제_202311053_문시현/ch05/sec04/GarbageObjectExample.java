package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;
		System.out.println("hobby: "+ hobby); //경고없애기용
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null; //null을 대입한다고 해서 String객체가 쓰레기가 되지는 않는다. kind2가 참조하고 있기 때문.
		System.out.println("kind2: " + kind2);

	}

}

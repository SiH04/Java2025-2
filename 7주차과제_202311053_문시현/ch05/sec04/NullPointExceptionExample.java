package ch05.sec04;

public class NullPointExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;//null은 아직 번지를 저장하고 있지 않다는 것이라 객체의 데이터나 메소드를 사용할 수 없다
		//intArray[0] = 10; //NullPointException
		
		String str = null;
		//System.out.println("총 문자수: " + str.length()); //NullPointException
		
		//경고방지용 null이출력됨
        System.out.println(intArray); 
        System.out.println(str);  

	}

}


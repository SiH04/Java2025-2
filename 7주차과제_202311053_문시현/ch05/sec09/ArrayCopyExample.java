package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "Java", "array", "copy"};//길이3
		String[] newStrArray = new String[5];//새로운 배열 길이5
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);//원본배열 0번째부터를 그 길이만큼 새로운 배열의 0번째로 복사
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ",");
		}

	}

}

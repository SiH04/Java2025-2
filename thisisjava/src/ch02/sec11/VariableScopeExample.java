package ch02.sec11;

@SuppressWarnings("unused")

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
	
		if(v1>10) {
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;//v2가지역변수라서사용할수없음//바깥에서 정의하면됨
	}

}

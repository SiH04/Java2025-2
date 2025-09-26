package ch04.team1;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료 ");
			System.out.println("-------------------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if (strNum.equals("1")) {//예금
				System.out.print("입금할 금액: "); //입금할 금액 받기
				int moneyin = Integer.parseInt(scanner.nextLine());
				money += moneyin;
				System.out.println("예금:" + money); //입금한 금액 표시
			}else if(strNum.equals("2")) {//출금
				System.out.println("출금할 금액: ");
				int moneyout = Integer.parseInt(scanner.nextLine());//출금 금액 받기
				if(money>= moneyout) { //크거나 같을 경우에만 출금
				money -= moneyout;
				} else{ //아닐 경우에는 수행하지 못하게
					System.out.println("잔액이 부족해 출금할 수 없습니다.");
					continue;
				}
				System.out.println("출금:" + money);
			} else if(strNum.equals("3")) {//잔고
				System.out.println("잔고:" + money);
			} else if(strNum.equals("4")) {
				run = false;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}

}

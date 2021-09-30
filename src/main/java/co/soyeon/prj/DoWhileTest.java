package co.soyeon.prj;

import java.util.Scanner;

public class DoWhileTest {
	private Scanner sc = new Scanner(System.in);
	
	private void mainMenu() {
		System.out.println("==================");
		System.out.println("== 1. 입력하기 ==");
		System.out.println("== 2. 수정하기 ==");
		System.out.println("== 3. 조회하기 ==");
		System.out.println("== 4. 종료하기 ==");
		System.out.println("==================");
		System.out.println("원하는 작업번호를 입력하세요.");
	}
	
	private void firstMenu() {
		System.out.println("=========================");
		System.out.println("==여기는 입력하는 화면입니다.==");
		System.out.println("==메인메뉴는 아무키나 누르세요.==");
		System.out.println("=========================");
		sc.nextLine();
	}
	
	private void secondMenu() {
		System.out.println("=========================");
		System.out.println("==여기는 수정하는 화면입니다.==");
		System.out.println("==메인메뉴는 아무키나 누르세요.==");
		System.out.println("=========================");
		sc.nextLine();
	}
	
	private void thirdMenu() {
		System.out.println("=========================");
		System.out.println("==여기는 조회하는 화면입니다.==");
		System.out.println("==메인메뉴는 아무키나 누르세요.==");
		System.out.println("=========================");
		sc.nextLine();
	}
	
	private void endMenu() {
		System.out.println("==== Good bye ====");
	}
	
	private void dowhileMenu() {
		boolean b = true; // 대부분 초기값은 false로 설정
		do {
			mainMenu();
			int key = sc.nextInt();
			sc.nextLine(); // 버퍼 클리어 역할
			switch(key) {
			case 1 :
				firstMenu();
				break;
				
			case 2 : 
				secondMenu();
				break;
				
			case 3 :
				thirdMenu();
				break;
				
			case 4 :
				endMenu();
				b = false; // 초기값 false라면 여기에는 true 넣어줘야함
				break;
			}
		} while(b); // 초기값 false를 설정했다면 (!b)로 설정
	}
	
	public void run() {
		dowhileMenu();
		sc.close();
	}

}

package co.soyeon.prj;

import co.soyeon.prj.Friend.CompanyFriend;
import co.soyeon.prj.Friend.Friend;
import co.soyeon.prj.Friend.SchoolFriend;

public class MainApp {
	public static void main(String[] args) {
//		DoWhileTest doWhileTest = new DoWhileTest();
//		doWhileTest.run(); // 정보은폐
		
//		Animal man = new Man(); // 동물 중에 사람이 있는데 Man으로 초기화한다는 것
//		man.run();
//		man.sleep();
		
//		Animal bird = new Bird();
//		bird.run();
//		bird.sleep();
		
//		Man man2 = new Man();
//		man.run();
//		man.sleep();
		
		Friend schoolFriend = new SchoolFriend();
		schoolFriend.name = "홍길동";
		schoolFriend.tel = "010-1111-1111";
		schoolFriend.address = "대구광역시 중구";
		schoolFriend.friendPrint();
		
		Friend comFriend = new CompanyFriend();
		comFriend.name = "홍길순";
		comFriend.tel = "010-2222-2222";		
		comFriend.address = "서울특별시 종로구";
		comFriend.friendPrint();
	}

}

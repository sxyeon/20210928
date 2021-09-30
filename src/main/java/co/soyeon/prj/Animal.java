package co.soyeon.prj;

public abstract class Animal { // 하나 이상의 abstract 메소드를 가지고 있거나 아니면 몸체가 비어있는 것을 추상 메소드라고 함 .. 
	                          //추상클래스는 인스턴스를 자기자신의 클래스로 생성 불가 .. Animal animal = new Animal(); 이거 불가능함
	public abstract void run();
	
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}

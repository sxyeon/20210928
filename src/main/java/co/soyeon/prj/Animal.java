package co.soyeon.prj;

public abstract class Animal { // �ϳ� �̻��� abstract �޼ҵ带 ������ �ְų� �ƴϸ� ��ü�� ����ִ� ���� �߻� �޼ҵ��� �� .. 
	                          //�߻�Ŭ������ �ν��Ͻ��� �ڱ��ڽ��� Ŭ������ ���� �Ұ� .. Animal animal = new Animal(); �̰� �Ұ�����
	public abstract void run();
	
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
}

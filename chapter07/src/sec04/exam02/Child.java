package sec04.exam02;

public class Child extends Parent{
	private String name;
	
	public Child() {
		//super();
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		//super();
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

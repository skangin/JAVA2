package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		  Child child = new Child();

		  Parent parent = child;
		  parent.method1();
		  parent.method2();
		  //parent.method3();  (호출 불가능)

		  Child child2 = (Child)parent;
		  child2.method3();
	}
}

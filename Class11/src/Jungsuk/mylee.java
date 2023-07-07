package Jungsuk;

public class mylee {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
		

	}

}

class Child3 extends Parent3 implements MyInterface1,MyInterface2{
	public void method1() {
		System.out.println("method(0 in Child3");
	}
}

class Parent3{
	public void Method2() {
		System.out.println("method2(0 in parent3");
	}
}
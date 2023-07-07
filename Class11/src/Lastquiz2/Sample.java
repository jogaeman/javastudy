package Lastquiz2;




public class Sample {

	public static void main(String[] args) {
		
		Rectangle rc = new Rectangle();
		Circle ci = new Circle();
		System.out.println(rc.calculateArea(5.0, 5.0));
		System.out.println(ci.calculateArea(2.0, 2.0));
		
		
		
		////생성된 객체들 2개를 arr이라는 객체에 넣으
		
		Shapeable[] arr = {rc,ci};
		
		
		
		

	}

}

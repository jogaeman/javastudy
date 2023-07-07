package pm;

public class RectangleHw {
	public static void main(String[] args) {
	
		Rectangle rec = new Rectangle(10.0,5.0);
		System.out.println(rec.getArea());
	
	}
}

class Rectangle{
	double width;
	double height;
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	double getArea() {
		return width * height;
	}
}



//사각형 클래스 작성
//
//사각형의 너비와 높이를 속성으로 가지며, 면적을 계산하는 메서드를 포함한 'Rectangle' 클래스를 작성해보세요.
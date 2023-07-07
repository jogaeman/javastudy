package pm;

public class LedExam {

	public static void main(String[] args) {
		
		//객체를 생성할때 인터페이스를 자료형으로 쓸 수 있다.
	//	TV tv = new LedTV();
		LedTV tv = new LedTV();
		tv.turnon();
		tv.chageVolumn(6);
		tv.chageChannel(39);
		tv.turnoff();

	}

}

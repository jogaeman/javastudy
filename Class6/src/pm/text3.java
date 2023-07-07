//문자열을 저장하는 클래스(StringHolder)를 작성하세요. 이 클래스는 문자열을 인스턴스 변수로 가지며,
//문자열을 반환하는 메서드(getText)와 문자열을 
//설정하는 메서드(setText)를 가지도록 합니다. 이후, 객체를 생성하고 문자열을 설정한 뒤, 
//설정한 문자열을 출력하는 프로그램을 작성하세요.



package pm;

public class text3 {

	public static void main(String[] args) {
		
		SH sh = new SH();
		
		sh.setText("Hello java!!");
		System.out.println(sh.getText());
	}

}

class SH{
	
	
	String text;
	
	String getText() {
		return this.text;
	}
	
	void setText(String text) {
		this.text = text;
	}
}



package am;

public class ExamIf {

	public static void main(String[] args) {
		
		//true /false는 반드시 소문자로만 사용한다 True/False 금지
	if (true) {
		System.out.println("true일 경우만 실행");
	}
	
	int no1 = 5;
	int no2 = 7;
	
	if(no1 < no2) {
		System.out.println("true일 경우만 실행");
	}
	if(no1<no2) System.out.println("true일 경우만 실행");
	
	
	String pass1 = "hello"; //Db의 암호
	String pass2 = "hi"; // 입력한 암호
	
	String uid1 = "guest";
	String uid2 = "guest";
	
	
	

	if(pass1.equals(pass2)){
	System.out.println("암호가 일치 합니다.");
	}else if(uid1.equals(uid2)) {
		System.out.println("아이디가 일치합니다.");
	}else {
		System.out.println("회원가입하세요.");
	}
	
	
	

	}
}


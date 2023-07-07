package am;

import java.util.HashMap;

public class ExamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap();
		
		//데이터 넣기 put
		
		
		map.put("제목","환영합니다"); // Map 데이터 넣기
		map.put("내용","신입생 환영회"); // Map 데이터 넣기
		map.put("작성자","과대"); // Map 데이터 넣기
		
		//데이터 꺼내기 get 
		
		System.out.println(map.get("제목"));
		System.out.println(map.get("내용"));
		System.out.println(map.get("작성자"));
		
		
		HashMap<String, Integer> grade = new HashMap();
		grade.put("홍길동", 80);
		grade.put("이몽룡", 75);
		grade.put("성춘향", 95);
	System.out.println(grade.get("홍길동"));
	System.out.println(grade.get("이몽룡"));
	System.out.println(grade.get("성춘향"));
	
	
	
	}

}

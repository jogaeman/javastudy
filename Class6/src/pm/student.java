package pm;

public class student {

		public static void main(String[] args) {
			
			// 기본 클래스 객체 생성
			Student student = new Student();
			student.name1();
			student.grade1();
		}

	}

	class Student{
		
		//멤버 변수
		String name;
		int grade;
		
		//멤버 매서드
		void name1() {
			System.out.println("lee");
		}
		void grade1() {
			System.out.println(3);
		}
	}
}

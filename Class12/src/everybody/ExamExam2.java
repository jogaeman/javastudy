package everybody;

public class ExamExam2 {

	public static void main(String[] args) {
		ExceptionQuiz ex = new ExceptionQuiz();
		try {
		int num = ex.get50ththItem(new int[30]);
		System.out.println("array 배열의 50번째 요소의 값 " + num);
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다. " +e.toString());
		}
	}

}

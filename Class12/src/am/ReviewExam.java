package am;

public class ReviewExam {

	public static void main(String[] args) {
		
		ReviewClass rc = new ReviewClass();
		ReviewMore rm = new ReviewMore();
		
		rc.polyexam();
		rm.etcexam();
		
		Review[] arr = {rc,rm};
	}

}

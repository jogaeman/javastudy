package am;

public class ExamWhile {

	public static void main(String[] args) {
		
		//for문은 반복 횟수가 확실할 때 주로 사용
		//while 문은 반복 횟수가 불확실 할때 주로 사용
		
//	while(true) { //무한반복
//		System.out.println("안녕하세요!!");
//	}

	
	int mnum = 0;
	
//	while(mnum < 5) {
//		System.out.println("안녕하세요!!!");
//		mnum++;  //mnum = mnum + 1; // mnum +=1;
//	}
//	
//	mnum = 0;
//	
//	
//	while(mnum <= 9) {
//		if(mnum % 2 == 1)
//			System.out.println(mnum);
//		mnum++;
//	}
	
	//continues는 건너뛰어 반복한다.
	mnum = 0;
	
	while(mnum <= 9) {
		mnum++;
		if(mnum % 2 == 0) 
			continue;
			
			
			System.out.println(mnum);
		}
	
	//break는 반복문을 강제 종료한다.
	
	mnum = 0;
	while(true) {
		mnum++;
		System.out.println(mnum);
		
		if(mnum >=  10) break;
	} 
	
	
	
	}
	
	
	}



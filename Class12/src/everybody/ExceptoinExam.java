package everybody;

public class ExceptoinExam {
public static void main(String[] args) {
	
	int i = 10;
	int j = 0;
	int k = divide(i,j);
	System.out.println(k);
	
}
public static int divide(int i, int j)throws ArithmeticException{
	int k = i/j;
	return k;
}
}

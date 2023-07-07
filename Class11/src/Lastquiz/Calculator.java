package Lastquiz;

public class Calculator implements Calculable {

	@Override
	public double caladd(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public double calsub(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public double calmul(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public double caldiv(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.caladd(5.0,3.0));
		System.out.println(cal.calsub(5.0,3.0));
		System.out.println(cal.calmul(5.0,3.0));
		System.out.println(cal.caldiv(5.0,3.0));
	}

}

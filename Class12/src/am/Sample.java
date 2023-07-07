package am;

class FoolException extends Exception {
}

public class Sample {
    public static void sayNick(String nick) throws FoolException{
        if("fool".equals(nick)) {
        	 throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        //Sample sample = new Sample();
    	try {
        sayNick("fool");
        sayNick("genious");
    	}catch(FoolException e){
    		System.out.println("FoolException이 발생했습니다");
    }
}
}
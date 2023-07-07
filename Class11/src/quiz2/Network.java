package quiz2;

public class Network implements Connectable {

	public static void main(String[] args) {
		Connectable connectable = new Connectable();
			


	
	}

	@Override
	public void connect() {
		System.out.println("디비에 연결했습니다");
		
	}

	@Override
	public void disconnect() {
		System.out.println("디비에 연결을 종료했습니다");
	}


}
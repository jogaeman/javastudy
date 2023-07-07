package pm;

public class LedTV implements TV {

	@Override
	public void turnon() {
		System.out.println("켜다");
	}

	@Override
	public void turnoff() {
		System.out.println("끄다");
	}

	@Override
	public void chageVolumn(int volumn) {
		System.out.println("볼륨을 조절한다");
	}

	@Override
	public void chageChannel(int channel) {
		System.out.println("채널을 변경한다");
	}

}

package pm;

public interface TV {

	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	public void turnon();
	public void turnoff();
	public void chageVolumn(int volumn);
	public void chageChannel(int channel);
}

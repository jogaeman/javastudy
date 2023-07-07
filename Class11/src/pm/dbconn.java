package pm;

public interface dbconn {

	//crud
	
	
	void create(String subject, String content, String Author);
	
	void readlist();
	
	void readdetail(int num);
	
	void update(int num,String subject, String content, String Author);
	
	void delete(int num);
	
}

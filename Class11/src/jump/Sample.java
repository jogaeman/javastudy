package jump;

public class Sample {

	public static void main(String[] args) {
	
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Croc croc = new Croc();
		
//		Predator tiger = new Tiger();
//		Predator lion = new Lion();
//		Predator croc = new Croc();
//		zookeeper.feed(tiger);
//		zookeeper.feed(lion);
//		zookeeper.feed(croc);
		
	Bouncer bouncer = new Bouncer();
	bouncer.baekAnimal(tiger);
	bouncer.baekAnimal(croc);
	bouncer.baekAnimal(lion);

	}

}

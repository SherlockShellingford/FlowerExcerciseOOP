package flowerSimulation;

public class LocalFlorist extends Person {
	RecieverFlorist _recieverFlorist;
	
	public LocalFlorist(String name, RecieverFlorist florist) {
		super(name);
		_recieverFlorist=florist;
	}
	requestFlowers(String flowers, Person addressee){
		_recieverFlowers.prepareFlowers(flowers, addressee);
	}
	
}

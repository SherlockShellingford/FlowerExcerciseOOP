package flowerSimulation;

public class FlowerCustomer extends Person {
	LocalFlorist _localFlorist;
	
	public FlowerCustomer(String name, LocalFlorist florist) {
		super(name);
		_localFlorist=florist;
	}



	public void requestFlowers(String flowers, Person addressee) {
	
		_localFlorist.requestFlowers(flowers, addressee);
	}

}

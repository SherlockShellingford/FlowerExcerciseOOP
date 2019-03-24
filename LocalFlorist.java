package flowerSimulation;

public class LocalFlorist extends Person {
	private RecieverFlorist _recieverFlorist;
	
	public LocalFlorist(String name, RecieverFlorist florist) {
		super(name);
		_recieverFlorist=florist;
	}
	requestFlowers(String flowers, Person addressee){
		System.out.println(""+this.getName()+" forwards order to "+addressee.getName()+"’s florist");
		_recieverFlowers.prepareFlowers(flowers, addressee);
	}
	
}

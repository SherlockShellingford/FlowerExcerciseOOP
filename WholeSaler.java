package flowerSimulation;

public class WholeSaler extends Person {
	private Grower _grower;
	public WholeSaler(String name, Grower grower) {
		super(name);
		_grower=grower;
	}
	public FlowerBouquet requestFlower(String flowers) {
		System.out.println(""+this.getName()+" forwards request to "+_grower.getName());
		_grower.requestFlowers(flowers);
	}


}

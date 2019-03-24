package flowerSimulation;

public class Gardener extends Person {
	
	public Gardener(String name) {
		super(name);
		
	}
	public FlowerBouquet PrepareBouquet(String flowers) {
		System.out.println(""+this.getName()+" prepares flowers");
		return new FlowerBouquet(flowers);
	}

}

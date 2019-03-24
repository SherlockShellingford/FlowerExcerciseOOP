package flowerSimulation;

public class Grower extends Person {
	private Gardener _gardener;
	public Grower(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public FlowersBouquet requestFlowers(String flowers) {
		System.out.println(""+this.getName()+" forwards request to "+_gardener.getName());
		_gardener=_gardener.prepareBouquet(flowers);
	}
	
}

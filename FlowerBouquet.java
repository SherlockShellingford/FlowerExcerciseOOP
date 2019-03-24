package flowerSimulation;

public class FlowerBouquet {
private String _flowers;
private boolean _isArranged;

public FlowerBouquet(String flowers) {
	_flowers=flowers;
}
public String getFlowers() {
	return _flowers;
}
public boolean GetArrangment() {
	return _isArranged;
}
public void SetArrangement(boolean arrange) {
	_isArranged=arrange;
}
}

package adapter;

public class BoatAdapterInheritance extends Boat implements Vehicle{

	@Override
	public void accelerate() {
		rowFaster();
		
	}

}

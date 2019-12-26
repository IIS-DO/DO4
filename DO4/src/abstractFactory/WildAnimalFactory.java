package abstractFactory;

public class WildAnimalFactory implements AnimalFactory{

	@Override
	public Animal createAnimal(String type) {
		switch(type) {
		case "dinosaur":
			return new Dinosaur();
		case "bear":
			return new Bear();
		default:
			return null;
		}
	}

}

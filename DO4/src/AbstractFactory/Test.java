package AbstractFactory;

public class Test {

	public static void main(String[] args) {
		AnimalFactory waf = FactoryForAnimalFactory.createAnimalFactory("wild");
		AnimalFactory daf = FactoryForAnimalFactory.createAnimalFactory("domestic");
		
		Animal cow = daf.createAnimal("cow");
		Animal dog = daf.createAnimal("dog");
		Animal dinosaur = waf.createAnimal("dinosaur");
		Animal bear = waf.createAnimal("bear");
		
		System.out.println(cow.goes());
		System.out.println(dog.goes());
		System.out.println(dinosaur.goes());
		System.out.println(bear.goes());
	}

}

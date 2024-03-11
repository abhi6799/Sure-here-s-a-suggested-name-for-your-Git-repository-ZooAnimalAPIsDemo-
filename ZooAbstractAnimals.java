package assignment2;

public class ZooAbstractAnimals {
	AbstractAnimalAPI animal;
	
	public ZooAbstractAnimals(AbstractAnimalAPI animal){
		this.animal = animal;
	}
	
	public String toString() {
		return animal.toString();
	}
}

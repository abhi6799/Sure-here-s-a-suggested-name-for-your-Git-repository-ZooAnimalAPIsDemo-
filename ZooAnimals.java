package assignment2;

public class ZooAnimals {
	AnimalAPI animal;
	//static AnimalAPI animal;
	
	public ZooAnimals(AnimalAPI animal){
		this.animal = animal;
	}
	
	public  String toString() {
		return animal.toString();
	}
	
	//down portion is not needed
//	public static void main(String [] args) {
//		//ZooObjectAnimals z = new ZooObjectAnimals(animal);
//		//demo("z");
//		ZooAnimals z = new ZooAnimals( new Herbi());
//		z.toString();
//	}
}

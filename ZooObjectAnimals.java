package assignment2;

public class ZooObjectAnimals {

	Object animal;
	
	public ZooObjectAnimals(Object animal){
		this.animal = animal;
	}
	
	public String toString() {
		return animal.toString();
	}
	
	public static void demo(Object animal) {
		ZooAnimals z = new ZooAnimals(new Herbi());
		z.toString();
		
	}
	
	
	public static void main(String [] args) {
		//ZooObjectAnimals z = new ZooObjectAnimals(animal);
		demo("z");
	}
}

	
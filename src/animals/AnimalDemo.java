package animals;

public class AnimalDemo {

	public static void main(String[] args) {
		// Animal animal = new Animal();
		
//		Cat cat = new Cat(); // child reference variable pointing to child object
//		cat.breathe(); // defined method in parent class
//		cat.mobility();// abstract method in parent class, defined/overidden in child class
//		cat.scratches();// extra method in the child class
//		
//		System.out.println("-------------------------");
//		Snake snake = new Snake(); // child reference variable pointing to child object
//		snake.breathe();
//		snake.mobility();
//		snake.sound();
//		
//		System.out.println("-------------------------");
//		//Cat animal1 = new Cat();
//		Animal animal1 = new Cat(); // parent reference variable pointing to child object
//									// under what scenarios do we code like this?
//									// do we have any restrictions in accessing the members of the 
//									// parent class and child class
//									// example to illustrate the purpose of this
//		
//		animal1.breathe();
//		animal1.mobility(); // dynamic/runtime polymorphism
//		//animal1.scratches();
//		
//		Animal animal2 = new Snake();
//		animal2.breathe();
//		animal2.mobility();
//		//animal2.sound();
//		
		Exhibition exihibition = new Exhibition();
		
//		Cat cat1 = new Cat();
//		exihibition.exihibitCat(cat1);
//		
//		Snake snake1 = new Snake();
//		exihibition.exihibitSnake(snake1);
//				
		
		
		// upcasting - implicit
		// downcasting - explicit
		
		Animal animal = new Cat(); // implicit upcasting
		Cat cat1 = (Cat)animal; // explicit downcasting
		Animal animal1 = cat1; // implicit upcasting
		
		exihibition.exihibit(animal);
	
		
		
		
	}

}

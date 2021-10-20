package animals;

public class Exhibition {

	
	public void exihibit(Animal animal) {
		animal.breathe();
		animal.mobility();
		
		// instanceof is an operator
		// instanceof returns true or false
		if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.scratches();
		}
		else if(animal instanceof Snake) {
			Snake snake = (Snake)animal;
			snake.sound();
		}
	}
//	public void exihibitCat(Cat cat) {
//		cat.breathe();
//		cat.mobility();
//		cat.scratches();
//	}
//	
//	public void exihibitSnake(Snake snake) {
//		snake.breathe();
//		snake.mobility();
//		snake.sound();
//	}
//	
	
	// 50 methods to exhibit 50 animals??
}

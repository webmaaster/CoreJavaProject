package ford;

import java.util.Iterator;

public class FigoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FordFigo fordFigo = new FordFigo(1234, "beige", 56789);
		fordFigo.unlock();
		fordFigo.switchOn();
		fordFigo.brakingSystem();;
		fordFigo.switchOff();
		fordFigo.lock();
		
		System.out.println("--------------------------------");
		FordFigoTitanium fft = new FordFigoTitanium(5678, "white", 999999);
		fft.unlock();
		fft.switchOn();
		fft.brakingSystem();
		fft.airbags();
		fft.switchOff();
		fft.lock();
		
		FordFigoTitanium fft1 = new FordFigoTitanium("black", 555555);
		
		// printStringln
		// printIntln
		// printBooleanln
		String msg = "hello";
		System.out.println(msg);
		
		int mark = 20;
		System.out.println(mark);
		
		boolean flag = true;
		System.out.println(flag);
		
		
		
		
		
		
	}

}

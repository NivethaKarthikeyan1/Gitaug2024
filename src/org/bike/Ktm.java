package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
       System.out.println("The cost of bike is 2L");		
	}

	@Override
	public void speed() {
        System.out.println("The speed is 170km/hr");		
	}
	public static void main(String args[]) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}

}

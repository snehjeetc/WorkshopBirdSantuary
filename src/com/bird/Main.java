package com.bird;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
		
		Bird parrot = new Parrot();
		Bird penguin = new Penguin();
		Bird duck = new Duck();
		try {
        birdSanctuaryManager.add(parrot);
		}
        catch(BirdSanctuaryManagerExceptions e) {
			e.printStackTrace();
		}
		try {
        birdSanctuaryManager.add(penguin);
		}
        catch(BirdSanctuaryManagerExceptions e) {
			e.printStackTrace();
		}
		try {
        birdSanctuaryManager.add(duck);
		}
        catch(BirdSanctuaryManagerExceptions e) {
			e.printStackTrace();
		}
		try {
        birdSanctuaryManager.add(null);
		}catch(BirdSanctuaryManagerExceptions e) {
			e.printStackTrace();
		}
		System.out.println("Before removal size: " + birdSanctuaryManager.getAllBirds().size());
		birdSanctuaryManager.remove(new Parrot());
        System.out.println("After removal size: " + birdSanctuaryManager.getAllBirds().size());
        
        birdSanctuaryManager.getAllFlyableBirds().forEach(c -> c.fly());
        birdSanctuaryManager.getAllSwimmableBirds().forEach(c -> c.swim());
        
        /*
        for (int i = 0; i < birds.size(); i++) {
        	if(birds.get(i) instanceof Flyable)
        		((Flyable) birds.get(i)).fly();
        	if(birds.get(i) instanceof Swimmable)
        		((Swimmable)birds.get(i)).swim();
            birds.get(i).eat();
        }
        */
	}

}

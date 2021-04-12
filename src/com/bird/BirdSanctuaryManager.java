package com.bird;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BirdSanctuaryManager {
	ArrayList<Bird> birds;
	
	public BirdSanctuaryManager() {
		birds = new ArrayList<>();
	}
	
	public void add(Bird b) throws BirdSanctuaryManagerExceptions{
		if(b == null)
			throw new BirdSanctuaryManagerExceptions("Null value not allowed", 
					BirdSanctuaryManagerExceptions.ExceptionType.NULL_TYPE);
		birds.add(b);
	}
	
	public void remove(Bird b) {
		birds.remove(b);
	}
	
	public ArrayList<Bird> getAllBirds() {
		return birds;
	}
	
	public ArrayList<Flyable> getAllFlyableBirds() {
		return new ArrayList<Flyable>(birds.stream().filter(b -> b instanceof Flyable)
				 	.map(b -> (Flyable)b)
					.collect(Collectors.toList()));
	}
	
	public ArrayList<Swimmable> getAllSwimmableBirds() {
		return new ArrayList<Swimmable>( birds.stream()
									.filter(b -> b instanceof Swimmable)
									.map(b -> (Swimmable)b)
									.collect(Collectors.toList()));
	}
	
	public boolean contains(Bird b) {
		return birds.contains(b);
	}
	
}

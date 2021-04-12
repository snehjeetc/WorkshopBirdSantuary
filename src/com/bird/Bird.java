package com.bird;

public abstract class Bird {
	String birdName;
    public abstract void eat();
    public abstract void showName();
    @Override
    public boolean equals(Object o) {
    	if(o == this)
    		return true;
    	if(!(o instanceof Bird))
    		return false;
    	Bird bird = (Bird) o;
    	return bird.birdName.equals(this.birdName);
    }
}

interface Flyable {
	void fly();
}

interface Swimmable{
	void swim();
}

class Parrot extends Bird implements Flyable {
    public Parrot() {
    	 super.birdName = "Parrot"; 
    }
	
	@Override
    public void fly() {
        System.out.println("Parrot fly");
    }

    @Override
    public void eat() {
        System.out.println("Parrot eat");

    }
    
    @Override
    public void showName() {
    	System.out.println(super.birdName);
    }
}

class Penguin extends Bird implements Swimmable {

	public Penguin() {
		super.birdName = "Penguin";
	}
	
    public void swim() {
        System.out.println("Penguin swim");
    }

    @Override
    public void eat() {
        System.out.println("penguin eat");

    }
    
    @Override
    public void showName() {
    	System.out.println(super.birdName);
    }
}
class Duck extends Bird implements Flyable, Swimmable {

	public Duck() {
		super.birdName = "Duck";
	}
	
    @Override
    public void fly() {
        System.out.println("duck fly");
    }
    
    @Override
    public void swim() {
    	System.out.println("duck swim");
    }
    
    @Override
    public void eat() {
    	System.out.println("duck eat");
    }
    
    @Override
    public void showName() {
    	System.out.println(super.birdName);
    }
}
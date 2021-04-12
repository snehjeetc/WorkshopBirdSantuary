package com.bird;

public class BirdSanctuaryManagerExceptions extends Exception {
	enum ExceptionType{
		NULL_TYPE;
	};
	private ExceptionType type;
	public BirdSanctuaryManagerExceptions(String message, ExceptionType type) {
		super(type.toString() + ": " + message);
		this.type = type;
	}

}

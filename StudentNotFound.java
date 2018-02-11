package Basics;

public class StudentNotFound extends RuntimeException {
	StudentNotFound(String errorMessage){
		super(errorMessage);
	}
}

package number;

import java.util.Random;

public class numbergame {
	
	

	int inputFromSystem;
	int inputFromUser;
	int count=0;
	
	//Generating random number in default constructor
	numbergame(){
		Random random=new Random();
		this.inputFromSystem=random.nextInt(100)+1;
	}
	
	//method to take user guesses
	public boolean takeUserInput() {
		if(count <10) {
			System.out.print(" guess the number :");
			this.inputFromUser=GuessTheNumber.takeIntegerInput(100);
			count++;
			return false;
		}
		else {
			System.out.println("oops  finised attempts ,better luck next time");
			return true;
			
		}
	}
	
	//method to check user guess status
	
	public boolean isCorrectGuess() {
		if(inputFromSystem==inputFromUser) {
			System.out.println("yeah we found : "+inputFromSystem+"in "+count+"  guesses ");
			switch(count) {
			case 1:
				System.out.println("the points are 100");
				break;
			case 2:
				System.out.println( "the points are 90");
				break;
			case 3:
				System.out.println("the  points are 80");
				break;
			case 4:
				System.out.println(" the points are 70");
				break;
			case 5:
				System.out.println("the points are 60");
				break;
			case 6:
				System.out.println("the  points are 50");
				break;
			case 7:
				System.out.println("the points are 40");
				break;
			case 8:
				System.out.println(" the  points are 30");
				break;
			case 9:
				System.out.println(" the points are 20");
				break;
			case 10:
				System.out.println("the points are 10");
				break;
			}
			System.out.println();
			return true;
		}
		else if(count < 10 && inputFromUser>inputFromSystem) {
			if(inputFromUser-inputFromSystem>10) {
				System.out.println("So High");
			}
			else {
				System.out.println("little High");
			}
		}
		else if(count<10 && inputFromUser<inputFromSystem) {
			if(inputFromSystem -inputFromUser >10) {
				System.out.println("too Low");
			}
			else {
				System.out.println(" Low");
			}
		}
		return false;
	}
}



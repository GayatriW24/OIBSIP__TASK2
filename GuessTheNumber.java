package number;
import number.numbergame;
import java.util.Scanner;
public class GuessTheNumber {
	public static int takeIntegerInput(int limit) {
		int inputs=0;
		boolean temp =false;
		
		while(!temp) {
			try {
				Scanner sc=new Scanner(System.in);
				inputs=sc.nextInt();
				temp=true;
				
				if(temp && inputs>limit ||inputs <1) {
					System.out.println("choose number between 1 to "+limit);
					temp=false;
					
				}
			}
			catch(Exception e) {
				System.out.println("Enter integer value only :");
				temp=false;
			}
		};
		return inputs;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//input for start the game
		System.out.println("1.Let's start the game \n2.Exit");
		System.out.println("Choose a number :");
		int choice =takeIntegerInput(2);
		int nextRounds=1;
		int roundNo=0;
		
		if(choice ==1) {
			//to check next round is there or not
			
			while(nextRounds ==1) {
				//creating object of Game class
				numbergame game=new numbergame();
				boolean isMatches =false;
				boolean isLimitCrosses=false;
				System.out.println("\nRound "+ ++roundNo + "status ...");
				
				//to check correct guess and limit cross
				while(!isMatches && !isLimitCrosses){
					isLimitCrosses =game.takeUserInput();
					isMatches =game.isCorrectGuess();
					
				}
				//input for next round
				System.out.println("1.Next Round \n2.Exit");
				System.out.println("choose number: ");
				nextRounds= takeIntegerInput(2);
				if(nextRounds != 1) {
					System.exit(0);
				}
			}
		}
		else {
			System.exit(0);
		}


	}

}

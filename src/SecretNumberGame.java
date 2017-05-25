import java.util.Random;
import java.util.Scanner;

public class SecretNumberGame {
	
	public static void main(String[] args)
	{
		boolean play=true;
		Random rand = new Random();
		Scanner player= new Scanner(System.in);
		while(play==true)
		{	
			boolean answer=false;
			int target=rand.nextInt(100);
			int count=0;
			while(answer==false)
			{	
				
				System.out.println("Please guess the secret number below (1-100), input -1 to play a new game, -2 to quit ");
				int guess=player.nextInt();
			
				if(-2>guess || guess>100)
				{

			    	System.out.println("The value you inputted is incorrect");
				}
				else if(guess==-2)
				{   
				    	play=false;
				    	answer=true;
				    	System.out.println("Have a good day!  Thanks for playing!");
				}
				else if(guess==-1)
				{
					answer=true;
					System.out.println("Awwww!  Hope you play better next game");
							
				}
				else if(guess>target) 
				{
					System.out.println("The value you inputted is higher than the secret number");
					count++;					
				}
				else if(guess<target) 
				{
					System.out.println("The value you inputted is lower than the secret number");
					count++;					
				}    
				else if(guess<target) 
				{
					System.out.println("The value you inputted is lower than the secret number");
					count++;					
				} 
				else if(guess==target) 
				{
					count++;
					System.out.println("The value you inputted is the secret number!  Congrats!");
					System.out.println("It took you "+ count+" turns to guess the number!");
					System.out.println("Have a good day!  Thanks for playing!");
					answer=true;
					
				}   
				
			}
			
		}
		player.close();
	}

}

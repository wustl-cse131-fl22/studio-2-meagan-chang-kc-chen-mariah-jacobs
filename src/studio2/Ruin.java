package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The amount of money that you start with");
		double startAmount = in.nextDouble();
		System.out.println("Win Limit?");
		double winLimit = in.nextDouble();
		System.out.println("Total games?");
		int totalGames = in.nextInt();
		System.out.println("The win probability, or the probability that you win a single play");
		double winChance = in.nextDouble(); 
		

		for(int i = 0; i < totalGames; i++)
		{
			double currentAmount = startAmount; 
			while (currentAmount < winLimit && currentAmount>0.0)
			{
				if (Math.random()<winChance) {
					currentAmount=currentAmount + 1.0; 
					//System.out.println("Congratulations! You won." + "$" + currentAmount);
				}
				else {
					currentAmount= currentAmount - 1.0;
					//System.out.println("You lost." + "$" + currentAmount);

				}
			}
		}
	}
}
		
	

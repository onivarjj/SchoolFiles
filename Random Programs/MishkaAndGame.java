import java.util.Scanner;

/**
*This program is will compute for the Mishka and game Problem 
* The problem is located at codeforces.com
* 703A - Mishka and Game
* Please visit the website for more info
*
*	@author Jacob C. Ravino
*	@version 1.2
*	@since 2016
*/

public class MishkaAndGame {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int ROUND = input.nextInt();
		int[][] score = new int[ROUND][2];
		
		for (int i = 0; i < ROUND; i++) {
			score[i][0] = input.nextInt();
			score[i][1] = input.nextInt();
		}
		input.close();
		fighting(score,ROUND);

	}
	
	private static void fighting(int points[][],int r){
		int m=0, c=0;
		for (int i = 0; i < r; i++) {
			if (points[i][0] > points[i][1])
				m++;
			else if (points[i][1] > points[i][0])
				c++;
		}
		if (m > c)
			System.out.println("Mishka");
		else if (c > m)
			System.out.println("Chris");
		else
			System.out.println("Friendship is magic!^^");

	}
	

}
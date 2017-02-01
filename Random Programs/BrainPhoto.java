import java.util.Scanner;
/**
*This program is will compute for the BrainPhoto Problem 
* The problem is located at codeforces.com
* 707A - Brain's Photos
* Please visit the website for more info
*
*	@author Jacob C. Ravino
*	@version 1.2
*	@since 2016
*/

public class BrainPhoto {

	public static void main(String[] args) {
		Scanner kbd=new Scanner(System.in);
		int row = kbd.nextInt();
		int col = kbd.nextInt();
		String out;
		char[][] item = new char[row][col];
		boolean result=false;
		
		for(int r=0;r<row;r++){	
			for(int c=0;c<col;c++){			
			item[r][c]=kbd.next().charAt(0);
			}
		}
		result=getPhoto(row, col, item);
		kbd.close();	
		if(result)
			out="#Color";
		else
			out="#Black&White";
		System.out.println(out);


	}
	private static boolean getPhoto(int row, int col,char item[][]){
		boolean result=false;
		for(int r=0;r<row;r++){	
			
			for(int c=0;c<col;c++){			
				
				if(item[r][c]=='C'||item[r][c]=='M'||item[r][c]=='Y'){
					result=true;
					break;
				}
			}				
		}
		
		return result;
	}
}
import java.util.Scanner;

/**
*This program is will compute for the BrainPhoto Problem 
* The problem is located at codeforces.com
* 706B - Interesting drink
* Please visit the website for more info
* This problem has a problem and further help will be appreciated
*
*	@author Jacob C. Ravino
*	@version 2.1
*	@since 2016
*/
 public  class Sample {
	 public static void main(String[] args) {
         Scanner in= new Scanner(System.in);
        int shop = in.nextInt();
        int[] prices= new int[shop];

        for (int j =0 ; j < shop ; j ++) {   
            prices[j]=in.nextInt();
        }
        
        int DRINK_PLAN =in.nextInt();
        int[] coins= new int[DRINK_PLAN];
        for (int j =0 ; j < DRINK_PLAN ; j ++) {  
            coins[j]=in.nextInt();
        }
        
      int[] answer= new int[100];
    		  answer=drinking(shop, prices,DRINK_PLAN, coins);
    for (int i = 0; i < answer.length; i++) {
    	System.out.println(answer[i]);
	}
        
    }
   	

    static private int[] drinking (int SHOP, int prices[], int DRINK_PLAN, int coins[]) {		
        int answer[] = new int [DRINK_PLAN]; 
        
        for (int c = 0; c < DRINK_PLAN; c++) {
            int ctr = 0;
            while (ctr < SHOP) {
                if(coins[c] >= prices[ctr]) {
                    answer[c]++;
                }
            ctr++;
            }    
        }
		return answer;
    }

}
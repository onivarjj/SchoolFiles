/**
 * @(#)Solutions.java
 * This program consists of the compiled methods of each
 * of our programs that are solved from Codeforces.com
 *
 *
 * @author Group 3
 * @version 1.00 2016/11/2
 */
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solutions {


	
   //Hulk
   // method #01   
   /**
	* This method is all about the feelings of Dr. Bruce Banner
	* that leads him into his incredible Hulk form. If the inputted
	* data is an odd number it will have an output that is "hate" at
	* the last feeling and "love" if an even number is inputted.
	*
	*
	* @param input The positive integer value of the number of layers of love and hate
	* @return feeling The feeling that Dr. Bruce Banner feels
	*/
    public static String hulk(int input) {
    	String feeling = "";
    	if (input>0 && input<101){
        	for(int i = 1; i <= input; i++){
        		if(i%2 == 1){
        			feeling = feeling + "I hate ";
        		}else {
        			feeling = feeling + "I love ";
        		}
        		if (input>1 && i<input){
        			feeling = feeling + "that ";
        		}
        	}
        	feeling = feeling + "it";
        }
        return(feeling);
    }
    
   //Juicer
   // method #02
   /**
	* This method is all about making fresh orange juice. If the orange
	* has exceeded some size it will be thrown and continue to make one.
	* This will also determine the waste sections amount.
	*
	* @param n The positive integer value of the number of oranges to be juiced out
	* @param b The positive integer value of the maximum size of the orange that fits in the juicer
	* @param d The positive integer value of the condition when the waste section can be emptied
	* @param a The positive integer value of the sizes of oranges 
	* @return emp The positive integer value that the number of times you have to empty the waste section
	*/
	public static int juice(int n, int b, int d, int a){
		int emp = 0;
		int sum = 0;
		int[] list = new int[n];
		
		if (n >= 1 && n <=100_000 && b >= 1  && d >= 1 && d >= b && d <= 1_000_000){
	    	for (int i = 0; i < n; i++){
	     				
	     		if (a >= 1 && a <= 1_000_000){
	     			list [i] = a;
	     					
	     			if (list [i] <= b) {
	     				sum += list [i];
	     						
	     				if (sum > d) {
	     					emp++;
	     					sum = 0;		
	     				}
	     			}
	     		}			
	    	}
	    }
	    return(emp);
	}
	
   //King Moves
   // method #03
   /**
	* This method is all about the moves of the King chess piece
	* knows and where it shall go in any direction that it can go
	*
	* @param input The String value that contains the King's positon
	* @return output The number of moves the King is permitted to move
	*/
	public static int moves(String input){
		
		int output = 0;
		char column;
		char row;
		
		column = input.charAt(0);
		row = input.charAt(1);
		
		if (column == 'a' || column == 'h'){
				if (row == '1' || row == '8'){
					output = 3;
				} else{
					output = 5;
				}
			} else if (row == '1' || row == '8'){
				output = 5;
			} else{
				output = 8;
			}
			
			return(output);
	}

    
   //Crazy Computer
   // method #04
   /**
	* This method is all about counting the words typed in
	* every second ZS Coder is coding on a crazy computer
	*
	* @param first The positve integer value of the number of words ZS the Coder typed
	* @param second The positive integer value of the crazy computer delay
	* @param b The positive integer values of the second when ZS the Coder typed the words
	* @return total The positve integer value that determines the total words the Crazy Computer will remain on the screen.
	*/
    public static int crazy(int first, int second, int b){
		int total = 0;
		int a = 0;
		
		for(int i = 0; i <first; i++){
			
			if (b-a > second){
				total = 1;
			}else {
				total++;
			}
			a = b;
		}
		return(total);
	}
   
   //As Fast as Possible
   // method #05
   /**
	* This method is all about determining the minimum time required for all n pupils to reach the place of excursion.
   * 
	* @param n The number of pupils 
	* @param l The distance from meeting to the place of excursion
	* @param v1 The speed of each pupil
   * @param v2 The speed of the bust
   * @param k The number of seats in the bus
   * @return answer The minimum time in which all pupils can reach the place of excursion
	*/
   
    public double solve(int n, double l, double v1, double v2, int k) {
		double answer = 0;
		n = (n - 1) / k;
		if (n == 0) {
			return l / v2;
		} else {
			double t = l / (n * v1 + (v1 + v2) / 2);
			answer = t * n + t * (v1 + v2) / (2 * v2);
		}
		return answer;
    }
   
   //Bus to Udayland
   // method #06
   /**
   * This method determines whether ZS the Coder and Chris the Baboon can sit together
	* in a bus with n rows.
	* 
	* @param seats The status of the seats of the bus with n rows.
	* @return result Returns whether it is possible for them to sit together, including the seats available for them.
   */
   
	public String possible(String [] seats){
		boolean found = false;
		String result = "";
		
		for(int i = 0;i < seats.length;i++){
			if(seats[i].contains("OO")){
				found = true;
				seats[i] = seats[i].replaceFirst("OO", "++");
				break;
			}
		}
		
		if(found){
			result = "YES";
			
			for(int i = 0;i < seats.length;i++){
				result = result + "\n" + seats[i];
			}
		}else{
			result = "NO";
		}
		
		return result;
	}
	
   //Pythagorean Triples
   // method #7
   /**
   * This method determines the Pythogorean Triple with a single value
	* 
	* @param number The value that use to determine its Pythagorean Triple
	* @return result Will return the Pythagorean Triple of the number
   */
	
	public String PythagoreanTriples(long number){
		String results = "";
	  	long yFirst = (number/2);
	  	long ySecond = (yFirst*yFirst)-1;
	  	long yThird = (yFirst*yFirst)+1;
	  	long yHypo = (ySecond * ySecond) + (number*number);
	  	long check = yThird*yThird;
				  	
	  	long zFirst = (number*number)/2;
	  	long zSecond = zFirst;
		long zThird = zFirst+1;
				  		  	
		if(number < 3){
				System.out.println(-1);
			 }else if(yHypo == check){
			 		System.out.println(ySecond+" "+yThird);
					results = ySecond+" "+yThird;
			}else{
			  	System.out.println(zSecond+ " "+ zThird);
				results = zSecond+ " "+ zThird;
			 }	
		return results;
	} 
	
	//Filya and Homework
   // method #8
	/**
	* This method determines if it is possible to make all elements of an array equal.
	*
	* @param size The number of elements in the array.
	* @param listNumbers The elements in the array.
	* @return result Returns if it is possible to make all elements equal or not.
	*/
	
	public String checkPossible(int size, String listNumbers){
		String result = "";
		String [] numbers;
		int distinct = 0;
		int ctrl = 0;
		int [] oddNumbers = {-1,-1,-1};
		boolean found = false;
		
		numbers = new String [size];
		numbers = listNumbers.split("\\s");
		
		for(int i = 0;i < numbers.length;i++){
			for(int j = 0; j < oddNumbers.length;j++){
				if(oddNumbers[j] == Integer.parseInt(numbers[i])){
					found = true;
				}
			}

			if(!found){
				distinct++;
				
				if(distinct < 4){
					oddNumbers[ctrl] = Integer.parseInt(numbers[i]);
					ctrl++;
				} else{
					break;
				}
			}
			
			found = false;
		}
		
		Arrays.sort(oddNumbers);
		
		if(distinct < 3){
			result = "YES";
		} else if(distinct == 3){
			int temp = 0;
				
			int checkOne = 2 * oddNumbers[1];
			int checkTwo = oddNumbers[0] + oddNumbers[2];
			
			if(checkOne == checkTwo){
				result = "YES";
			} else{
				result = "NO";
			}
		} else {
			result = "NO";
		}
		
		return result;
	}

	//Interesting Drink
   // method #9
	/**
	* This method determines the number of consecutive days that Vasiliy can keep drinking the 'BeeCola' and shows that
	* he can keep drinking it on how many days and how many coins will he spend.
	*
	* @param SHOP The number of shops the Vasiliy visited .
	* @param prices array that holds the prices of each drink.
	* @param DRINK_PLAN The number of days that Vasiliy wants to keep drinking the bottle.
	* @param coins array that holds the money that Vasiliy can spend.
	* @return result Returns how many drinks can he buy in each days.
	*/
	public int[] drinking (int SHOP, int prices[], int DRINK_PLAN, int coins[]) {		
        int answer[] = new int [DRINK_PLAN]; 
        
        for (int i = 0; i < DRINK_PLAN; i++) {
            int counter = 0;
            while (counter < SHOP) {
                if(coins[i] >= prices[counter]) {
                    answer[i]++;
                }
            counter++;
            }    
        }
		return answer;
    }
	
	//Vitya in the Countryside
	// method #10
	/**
	* This method determines the position of the moon, whether up or down, from a list of days recorded by Vitya.
	* 
	* @param numberOfDays The number of days when Vitya was watching the moon.
	* @param recordedDays The list of days Vitya watched the moon.
	* @return position Returns whether the moon on the next day will be up or down.
	*/
	
	public String tellPosition(int numberOfDays, String recordedDays){
		String position = "";
		String [] days = new String [numberOfDays];

		days = recordedDays.split("\\s");
		
		if(days[days.length-1].equals("15")){
			position = "DOWN";
		} else if(days[days.length-1].equals("0")){
			position = "UP";
		} else if(numberOfDays > 1){
			if(Integer.parseInt(days[days.length-2]) > Integer.parseInt(days[days.length-1])){
				position = "DOWN";
			} else{
				position = "UP";
			}
		} else if(numberOfDays == 1){
			position = "-1";
		}
		
		return position;
	}

   
   //Anatoly Cockroaches
   // method #11
   /**
   * This method will calculate the least number of moves that Anatoly needs
	* to make the line of cockroaches in alternate order, which is based on 
	* their color (red and black.)
	* 
	* @param cockroaches Stores the total number of cockroaches in the line.
	* @param cockroachLine String that contains the order of the colored cockroaches.
	*
    */

public static int rearrangingCockroaches(int cockroaches, String cockroachLine ){
		
		//Initializing variables for counting the displaced cockroaches
        int blackCockroaches = 0;
        int redCockroaches = 0;
        
        
        //The code would count the number of black and red cockroaches
        for (int i = 0; i < cockroaches; i++) {
            if(i%2 == 0 && (cockroachLine.charAt(i)) == 'b') {
                blackCockroaches++; //Sums displaced black cockroaches
            } else if (i%2 != 0 && (cockroachLine.charAt(i)) == 'r') {
                redCockroaches++; //Sums displaced red cockroaches
            }               
        }
        
        //Getting the largest value between the two colors
        int maxDisplacedCockroaches = Math.max(blackCockroaches, redCockroaches);
        
        //Resetting the variables
        blackCockroaches = 0;
        redCockroaches = 0;
        
        //The code would check which cockroaches are misplaced
        for (int i = 0; i < cockroaches; i++) {
            //Checks if the first index and second index are the same
            if(i%2 == 0 && (cockroachLine.charAt(i)) == 'r') {
                redCockroaches++; //Sums displaced black cockroaches
            } else if (i%2 != 0 && (cockroachLine.charAt(i)) == 'b') {
                blackCockroaches++; //Sus displaced red cockroaches
            }   
            
        }
        
		//Retrieving the result
        int sequence = Math.min((Math.max(blackCockroaches, redCockroaches)), 
                maxDisplacedCockroaches);
	
		return sequence
}	

}


   //Mishka And Game
   // method #12
   /**
   * This method determines the winner between Mishka and his friend.
  	* 
	* @param points Arrays that store the points of Mishka and his friend in each rounds.
	* @param round The number of rounds that Mishka and his friend will fight.
	* @return results Returns the name of the Winner.
    */
	
	public String fighting(int points[][],int round){
		String results = "";
		int m=0, c=0;
		for (int i = 0; i < r; i++) {
			if (points[i][0] > points[i][1])
				m++;
			else if (points[i][1] > points[i][0])
				c++;
		}
		if (m > c)
			results = "Mishka";
		else if (c > m)
			results = "Chris";
		else
			results = "Friendship is magic!^^";

		return results;

	}

	//Brain Photo
   // method #13
   /**
   * This method determines if the photo is colored or black and white.
	* 
	* @param row Stores the number of photo pixel matrix in the photo in a row.
	* @param col Stores the number of photo pixel matrix in the photo in a column.
	* @param item Arrays that get the color of the photo.
	* @return out Returns the answer if the photo is colored or black and white
    */
	
	public String getPhoto(int row, int col,char item[][]){
		String out;
		boolean result=false;
		for(int r=0;r<row;r++){	
			
			for(int c=0;c<col;c++){			
				
				if(item[r][c]=='C'||item[r][c]=='M'||item[r][c]=='Y'){
					result=true;
					break;
				}
			}				
		}
		
		if(result)
			out="#Color";
		else
			out="#Black&White";
		
		return out;
	}
}     

import java.util.Scanner;
/**
 * @(#)Job.java
 * This a simple program that will compute for your Salary, Overtime salary and total working time, total overtime
 *
 *
 * @author Jacob C. Ravino
 * @version 1.00 2016/12/16
 */
public class Job{
    public static void main(String[] args){
		int repeat=1;
		int days;
		int rating;
		int overtime;
		int totalworkingtime;
		int totalovertime;
		int worksalary;
		int overtimesalary;
		int totalsalary;

		do{
			System.out.println("Please Enter how many days you worked");
			days = input();      
			
			int[] hours = new int[days];
			for (int i =0;i<hours.length;i++) {
				System.out.printf("Please Enter the total working hours for day %d \n", i);  
				hours[i]=input();   
			}
			
			System.out.println("Please Enter Salary Rating per hour");
			rating = input();
			
			System.out.println("Please Enter Overtime Rating per hour");
			overtime = input();
			
			System.out.println("Now we will compute for your Total time");
			
			totalworkingtime = computeWorkingTime(hours);
			totalovertime = computeOvertime(hours);
			
			System.out.printf(" Your total Working time :\t%2d hours \n Your total Overtime :\t\t%2d hours \n",totalworkingtime, totalovertime);
			
			worksalary = computeSalary(totalworkingtime, rating);
			overtimesalary = computeOvertimeSalary(totalovertime, overtime);
			
			System.out.printf(" Your total Working Salary :\t%2d \n Your total Overtime Salary :\t%2d  \n",worksalary, overtimesalary);
			totalsalary= worksalary+overtimesalary;
			System.out.printf(" Your overall salary is :\t%2d \n\n",totalsalary);
			System.out.println("Want to try again? enter 1 to try again");
			 repeat = input();
		}while(repeat==1);
    }
    
   
   /**
	* This Method will compute the array of input for the total working hour
	* Separating the Overtime and regular time.
	*
	*
	* @param hr The array of working hour which is 0-24 hrs per day
	* @return totalworkingtime The total computed working Time
	*/
    private static int computeWorkingTime(int[] hr){
    	
    	int totalworktime=0;
    	int regularworkingtime=8;
    	int[] extrahours =new int[hr.length];
    	
    	for(int i = 0; i < hr.length; i++){  		
    		if(hr[i] > regularworkingtime){					
				totalworktime += hr[i];	
    		} else {	
    			  totalworktime += hr[i];
    		}
    	}   	
    	return totalworktime;
    }
	
	/**
	* This Method will compute the array of input for the total Overtime
	* Separating the Overtime and regular time.
	*
	*
	* @param hr The array of working hour which is 0-24 hrs per day
	* @return totalovertime The total computed overtime separated from the regular time
	*/
    private static int computeOvertime(int[] hr){
    	
    	int totalovertime=0;
    	int regularworkingtime=8;
    	int[] exceedinghour =new int[hr.length];
    	
    	for(int i = 0 ; i < hr.length ; i++){    		
    		if(hr[i] > regularworkingtime){				
    			exceedinghour[i] = hr[i] - regularworkingtime;
    			totalovertime += exceedinghour[i];
    		} 
    	}
    	return totalovertime;
    }
    
	/**
	* This Method will compute the total salary by multiplying the
	* total Regular time and Hourly Rate
	*
	*
	* @param ttworking  The Total working time/Regular time.
	* @param workrate The Hourly Rate while in work.
	* @return computedsalary returns the computed regular salary
	*/
    private static int computeSalary(int ttworktime,int workrate){
    	
    	int computedsalary=ttworktime * workrate;
   	
    	return computedsalary;
    }
    
	/**
	* This Method will compute the total overtime by multiplying the
	* total Regular time and Hourly Rate
	*
	*
	* @param ttovertime  The Total hours of overtime
	* @param overrate The Hourly Rate while working overtime.
	* @return computedOvertime returns the computed overtime salary
	*/
    private static int computeOvertimeSalary(int ttovertime, int overrate){
    	
    	int computedOvertime=ttovertime * overrate;  	
    	
    	return computedOvertime;
    }
    
	/**
	* When Called This method will automatically create a new instance of Scanner
	* and ask for an integer input
	*
	*
	* @return input returns any integer input
	*/
    private static int input(){
		Scanner in= new Scanner(System.in);
		int input = in.nextInt();
		return input;
	}

}
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class inetAddressWithArray {

	public static void main(String[] args) {
	
	 String repeat="y";
	 int hostcounter =0;
	 do{
		hostcounter++;
		System.out.printf("Host %d - Type IP address/Hostname: " , hostcounter);
		String hostname = input();
		try {
			InetAddress[] ia = InetAddress.getAllByName(hostname);
			int hostnumber = ia.length;
			System.out.println("Number of Hosts/IPs: "+ hostnumber);
		  
			for(int i=0;i<ia.length;i++){
				System.out.println("Hostname: " + hostname);
				System.out.println("IP Address: " +ia[i] );
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		System.out.println("Search another? [y/n]");
		repeat=input();
	 }while(repeat.equalsIgnoreCase("y"));
	 
	 if(repeat.equalsIgnoreCase("n")){
		 System.out.println("BYE!!!");
	 }
		

	}
	
	public static String input(){
		Scanner in = new Scanner(System.in);
		String input=in.nextLine();
		return input;
	}

}

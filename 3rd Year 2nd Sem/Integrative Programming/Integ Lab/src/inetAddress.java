import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class inetAddress {

	public static void main(String[] args) {
	
	 String repeat="y";
	 int hostnumber =0;
	 do{
		hostnumber++;
		System.out.printf("Host %d - Type IP address/Hostname: " , hostnumber);
		String hostname = input();
		try {
			InetAddress ia = InetAddress.getByName(hostname);
			System.out.println(ia.getHostAddress());
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

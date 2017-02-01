import java.util.Scanner;
import java.io.IOException;
import java.net.*;


public class socket {

	public static void main(String[] args) {
		String site = input();
		checkSocket(site);
	}
	
	public static String input(){
		Scanner in = new Scanner(System.in);
		String input=in.nextLine();
		return input;
	}
	
	public static void checkSocket(String host){
		
		for(int i=0;i<1024;i++){
			try {
				Socket s = new Socket(host, i);
				System.out.printf("%S : %d open!! \n", host, i);
				s.close();
			} catch (UnknownHostException e) {
				System.out.printf("%S : %d is closed!\n", host, i);
			} catch (IOException e) {
				System.out.printf("%S : %d is closed!\n", host, i);
			}
			
		}	
	}

}
/** we can also use this but it has a command that included in the discussion 
 * this is to reduce timeout on checking the socket
 * This loop is for the checkSOcket method
 * 	for(int i=0;i<1024;i++){
			try {
				Socket s = new Socket();
				s.connect(new InetSocketAddress(host, i), 100); //change 100 to increase/decrease timeout. > longer < shorter time
				System.out.printf("%S :%d open!! \n", host, i);
				s.close();
			} catch (UnknownHostException e) {
				//System.out.printf("%S :%d is closed!\n", host, i);
			} catch (IOException e) {
				//System.out.printf("%S :%d is closed!\n", host, i);
			}
			
		}

 */

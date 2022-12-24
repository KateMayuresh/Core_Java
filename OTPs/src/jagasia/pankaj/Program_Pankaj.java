package jagasia.pankaj;

import java.util.Scanner;

import org.fi.utility.LinkedList;

public class Program_Pankaj
{
	static boolean running = true;;
	public static void main(String[] args) 
	{
		Scanner scanner = null;
		LinkedList<String> objList = new LinkedList<>();
		int choice = 0;
		
		try {
			scanner = new Scanner(System.in);
			while (choice != 4) {
				System.out.println("1. Start OTP Generation");
				System.out.println("2. Stop OTP Generation");
				System.out.println("3. Display all OTPs");
				System.out.println("4. Exit");

				System.out.println("Enter yoru choice");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					running = true;
					new Thread(new OtpThread(objList)).start();
					break;
				case 2:
					running = false;
					break;
				case 3:
					synchronized (objList) {
						String otp = objList.getFirst();
						while (otp != null) {
							System.out.println(otp);
							otp = objList.getNext();
						}
					}
					break;
				}
			} 
		} finally {
			// TODO: handle finally clause
			if(scanner!=null)
				scanner.close();
			
			running = false;
		}		
		

	}

}

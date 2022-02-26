package emailValidation;

import java.util.ArrayList;
import java.util.Scanner;

	public class EmailValidation {

	public static void main(String[] args) {
		
		        
		ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("janardhan.shingade@gmx.com");
        emailID.add("amar.k@gmx.com");
        emailID.add("l.harry@gmx.com");
        emailID.add("rcb.karnataka@gmx.com");
        emailID.add("hrutil.roshan@gmx.com");
        emailID.add("janu.s@gmx.com");
        emailID.add("sudeep.k@gmx.com");
        
        System.out.println("Enter email ID");
        Scanner sc = new Scanner(System.in);
		String  EmailValidation=sc.nextLine();
		
		
                for(int i=0; i<emailID.size(); i++) {
                    
                    System.out.println(emailID.get(i));
                    
                    if( EmailValidation==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println("email ID: " +  EmailValidation + " found");
                        
                        break;  
                        }
                }
    }
}
		


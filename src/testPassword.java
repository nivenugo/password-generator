import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testPassword {
	public static void main(String args[]) {
		String password="";
		 System.out.print("Please enter your string: ");
		 Scanner my_scan = new Scanner(System.in);
	     String my_str = my_scan.nextLine();
	     //System.out.println("The string is "+my_str);
	     my_scan.close();
	     
	     String str[] = my_str.split(" ");
	     List<String> al = new ArrayList<String>();
	 	
	     
	 	for(int i =0;i<str.length;i++) {
	 		if( i%2 ==0) {
	 			 al.add(str[i]);
	 		}
	 	}
	 	for (String word : al) {
	 		if(word.length()==1) {
	 			word=word+" ";
			}
			for(int i = 0;i<word.length();i++) {
				
				
				if( i%2!=0) {
					password=password+word.charAt(i);
				}
			}
		}
	 	
	 	if(password.length()<str.length) {
	 		int difference = str.length - password.length();
	 		for(int i =0;i<difference;i++) {
	 			password=password+"*";
	 		}
	 	}
	 	System.out.println("password is :'"+password+"'");
	}

}

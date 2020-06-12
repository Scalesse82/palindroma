import java.util.Scanner;

public class Palindroma {
	
	 public static boolean palindroma(String s) {
			int l=s.length();
			if (l<2)
			    return true;
			else 
			    if (!s.substring(0,1).equals(s.substring(l-1,l))) 
				return false;
			    else
				return palindroma(s.substring(1,l-1));		
		    }
			
		    public static void main(String[] args) {
		    	
			Scanner input=new Scanner(System.in);
		    System.out.println("inserisci la parola da controllare");
		    String parola=input.nextLine().replaceAll(" ", "");

		    
		    if(palindroma(parola))
		    System.out.println("palindroma");
		    else
		    System.out.println("non palindroma");
	       
		    input.close();
		    }


}

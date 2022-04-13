import java.util.HashSet; 
import java.util.TreeSet; 

public class Q2HLHS
{ 
	public static void main(String args[]) { 
		HashSet<String> names = new HashSet<String>();
		names.add("Ashok"); 
		names.add("Cindralle"); 
		names.add("Babbu"); 
		names.add("Martin"); 
		names.add("Poo"); 
		 
		System.out.println("HashSet unorder: "); 
		for(String temp:names) {
			System.out.println(temp);
		}
	    TreeSet<String> order=new TreeSet<String>(names);	
	    System.out.println("Linkedhashset Order:"+order);
	}
	
	}



package lab7;
import java.util.*;  
public class TreeMapCollection {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		// Insertion
		tmap.put(1, "saurabh");
		tmap.put(2, "nisha");
		tmap.put(3, "harsha");
		tmap.put(4, "navya");
		tmap.put(5, "ram");
		System.out.println("Insertion: ");
		for(Map.Entry m: tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Updation
		tmap.replace(3, "twinkle");
		tmap.replace(4, "rinkle");
		System.out.println("Updation: ");
		for(Map.Entry m: tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Deletion
		tmap.remove(2);
		tmap.remove(5);
		System.out.println("Deletion: ");
		for(Map.Entry m: tmap.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
	}

}
package lab7;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> numhm = new HashMap<Integer, String>();
		
		// Inserting
		numhm.put(1, "saurabh");
		numhm.put(2, "harsha");
		numhm.put(3, "nisha");
		numhm.put(4, "navya");
		numhm.put(5, "kalpesh");
		System.out.println("Insertion: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
		System.out.println();
			
		// Deleting
		numhm.remove(2);
		numhm.remove(5);
		System.out.println("Deletion: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
		System.out.println();
		
		// Replacing
		numhm.replace(3, "twinkle");
		numhm.replace(1, "rinkle");
		System.out.println("Updation: ");
		for(Map.Entry m:numhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		}
	}
}
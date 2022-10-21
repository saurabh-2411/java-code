package lab7;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCollection {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		
		// Insertion
		lhm.put(1, "saurabh");
		lhm.put(2, "harsha");
		lhm.put(3, "nisha");
		lhm.put(4, "ram");
		lhm.put(5, "raju");
		lhm.put(6, "golu");
		System.out.println("Insertion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Updation
		lhm.replace(1, "twinkle");
		lhm.replace(3, "rinkle");
		lhm.replace(5, "kalpesh");
		System.out.println("Updation: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
		// Deletion
		lhm.remove(5);
		lhm.remove(2);
		lhm.remove(4);
		System.out.println("Deletion: ");
		for(Map.Entry m: lhm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
	}

}
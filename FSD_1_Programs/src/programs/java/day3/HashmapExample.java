package programs.java.day3;
import java.util.HashMap;
import java.util.TreeMap;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"apple");
		hm.put(2,"Starfruit");
		hm.put(3,"banana");
		hm.put(4,"Kiwi");
		hm.put(null,"Orange");
		hm.put(5,"Pineapple");
		
		System.out.println("HashMap is :"+ hm);
		System.out.println("value of key 3 is :"+ hm.get(3));
		System.out.println("hashmap empty :"+ hm.isEmpty());
		
		hm.remove(2);
		
		System.out.println("HashMap after removal is :"+ hm);
		
		System.out.println("Size of hashmap isis :"+ hm.size());
		System.out.println("HashMap contains valueis :"+ hm.containsValue("Pineapple"));
		
		System.out.println("HashMap contains Key null :"+ hm.containsKey(7));
		
		
		TreeMap <String,Integer> tm = new TreeMap<String,Integer>();
		
		
		tm.put("S1",110);
		tm.put("S2",120);
		tm.put("S6",160);
		tm.put("S5",150);
		tm.put("S7",170);
		tm.put("S4",140);
	
		
		for(String key: tm.keySet()) {
			System.out.println(key+ "SValue of map :"+ tm.get(key));
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

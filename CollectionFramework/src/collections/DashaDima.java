package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DashaDima {
	
	public static void main(String[] args) {
		
		Map<String, String>allTypes=new HashMap<String, String>();
		allTypes.put("firstNane", "Anna");
		allTypes.put("lastNane", "Brown");
		allTypes.put("email", "anna@gmail.com");
		
		List<Map<String,String>>steps=new ArrayList<Map<String,String>>();
		steps.add(allTypes);
		
		List <String> al1 = new ArrayList<>();
		
		for(int i = 0; i<steps.size(); i++) {
		
			Set<Entry<String, String>> entries = (steps.get(i)).entrySet();
		
			for (Entry<String, String> each : entries) {
				al1.add(each.getValue());
			}
		
		}
		System.out.println(al1);
	}

}

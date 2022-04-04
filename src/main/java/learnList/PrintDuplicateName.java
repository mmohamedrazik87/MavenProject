package learnList;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;

public class PrintDuplicateName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
		list.add("Adam");
		//System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
		
					if(list.contains(list.get(i)))
					{System.out.println(list.get(i) + " is a duplicate");
				}
				
			}
		}

	}


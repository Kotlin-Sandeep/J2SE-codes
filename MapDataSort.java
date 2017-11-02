package com.javaqubes;
import java.util.*;
public class MapDataSort {
	public static void main(String[] args) {
		LinkedHashMap<String, String> company = new LinkedHashMap<>();
		company.put("WhatsApp", "Jan Koum");
		company.put("LinkedIn", "Reid Hoffman");
		company.put("Google", "Larry Page");
		company.put("Apple", "Steave Jobs");
		company.put("Facebook", "Mark Zuckerberg");
		company.put("Microsoft", "Bill Gates");
		TreeMap<String,String> map = new TreeMap<>(company);
		
		// Sorting by key
		for (Map.Entry<String,String> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + "------" + entry.getValue());
		}
		System.out.println("---------------------------------------------");
		
		Map<String, String> result = sortMapByValue(company);
		// Sorting by value
		for (Map.Entry<String, String> entry : result.entrySet())
		{
			System.out.println(entry.getKey() + "------" + entry.getValue());
		}
	}

	public static LinkedHashMap<String, String> sortMapByValue(LinkedHashMap<String, String> map) {
		List<Map.Entry<String, String>> companyList = new LinkedList<>(map.entrySet());

		Collections.sort(companyList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

		LinkedHashMap<String, String> result = new LinkedHashMap<>();
		for (Map.Entry<String, String> entry : companyList)
		{
			result.put(entry.getKey(), entry.getValue());
		}

		return result;
	}
}

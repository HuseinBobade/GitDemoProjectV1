package com.collectionspractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap hm= new HashMap();
		HashMap <Integer,String>hm= new HashMap<Integer,String>();
		
		hm.put(101, "John");
		hm.put(102, "Dave");
		hm.put(103, "Carter");
		hm.put(104, "Mich");
		hm.put(105, "XY");
		hm.put(103, "JZ");
		
		System.out.println(hm);
		System.out.println(hm.get(102));
		
		System.out.println(hm.remove(103));
		System.out.println(hm);
		
		System.out.println(hm.containsKey(103));
		System.out.println(hm.containsKey(101));
		
		System.out.println(hm.containsValue("Mich"));
		System.out.println(hm.containsValue("Jane"));
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.keySet());
		
		
		for(Object i:hm.keySet()) {
			
			System.out.println(i);
			
		}
		
		System.out.println(hm.values());
		
		
		for(Object i:hm.values()) {
			
			System.out.println(i);
		}
		
		
		for(Object i:hm.keySet()) {
			
			System.out.println(i+"   "+hm.get(i));
			
		}
		
		// Entry methods
		
		for(Map.Entry entry:hm.entrySet()) // 101  x
		{
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		
		//Iterator
		
		Set s=hm.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry entry1=(Entry) itr.next();
			System.out.println(entry1.getKey()+"  "+entry1.getValue());
			
		}
		
	}
}

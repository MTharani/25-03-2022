package com.maping;

import java.util.HashMap;
import java.util.Map;

public class HasMapEx {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hob=new HashMap<Integer, String>();
		hob.put(1, "thara");
		hob.put(2, "Divi");
		hob.put(3, "abi");
		hob.put(10, "mani");
		hob.put(4, "sai");
		hob.put(5, "devi");
		hob.put(8, "maha");
		System.out.println(hob);
		for(Map.Entry<Integer, String> m: hob.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}

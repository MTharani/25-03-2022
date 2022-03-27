package com.maping;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapEx {

	public static void main(String[] args)
	{
		LinkedHashMap<Integer, String> hob=new LinkedHashMap<Integer, String>();
		hob.put(1, "thara");
		hob.put(2, "Divi");
		hob.put(3, "abi");
		hob.put(6, "devi");
		hob.put(8, "maha");
		hob.put(4, "sai");
		hob.put(5, "devi");
		System.out.println(hob);
		for(Map.Entry<Integer, String> m: hob.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}


	}

}

package com.maping;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEX {

	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "thara");
		tm.put(2, "Divi");
		tm.put(3, "abi");
		tm.put(11, "maha");
		tm.put(6, "devi");
		tm.put(4, "sai");
		tm.put(5, "devi");
		System.out.println(tm);
		for(Map.Entry<Integer, String> m: tm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}

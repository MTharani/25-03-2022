package com.maping;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx2 {

	public static void main(String[] args) 
	{
		TreeMap<Long, String> edata=new TreeMap<Long, String>();
		edata.put(7563892347L, "thara");
		edata.put(7563921386L, "Devi");
		edata.put(4563792463L, "Divi");
		edata.put(6375792463L, "zhara");
		edata.put(7923952463L, "Seetha");
		edata.put(1063792463L, "sai");
		edata.put(9463744463L, "Latha");
		edata.put(8063792463L, "Mani");
		edata.put(8002792463L, "Abi");
		System.out.println(edata);
		for(Map.Entry<Long, String> m: edata.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}

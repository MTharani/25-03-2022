package com.maping;

import java.util.HashMap;
import java.util.Map;

class Book
{
	int id;
	String name, author, publish;
	int quality;
	public Book(int id, String name, String author, String publish, int quality) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publish = publish;
		this.quality = quality;
	}
	
}
public class HashBook {

	public static void main(String[] args) 
	{
	   HashMap<Integer, Book> map=new HashMap<Integer, Book>();
	   Book b1=new Book(101,"Head First Java","Kathy Sierra","Bert Batea", 8);
       Book b2= new Book(102,"Java", "joshua Bloch","Oracel",9);
       Book b3=new Book(103,"Core java","OCA java se","Orcel press",2);
       map.put(1, b1);
       map.put(3, b2);
       map.put(2, b3);
       for(Map.Entry<Integer, Book> entry:map.entrySet())
       {
    	   int key=entry.getKey();
    	   Book b=entry.getValue();
    	   System.out.println(key+"  details:");
    	   System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publish+" "+b.quality);
       }
       
	   

	}

}

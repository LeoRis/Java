package GitHub;

import java.util.*;

public class Abstract_Class {
	
	public static void main(String[] args) {
		Avtomobil a = new Avtomobil("BMW", 2010, 20000, 15, 'c', 15000);
		System.out.println(a.toString());
		System.out.println(a.presmetajCena());
		
		System.out.println();
		Brod b = new Brod("Galeb", 2000, 10000, 10, 120);
		System.out.println(b.toString());
		System.out.println(b.presmetajCena());
		
	}

}

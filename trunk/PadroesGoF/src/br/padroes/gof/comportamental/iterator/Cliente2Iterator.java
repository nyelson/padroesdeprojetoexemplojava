package br.padroes.gof.comportamental.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente2Iterator {
	public static void main(String[] args) { 
		ArrayList<Object> al = new ArrayList<Object>(); 
		al.add(new Integer(42)); 
		al.add(new String("test")); 
		al.add(new Double("-12.34"));
		
		//iteraçãp estilo for
		for(Iterator<Object> iter=al.iterator();iter.hasNext();) 
			System.out.println( iter.next() );
		
		//iteração java 5
		for(Object o:al) 
			System.out.println( o ); 
	}
}

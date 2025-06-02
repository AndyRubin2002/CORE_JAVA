package com.demo.Test;
import com.demo.interfaces.interface2;
import com.demo.interfaces.interface1;
import com.demo.interfaces.MyInterface;
import com.demo.interfaces.MyGenericInterface;
public class TestGenericInterface {

	public static void main(String[] args) {
		interface1 ob=(x,y)-> x > y ? x : y;
		System.out.println(ob.compare(10,20));
			
		interface2 ob1=(x,y)->x.length()>y.length()? x.length():y.length();
		System.out.println(ob1.compare("Hello", "Welcome"));
		
	
		MyInterface<Integer, Integer> b=(x,y)-> x>y ? x:y;
		System.out.println(b.compare(45,7));
		
		MyGenericInterface<Integer> mg1 = (x,y,arr)->{
			int s = x+y;
			for(int i=0;i<arr.length;i++) {
				s+=x+y+arr[i];
			}
			return s;
		   };
		   System.out.println("add of Integer "+mg1.add(1,2,3,45,6,9));
		
	    MyGenericInterface<String> mg2 = (x,y,arr)->{
	    	String s = x+y;
	    	for(String a1:arr) {
	    		s+=a1;  
	    	}
	    	return s;
	    };
	    System.out.println("addition of the String "+mg2.add("Hello","Welcome"));
	}
	}



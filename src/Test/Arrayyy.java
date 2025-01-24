package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Arrayyy {

	
	public static void main(String[] args) {
		Arrayyy arr= new Arrayyy() ;

//hnh
		arr.arraylist();		
	}
	//datata
	public void arraylist() {
		
		HashSet<Integer> list = new HashSet<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		
		for(Integer s :list) {
			System.out.println(s);
		}
		System.out.println("sata");
		
	}
	
	
 
	
	public void sortedarray() {
		

		int []arr= {100,200,600,500,10,20,30,50,40,80,90};
		
		for(int i=0; i<arr.length-1; i++) {
			 for(int j=0; j<arr.length-1-i ; j++) {
				 if(arr[j]>arr[j+1]) {
					 
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 
					 
				 } 
			 } 
		}
		
		for(int i=0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void copyarray() {
		  
		int []arr= {10,20,30,50,40,80,90};

		 int [] arr2= new int [arr.length];
		
		 
		 for(int i=0; i<arr.length ; i++) {
			 arr2[i]=arr[i];
		 }
		  
		 for(int i=0 ; i<arr2.length; i++) {
			 System.out.println(arr2[i]);
		 }
	}
	
	public void finding () {
		int lenghtt=-1;
		int []arr= {10,20,30,50,40,80,90};
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter number :");
	 int n =	 sc.nextInt();
			
	 for(int i=0; i<arr.length; i++) {
		 if(arr[i]==n) {
			 lenghtt=i;
			 break;
		 }
	 }
	 System.out.println("length :" + lenghtt);
		
		
	}
	
	public void aa() {
	 
		int count =1;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a value with count : " );
		
	  int numberofvalue=	sc.nextInt();
	  while (count <= numberofvalue) {
          System.out.println("Enter a value with count: " + count++);
          int a = sc.nextInt(); 
      }
	  
	}
	
	
	
	public void removeduplicate() {
		
		
		int [] arr= {100,200,300,100,20,200,300};
		
	    HashSet< Integer> a= new HashSet< >();
	   
	    	for( int x :  arr) {
	    		   a.add(x);
	    	}
	   
	    	for(int b : a) {
	    		System.out.println(b);
	    	}
	}
	
	public void reversearray() {
		
 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number count :");
		int numbers= sc.nextInt();
		
		
		int [ ] arr= new int [numbers];
		
		System.out.println("all number :");
		for(int i=0 ;i <numbers; i++) {
			 arr[i] =sc.nextInt();
		}
		System.out.println();
		
		
		System.out.println("reverse array :");
		for(int i=numbers-1 ;i >=0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		
	 
		
		
		
	}
	
	 
	
	public void randomarray () {
int  []arr =new int [ 10];
		
		Random rs= new Random();
		for(int i=0; i < arr.length ; i++) {
			arr[i]=rs.nextInt(100)+1;
		}
		
		for(int i=0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}

package app_o1_2001;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class B {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your String......");
	String s = scan.nextLine();
	int count=0,count1=0;
	for (int i = 0; i <s.length(); i++) {
		if(s.charAt(i)=='a') {
			count++;
		}else if(s.charAt(i)=='a') {
            count1++;
		}
	}
		if(count==count1) {
			System.out.println("Matchaing");
		}else {
			System.out.println("Not ");
		}
		
//		String s="aaaa";
//		int count=0;
//		for (int i = 0; i <s.length(); i++) {
//			if(s.charAt(i)=='a') {
//				System.out.print(s.charAt(i));
//				count++;
//			}
//			
//		}
//		System.out.println("");
//		System.out.println(""+count);
//		int num=11,count=0;
//		boolean isPrime=true;
//		for(int i=0;i<num;i++) {
//			if(num%2==0) {
//				System.out.println(i);
//				count++;
//				isPrime=false;
//				//break;
//			}
//		}
//		if(count==0) {
//			System.out.println("Is PrimeNumber");
//		}else {
//			System.out.println("Not");
//		}
//		List<Integer> a = Arrays.asList(1,2,3,4,5);
//	 List<Integer> c = a.stream().map(x->x+x).collect(Collectors.toList());
//		
//		System.out.println(c);
//		
		
		//		int num=111,count=0;
//		boolean flag=true;
//		for (int i =2; i <num; i++) {
//			if(num%i==0) {
//				count++;
//				flag=false;
//				break;
//			}
//			
//		}
//		if(count==0) {
//			System.out.println("prime");
//		}else {
//			System.out.println("Not Prime");
//		}
					
//		int num=11,count=0;
//		for (int i = 2; i <num; i++) {
//			if(num%i==0) {
//				count++;
//			}		
//		}
//		if(count==0) {
//			System.out.println("Prime Number");
//		}else {
//			System.out.println("Not");
//		}
//		
//		int num=10,count=0;
//		for (int i =0; i <num; i++) {
//			if(num%2==0) {
//				count++;
//			}
//		}
//		if(count==0) {
//			System.out.println("Prime Number");
//		}else {
//			System.out.println("Not Prim Number");
//		}
//		
		
	}
//	List<String> num=Arrays.asList("ajay","kumar","ajay","mike");
//		List<String> even = num.stream().sorted().collect(Collectors.toList());
//		System.out.println(even);
//			}
}

package app_o1_2001;
import java.util.Iterator;
public class A {
    public static void main(String[] args) {
    	for (int i = 0; i <5; i++) {
			for (int j = 0; j <5; j++) {
      if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==3&&j==1||i==3&&j==2||i==3&&j==3||i==1&&j==4) {
    	  System.out.print(" ");
      }else {
    	  System.out.print("*");
      }
			}
			System.out.println();
		}
//    	String s="abc";
//    	int count=0;
//    for (int i = 0; i <s.length(); i++) {
//    	if(s.charAt(i)=='a') {
//    		count++;
//    	}
//	}
//    	System.out.println(count);
//		
//    	
//    	
//    	
    	
//Scanner scan=new Scanner(System.in);
//System.out.println("Enter your String ");
//String s=scan.nextLine();
//int count=0,count1=0;
//for (int i = 0; i <s.length(); i++) {
//	if(s.charAt(i)=='(') {
//		count++;
//	}else if(s.charAt(i)==')'){
//		count1++;
//	}
//}
//if(count==count1) {
//	System.out.println("Matching");
//}else {
//	System.out.println("Not");
//}
//    			
//    	
//    	
    	
//		String s="abababa";
//		int count=0;
//		int count1=0;
//		for (int i = 0; i <s.length(); i++) {
//			if(s.charAt(i)=='a') {
//				count++;
//			}else if(s.charAt(i)=='b') {
//				count1++;
//			}
//		}
//			System.out.println(count);
//			System.out.println(count1);
	}
}

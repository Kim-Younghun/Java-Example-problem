package ex16.star;

import java.util.Scanner;

public class Program { 			
    public static void main(String[] args) {  
    	
    	int x=0;
    	int y=11;
    	
    for(int j=0; j<10; j++) {
	  	for(int i=0; i<x+1; i++)
    		System.out.printf("%c", '☆');
	  		x++;							// x축의 for문의 실행횟수를 1씩 증가시킨다. 
  		System.out.println();
  	
  		}
    
    System.out.println();
    
    for(int j=0; j<10; j++) {
	  	for(int i=0; i<y-1; i++)
    		System.out.printf("%c", '☆');
	  		y--;							// x축의 for문의 실행횟수를 1씩 증가시킨다. 
  		System.out.println();
  	
  		}
    
   }
}


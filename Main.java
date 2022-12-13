package oop2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter num of players : ");
		int n=input.nextInt();
		Player[]playerArray=new Player[n];
                float score;
                int c=0;
		
		      for(int i=0; i<n ;i++) {
		    	  System.out.println("enter score of player num "+(i+1)+" :"); 
		    	   score =input.nextFloat();
		      
		           playerArray[i]=new Player (score);
		      
		     
	}
		      System.out.println("num of the winners is :"+Player.getNo_of_winners());
}
}
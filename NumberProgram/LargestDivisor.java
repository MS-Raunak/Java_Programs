package NumberProgram;

import java.util.Scanner;

public class LargestDivisor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num a:");
		int a = sc.nextInt();
		System.out.print("Enter a num b:");
		int b = sc.nextInt();
		
		int f = 0;
		
		for(int i=1; i<=a && i<=b; i++){
			if(a%i==0 && b%i==0){
				f = i;
			}
			
		}
		System.out.println("Maximum divisor of " + a +" & " + b + " = " + f );
	}
}
package NumberProgram;

import java.util.Scanner;

class P4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int num = sc.nextInt();
		
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
				
	}
} 
/*
Enter number:5
*
* *
* * *
* * * *
* * * * *
*/

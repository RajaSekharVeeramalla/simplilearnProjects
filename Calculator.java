package dataTypeExamples;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the num-1:");
	int num1= sc.nextInt();
	System.out.println("enter the num-2:");
	int num2= sc.nextInt();
	System.out.println("select the operation to be performed:\n "
			+ "1.Addition\n" + " 2 Subtraction \n"
					+ "3. Multiplication \n" +
			"4. Division \n"+
					"5. Exit");
	int n = sc.nextInt();
	
	if(n==1) {
	int addition= num1+num2;
	System.out.println("the Addition result :" +addition);
}
	else if(n==2) {
		int subtraction= num1-num2;
		System.out.println("the Addition result :" +subtraction);
	}
		else if(n==3) {
			int multiplication= num1*num2;
			System.out.println("the Addition result :" +multiplication);
		}
			else if(n==4) {
				int division= num1/num2;
				System.out.println("the Addition result :" +division);
			}
				else
				{
				System.exit(0);	
				}
				}
	}
	

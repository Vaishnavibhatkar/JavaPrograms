package array;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionDemo{
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		try {
			int num=sc.nextInt();
			if(num>0){
				System.out.println("This is a Positive number");
			}
		}
		catch(InputMismatchException p) {
			System.out.println(" is handle by catch()");
		}
	}
}
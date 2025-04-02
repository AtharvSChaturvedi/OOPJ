import java.util.Arrays;
import java.util.Scanner;

public class Q3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int size=scanner.nextInt();
		
		int [] num=new int[size];
		
		System.out.println("Enter "+size+" numbers: ");
		for(int i=0;i<size;i++){
			System.out.print("Enter Number"+(i+1)+": ");
			num[i]=scanner.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.println("Numbers in Ascending order: ");
		for(int Num:num){
			System.out.print(Num+" ");
		}
		System.out.println(" ");
		scanner.close();
	}
}

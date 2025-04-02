import java.util.Scanner;

class Rectangle{
	double length;
	double breadth;
	
	public void read(){
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Length:");
		length=scanner.nextDouble();
		
		System.out.print("Breadth:");
		breadth=scanner.nextDouble();
	}
	
	public double Area(){
		return length*breadth;
	}
	
	public double Perimeter(){
		return 2*(length+breadth);
	}
	
	public void display(){
		System.out.println("Area:"+Area());
		System.out.println("VOL:"+Perimeter());
	}
}



public class Main{
	public static void main(String[] args){
		Rectangle rect = new Rectangle();
		rect.read();
		rect.display();
	}
}

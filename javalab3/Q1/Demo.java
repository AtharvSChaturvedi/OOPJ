class Box{
	double length;
	double width;
	double height;
	
	public Box(double length, double width, double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public double volume(){
		return length*width*height;
	}
}

public class Demo{
	public static void main(String[] args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("Length:");
		double length=scanner.nextDouble();
		
		System.out.print("Width:");
		double width=scanner.nextDouble();
		
		System.out.print("Height:");
		double height=scanner.nextDouble();
		
		Box box = new Box(length, width, height);
		
		System.out.println("VOL:"+box.volume());
	}
}



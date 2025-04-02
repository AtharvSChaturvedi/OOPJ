public class Q1{
	public static void main(String[] args){
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);
		int largest;
		if(x>=y && x>=z){
			largest=x;
		}
		else if(y>=x && y>=z){
			largest=y;
		}
		else{
			largest=z;
		}
		System.out.println("Largest number="+largest);
	}
}



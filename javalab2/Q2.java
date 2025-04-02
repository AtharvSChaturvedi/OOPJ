public class Q2{
	public static void main(String args[]){
		int odd=0;
		int even=0;
		for(int i=0;i<10;i++){
			int x=Integer.parseInt(args[i]);
			if(x%2==0){
				even=even+1;
			}
			else{
				odd=odd+1;
			}
		}
		System.out.println("Odd Numbers="+odd);
		System.out.println("Even Numbers="+even);
	}
}

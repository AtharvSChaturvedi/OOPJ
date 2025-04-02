import java.util.Scanner;
class CounterThread extends Thread{
	private int lowerRange;
	private int upperRange;

	public CounterThread(String name,int lowerRange, int upperRange){
		super(name);
		this.lowerRange=lowerRange;
		this.upperRange=upperRange;
	}

	@Override
	public void run(){
		System.out.println("Thread- "+getName());
		System.out.println("Counter- ");
		for(int i=lowerRange;i<=upperRange;i++){
			System.out.println(i+" ");
			try{
				Thread.sleep(5);
			}
			catch(InterruptedException e){
				System.out.println("Thread Interrupted: "+e.getMessage());
			}
		}
		System.out.println();
	}
}

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the name of the thread: ");
		String threadName=scanner.nextLine();
		System.out.print("Enter the lower range of counter: ");
                int lowerRange=scanner.nextInt();
		System.out.print("Enter the Upper range of counter: ");
                int upperRange=scanner.nextInt();

		CounterThread thread = new CounterThread(threadName,lowerRange,upperRange);
		thread.start();
		scanner.close();
	}
}

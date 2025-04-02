class Display{
	public synchronized void printMessage(String msg,int threadNumber){
		System.out.println("Thread: "+threadNumber+" "+msg);
	}
}

class MessageThreads extends Thread{
	private final Display display;
	private final String[] messages;
	private final int threadNumber;

	public MessageThreads(Display display, String[] messages, int threadNumber){
		this.display=display;
		this.messages=messages;
		this.threadNumber=threadNumber;
	}
	@Override
	public void run(){
		for(String msg: messages){
			display.printMessage(msg,threadNumber);
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				System.out.println("ERROR:"+e.getMessage());
			}
		}
	}
}

public class Main{
	public static void main(String[] args){
		Display display=new Display();
		String[] messages={"I","am","Invincible"};
		MessageThreads t1=new MessageThreads(display,messages,1);
		MessageThreads t2=new MessageThreads(display,messages,2);
		t1.run();
		t2.run();
	}
}

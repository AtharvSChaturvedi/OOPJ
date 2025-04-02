interface Motor{
      int capacity = 5;
      
      void run();
      void consume();
}

class WashingMachine implements Motor{
      @Override
      
      public void run(){
            System.out.println("Running");
      }
      public void consume(){
            System.out.println("Consuming Power");
      }
      
      void disp_capacity(){
            System.out.println("Capacity: "+capacity);
      }
}

public class Main{
      public static void main(String[] args){
            WashingMachine wm = new WashingMachine();
            
            wm.run();
            wm.consume();
            wm.disp_capacity();
      }
}

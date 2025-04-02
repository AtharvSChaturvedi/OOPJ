abstract class Student{
      int rollno;
      long regno;
      abstract String course();

      void getinput(int rollno, long regno){
            this.rollno=rollno;
            this.regno=regno;
      }
      
      
}

class Kiitian extends Student {
      @Override
      String course(){
            return "B.Tech. (Computer SCience & Engg)";
      }
}

public class Main{
      public static void main(String[] args){
            Kiitian kiitian = new Kiitian();
            
            kiitian.getinput(23053034, 1234567890);
            
            System.out.println("RollNo: "+kiitian.rollno);
            System.out.println("RegistrationNo: "+kiitian.regno);
            System.out.println("Course: "+kiitian.course());     
      }
}

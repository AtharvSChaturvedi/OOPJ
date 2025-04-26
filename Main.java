import java.util.*;
public class Main{
    static int array[];
    static int array2[];
    static int n;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array:");
        n=scanner.nextInt();

        int lowerbound;
        System.out.print("Enter lower bound: ");
        lowerbound=scanner.nextInt();

        int upperbound;
        System.out.print("Enter upper bound: ");
        upperbound=scanner.nextInt();

        array = new int[n];
        array2 = new int[n];
        for(int i=0;i<n;i++){
            int num=lowerbound + (int)(Math.random()*(upperbound-lowerbound+1));
            array[i]=num;
            array2[i]=num;
        }

        int lastprimeindex=-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(!isPrime(array[i]) && isPrime(array[j])){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                    lastprimeindex=i;
                    break;
                }
            }
        }
        for(int i=0;i<=lastprimeindex;i++){
            int minindex=i;
            for(int j=i+1;j<=lastprimeindex;j++){
                if(array[j]<array[minindex]){
                    minindex=j;
                }
            }
            int temp=array[i];
            array[i]=array[minindex];
            array[minindex]=temp;
        }

        for(int i=lastprimeindex+1;i<n;i++){
            int maxindex=i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[maxindex]){
                    maxindex=j;
                }
            }
            int temp=array[i];
            array[i]=array[maxindex];
            array[maxindex]=temp;
        }
        System.out.println("Array before rearrangement and sorting: ");
        System.out.println(Arrays.toString(array2));
        System.out.println("Array after rearrangement and sorting: ");
        System.out.println(Arrays.toString(array));
    }

    private static boolean isPrime (int number){
        if(number<2){
            return false;
        }
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
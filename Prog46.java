import java.util.*;

class Prog46 {
    public class Queue{
        static int[] arr;
        static int size;
        static int rear=-1;
         Queue(int n){
            arr = new int[n];
            this.size = n;
         }
         
         public static void add(int data){

         for(int i =0; i<size;i++){
            rear++;
            arr[rear]= arr[i];
         }
         }
         public static int remove(){
            if(rear == -1){
                System.out.println("queue is empty");
                return rear;
            }
            int k = arr[0];
            for(int i =0; i<rear;i++){
                arr[i]= arr[i+1];
            }
            return k;
         }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Queue q1 = new Queue(10);
        
        
    }
}

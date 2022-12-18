import java.util.Scanner;

// Define a method to Input array elements 
public class Ex6 {
    public static void main(String[] args) {
        int []a = new int[3];
        input(a);
    }
    public static void input(int[]arr){
        System.out.println("please enter an array element:");
        for(int i=0;i<arr.length;i++){
            Scanner in=new Scanner(System.in);
            arr[i]=in.nextInt();
        }
        
    }
}

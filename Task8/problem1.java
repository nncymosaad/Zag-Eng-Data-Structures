import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter the number of elements N:");
        int N = input.nextInt();
        int[] array = new int[N];
        //System.out.println("Enter the Greatest number M:");
        int M = input.nextInt();
        int[] freqarray = new int[M+1];
        //System.out.println("Enter the elements :");
        for (int i = 0; i < N; i++) {
            int temp = input.nextInt();
            if (1 <= temp && temp <= M) {
                array[i] = temp;
                freqarray[array[i]]++;
            }
        }
        //System.out.println("The Number of Repeatitions would be:");
        for(int i=1;i<=M;i++){
            System.out.println(i+":"+freqarray[i]);
        }
    }
}
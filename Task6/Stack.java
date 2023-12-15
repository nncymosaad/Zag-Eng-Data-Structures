import java.util.Arrays;

public class Stack {
    int[] arr;
    int count = 0;//acts as a pointer to the top of the stack
    int size = 0;

    public Stack(int size) {
        arr = new int[size];
        this.size = size;
    }

    public Stack() {
        arr = new int[100];
        this.size = 100;
    }
    public void push(int value){
        if(count==size)
            dublicate();
        arr[count] =value;
        count++;
    }
    public int pop(){
        if (isEmpty())
            throw new RuntimeException("the stack is empty!!");
        int temp = arr[count-1];
        arr[count-1]=0;
        count--;
        return temp;
    }
    public int peak(){
        if (isEmpty())
            throw new RuntimeException("the stack is empty!!");
        return arr[count-1];
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void dublicate() { //lazem a3mel update llsize blsize l gded kaman
            size = size * 2;  // Update the size field
            int[] newarr = new int[size ];
            copyArray(arr, newarr);
            arr = newarr;
    }
    public void copyArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

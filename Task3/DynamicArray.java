
public class DynamicArray {
      int[] arr;
    int count = 0;
    int size = 0;

    public DynamicArray(int size) {
        arr = new int[size];
        this.size = size;
    }

    public DynamicArray() {
        arr = new int[100];
        this.size = 100;
    }

    public void insert(int element) {
        if (count == size) {
            int[] newarr = new int[size * 2];
            copyArray(arr, newarr);
            arr = newarr;
        }
        arr[count] = element;
        count++;
    }

    public void print_Array() {
        for (int i = 0; i < count; i++)
            System.out.print(arr[i] + "");
        System.out.println();
    }

    public int at(int index) {
        if (isValidIndex(index))
            return arr[index];
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    public int max() {
        int max = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public int min() {
        int min = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public void removeAt(int index) {
        if (isValidIndex(index)) {
            for (int i = index; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
        } else
            throw new ArrayIndexOutOfBoundsException();
    }

    public void remove(int element) {
        if (isValidIndex(indexOf(element)))
            removeAt(indexOf(element));
        else
            System.out.println("This item is Already not found");
    }

    /////////****Frequently used Functions****/////////
    public int indexOf(int element) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }

    public Boolean isValidIndex(int index) {
        return index >= 0 && index < count;
    }

    public void copyArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

}

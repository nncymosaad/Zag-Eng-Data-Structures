import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int[] freqarray = new int[26];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= 'z' && word.charAt(i) >= 'a')
                freqarray[(word.charAt(i)) - 'a']++;
            else {
                System.out.println("you must enter lower case letters only(a-z)");
                return;
            }
        }
        for (int i = 0; i < freqarray.length; i++) {
            if (freqarray[i] != 0)
                System.out.println((char) (i + 'a') + ":" + freqarray[i]);
        }
    }
}